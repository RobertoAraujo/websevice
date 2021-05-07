//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.05.07 às 10:25:18 AM COT 
//


package br.gov.ac.sefaz.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.ac.sefaz.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CSCMan_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "CSCMan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.ac.sefaz.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TCSCMan }
     * 
     */
    public TCSCMan createTCSCMan() {
        return new TCSCMan();
    }

    /**
     * Create an instance of {@link TInfCSC }
     * 
     */
    public TInfCSC createTInfCSC() {
        return new TInfCSC();
    }

    /**
     * Create an instance of {@link TInfAcao }
     * 
     */
    public TInfAcao createTInfAcao() {
        return new TInfAcao();
    }

    /**
     * Create an instance of {@link TRetCSCMan }
     * 
     */
    public TRetCSCMan createTRetCSCMan() {
        return new TRetCSCMan();
    }

    /**
     * Create an instance of {@link TInfCarga }
     * 
     */
    public TInfCarga createTInfCarga() {
        return new TInfCarga();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCSCMan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "CSCMan")
    public JAXBElement<TCSCMan> createCSCMan(TCSCMan value) {
        return new JAXBElement<TCSCMan>(_CSCMan_QNAME, TCSCMan.class, null, value);
    }

}
