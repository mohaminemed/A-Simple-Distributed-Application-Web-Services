
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

    private final static QName _GenereFibo_QNAME = new QName("http://Car.dz/", "genereFibo");
    private final static QName _GenereFiboResponse_QNAME = new QName("http://Car.dz/", "genereFiboResponse");
    private final static QName _NormeTotale_QNAME = new QName("http://Car.dz/", "normeTotale");
    private final static QName _NormeTotaleResponse_QNAME = new QName("http://Car.dz/", "normeTotaleResponse");
    private final static QName _SetN_QNAME = new QName("http://Car.dz/", "setN");
    private final static QName _SetNResponse_QNAME = new QName("http://Car.dz/", "setNResponse");
    private final static QName _SetNorme1_QNAME = new QName("http://Car.dz/", "setNorme1");
    private final static QName _SetNorme1Response_QNAME = new QName("http://Car.dz/", "setNorme1Response");
    private final static QName _SetNorme2_QNAME = new QName("http://Car.dz/", "setNorme2");
    private final static QName _SetNorme2Response_QNAME = new QName("http://Car.dz/", "setNorme2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dz.car
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenereFibo }
     * 
     */
    public GenereFibo createGenereFibo() {
        return new GenereFibo();
    }

    /**
     * Create an instance of {@link GenereFiboResponse }
     * 
     */
    public GenereFiboResponse createGenereFiboResponse() {
        return new GenereFiboResponse();
    }

    /**
     * Create an instance of {@link NormeTotale }
     * 
     */
    public NormeTotale createNormeTotale() {
        return new NormeTotale();
    }

    /**
     * Create an instance of {@link NormeTotaleResponse }
     * 
     */
    public NormeTotaleResponse createNormeTotaleResponse() {
        return new NormeTotaleResponse();
    }

    /**
     * Create an instance of {@link SetN }
     * 
     */
    public SetN createSetN() {
        return new SetN();
    }

    /**
     * Create an instance of {@link SetNResponse }
     * 
     */
    public SetNResponse createSetNResponse() {
        return new SetNResponse();
    }

    /**
     * Create an instance of {@link SetNorme1 }
     * 
     */
    public SetNorme1 createSetNorme1() {
        return new SetNorme1();
    }

    /**
     * Create an instance of {@link SetNorme1Response }
     * 
     */
    public SetNorme1Response createSetNorme1Response() {
        return new SetNorme1Response();
    }

    /**
     * Create an instance of {@link SetNorme2 }
     * 
     */
    public SetNorme2 createSetNorme2() {
        return new SetNorme2();
    }

    /**
     * Create an instance of {@link SetNorme2Response }
     * 
     */
    public SetNorme2Response createSetNorme2Response() {
        return new SetNorme2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenereFibo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "genereFibo")
    public JAXBElement<GenereFibo> createGenereFibo(GenereFibo value) {
        return new JAXBElement<GenereFibo>(_GenereFibo_QNAME, GenereFibo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenereFiboResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "genereFiboResponse")
    public JAXBElement<GenereFiboResponse> createGenereFiboResponse(GenereFiboResponse value) {
        return new JAXBElement<GenereFiboResponse>(_GenereFiboResponse_QNAME, GenereFiboResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormeTotale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "normeTotale")
    public JAXBElement<NormeTotale> createNormeTotale(NormeTotale value) {
        return new JAXBElement<NormeTotale>(_NormeTotale_QNAME, NormeTotale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormeTotaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "normeTotaleResponse")
    public JAXBElement<NormeTotaleResponse> createNormeTotaleResponse(NormeTotaleResponse value) {
        return new JAXBElement<NormeTotaleResponse>(_NormeTotaleResponse_QNAME, NormeTotaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "setN")
    public JAXBElement<SetN> createSetN(SetN value) {
        return new JAXBElement<SetN>(_SetN_QNAME, SetN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "setNResponse")
    public JAXBElement<SetNResponse> createSetNResponse(SetNResponse value) {
        return new JAXBElement<SetNResponse>(_SetNResponse_QNAME, SetNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNorme1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "setNorme1")
    public JAXBElement<SetNorme1> createSetNorme1(SetNorme1 value) {
        return new JAXBElement<SetNorme1>(_SetNorme1_QNAME, SetNorme1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNorme1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "setNorme1Response")
    public JAXBElement<SetNorme1Response> createSetNorme1Response(SetNorme1Response value) {
        return new JAXBElement<SetNorme1Response>(_SetNorme1Response_QNAME, SetNorme1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNorme2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "setNorme2")
    public JAXBElement<SetNorme2> createSetNorme2(SetNorme2 value) {
        return new JAXBElement<SetNorme2>(_SetNorme2_QNAME, SetNorme2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNorme2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Car.dz/", name = "setNorme2Response")
    public JAXBElement<SetNorme2Response> createSetNorme2Response(SetNorme2Response value) {
        return new JAXBElement<SetNorme2Response>(_SetNorme2Response_QNAME, SetNorme2Response.class, null, value);
    }

}
