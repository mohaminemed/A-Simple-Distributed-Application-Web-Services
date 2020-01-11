
package dz.car;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dz.car package. 
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

    private final static QName _CalculNorme1_QNAME = new QName("http://Car.dz/", "calculNorme1");
    private final static QName _CalculNorme1Response_QNAME = new QName("http://Car.dz/", "calculNorme1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dz.car
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculNorme1 }
     * 
     */
    public CalculNorme1 createCalculNorme1() {
        return new CalculNorme1();
    }

    /**
     * Create an instance of {@link CalculNorme1Response }
     * 
     */
    public CalculNorme1Response createCalculNorme1Response() {
        return new CalculNorme1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculNorme1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "calculNorme1")
    public JAXBElement<CalculNorme1> createCalculNorme1(CalculNorme1 value) {
        return new JAXBElement<CalculNorme1>(_CalculNorme1_QNAME, CalculNorme1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculNorme1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "calculNorme1Response")
    public JAXBElement<CalculNorme1Response> createCalculNorme1Response(CalculNorme1Response value) {
        return new JAXBElement<CalculNorme1Response>(_CalculNorme1Response_QNAME, CalculNorme1Response.class, null, value);
    }

}
