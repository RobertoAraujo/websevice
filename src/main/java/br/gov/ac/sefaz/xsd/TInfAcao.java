//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.05.07 às 10:25:18 AM COT 
//


package br.gov.ac.sefaz.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de TInfAcao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TInfAcao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cIdCSC" type="{http://www.portalfiscal.inf.br/nfe}TCIdCSC"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TInfAcao", propOrder = {
    "cIdCSC"
})
public class TInfAcao {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cIdCSC;

    /**
     * Obtém o valor da propriedade cIdCSC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIdCSC() {
        return cIdCSC;
    }

    /**
     * Define o valor da propriedade cIdCSC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIdCSC(String value) {
        this.cIdCSC = value;
    }

}
