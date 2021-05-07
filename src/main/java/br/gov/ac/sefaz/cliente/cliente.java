package br.gov.ac.sefaz.cliente;

import java.rmi.RemoteException;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.AxisFault;

import br.gov.ac.sefaz.classes.util.Util;
import br.gov.ac.sefaz.util.tools.config.SetConfig;
import br.gov.ac.sefaz.wsdl.SVManutencaoStub;
import br.gov.ac.sefaz.wsdl.SVManutencaoStub.CccDadosMsgDownload_type0;
import br.gov.ac.sefaz.xsd.TCSCMan;

public class cliente {

	public static void main(String[] args) {
		// instanciação da clase CSCMan setando os valores 
		TCSCMan man = new TCSCMan();		
		man.setCNPJ("04034484000140");
		man.setCUF("12");
		man.setVersao("1.00");
		man.setTpAmb("2");
		man.setVerAplic("1.00");
		man.setMod("65");
		man.setTpAcao(10L);
		
		Util util = new Util();
		String xml = util.marshal(man);
		
		// configuraçãodo Properties
		try {
			SetConfig.getProperties();
			SetConfig.getSSL();
		} catch (Exception e) {
			e.printStackTrace();
		}		

		try {
			// envia um solicitação
			SVManutencaoStub.CSCManut manunt= new SVManutencaoStub.CSCManut();
			CccDadosMsgDownload_type0 param = new CccDadosMsgDownload_type0();
			param.setExtraElement(AXIOMUtil.stringToOM(xml));
			manunt.setCccDadosMsgDownload(param);
			
			// resposta da solicitação
			SVManutencaoStub.CSCManutResponse resposta= new SVManutencaoStub().cSCManut(manunt);
			String stRespost = resposta.getCSCManutResult().getExtraElement().toString();
			System.out.println(stRespost);
			System.out.println("foi !!!");
		} catch (AxisFault e) {
			System.out.println("Erro !");
			e.printStackTrace();
		} catch (RemoteException e) {
			System.out.println("Erro !!");
			e.printStackTrace();
		} catch (XMLStreamException e) {
			System.out.println("Erro !!!");
			e.printStackTrace();
		}
	}

}
