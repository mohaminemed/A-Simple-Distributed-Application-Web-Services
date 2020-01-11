
package dz.car;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MWSServerH3", targetNamespace = "http://Car.dz/", wsdlLocation = "http://localhost:8080/PWSServerH3/MWSServerH3?wsdl")
public class MWSServerH3_Service
    extends Service
{

    private final static URL MWSSERVERH3_WSDL_LOCATION;
    private final static WebServiceException MWSSERVERH3_EXCEPTION;
    private final static QName MWSSERVERH3_QNAME = new QName("http://Car.dz/", "MWSServerH3");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/PWSServerH3/MWSServerH3?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MWSSERVERH3_WSDL_LOCATION = url;
        MWSSERVERH3_EXCEPTION = e;
    }

    public MWSServerH3_Service() {
        super(__getWsdlLocation(), MWSSERVERH3_QNAME);
    }

    public MWSServerH3_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MWSSERVERH3_QNAME, features);
    }

    public MWSServerH3_Service(URL wsdlLocation) {
        super(wsdlLocation, MWSSERVERH3_QNAME);
    }

    public MWSServerH3_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MWSSERVERH3_QNAME, features);
    }

    public MWSServerH3_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MWSServerH3_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MWSServerH3
     */
    @WebEndpoint(name = "MWSServerH3Port")
    public MWSServerH3 getMWSServerH3Port() {
        return super.getPort(new QName("http://Car.dz/", "MWSServerH3Port"), MWSServerH3.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MWSServerH3
     */
    @WebEndpoint(name = "MWSServerH3Port")
    public MWSServerH3 getMWSServerH3Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://Car.dz/", "MWSServerH3Port"), MWSServerH3.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MWSSERVERH3_EXCEPTION!= null) {
            throw MWSSERVERH3_EXCEPTION;
        }
        return MWSSERVERH3_WSDL_LOCATION;
    }

}