
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

    private final static QName _CalculNorme2_QNAME = new QName("http://Car.dz/", "calculNorme2");
    private final static QName _CalculNorme2Response_QNAME = new QName("http://Car.dz/", "calculNorme2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dz.car
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculNorme2 }
     * 
     */
    public CalculNorme2 createCalculNorme2() {
        return new CalculNorme2();
    }

    /**
     * Create an instance of {@link CalculNorme2Response }
     * 
     */
    public CalculNorme2Response createCalculNorme2Response() {
        return new CalculNorme2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculNorme2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "calculNorme2")
    public JAXBElement<CalculNorme2> createCalculNorme2(CalculNorme2 value) {
        return new JAXBElement<CalculNorme2>(_CalculNorme2_QNAME, CalculNorme2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculNorme2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "calculNorme2Response")
    public JAXBElement<CalculNorme2Response> createCalculNorme2Response(CalculNorme2Response value) {
        return new JAXBElement<CalculNorme2Response>(_CalculNorme2Response_QNAME, CalculNorme2Response.class, null, value);
    }

}
