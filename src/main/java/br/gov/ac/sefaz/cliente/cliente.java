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
		
		TCSCMan man = new TCSCMan();
		/*man.setCNPJ("04034484000140");
		man.setCUF("12");
		man.setMod("65");
		man.setTpAmb("2");
		man.setVerAplic("1.00");
		man.setVersao("1.00");
		man.setTpAcao(10L);*/
		
		man.setCNPJ("04034484000140");
		man.setCUF("12");
		man.setVersao("1.00");
		man.setTpAmb("2");
		man.setVerAplic("1.00");
		man.setMod("65");
		man.setTpAcao(10L);
		
		SetConfig.getProperties();
		try {
			SetConfig.getSSL();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//instanciando para enviar minha solicitação
		SVManutencaoStub.CSCManut manunt= new SVManutencaoStub.CSCManut();
		
		//gera um xml com a classe util
		Util util = new Util();
		String xml = util.marshal(man);
		
		CccDadosMsgDownload_type0 param = new CccDadosMsgDownload_type0();
		try {
			param.setExtraElement(AXIOMUtil.stringToOM(xml));
		} catch (XMLStreamException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		manunt.setCccDadosMsgDownload(param);
		System.out.println(xml);
		
		try {
			SVManutencaoStub.CSCManutResponse resposta= new SVManutencaoStub().cSCManut(manunt);
			
			String stRespost = resposta.getCSCManutResult().getExtraElement().toString();
			System.out.println(stRespost);
			System.out.println("foi !!!");
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
