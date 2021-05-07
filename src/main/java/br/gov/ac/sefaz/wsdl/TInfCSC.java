//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.04.23 às 04:30:04 PM COT 
//


package br.gov.ac.sefaz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de TInfCSC complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TInfCSC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cIdCSC" type="{http://www.portalfiscal.inf.br/nfe}TCIdCSC"/>
 *         &lt;element name="dIniVig" type="{http://www.portalfiscal.inf.br/nfe}TData" minOccurs="0"/>
 *         &lt;element name="dFimVig" type="{http://www.portalfiscal.inf.br/nfe}TData" minOccurs="0"/>
 *         &lt;element name="CSC" type="{http://www.portalfiscal.inf.br/nfe}TCSC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TInfCSC", propOrder = {
    "cIdCSC",
    "dIniVig",
    "dFimVig",
    "csc"
})
public class TInfCSC {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cIdCSC;
    protected String dIniVig;
    protected String dFimVig;
    @XmlElement(name = "CSC")
    protected String csc;

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

    /**
     * Obtém o valor da propriedade dIniVig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIniVig() {
        return dIniVig;
    }

    /**
     * Define o valor da propriedade dIniVig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIniVig(String value) {
        this.dIniVig = value;
    }

    /**
     * Obtém o valor da propriedade dFimVig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFimVig() {
        return dFimVig;
    }

    /**
     * Define o valor da propriedade dFimVig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFimVig(String value) {
        this.dFimVig = value;
    }

    /**
     * Obtém o valor da propriedade csc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSC() {
        return csc;
    }

    /**
     * Define o valor da propriedade csc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSC(String value) {
        this.csc = value;
    }

}
