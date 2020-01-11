
package dz.car;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MWSServerH4", targetNamespace = "http://Car.dz/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MWSServerH4 {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "genereFibo", targetNamespace = "http://Car.dz/", className = "dz.car.GenereFibo")
    @ResponseWrapper(localName = "genereFiboResponse", targetNamespace = "http://Car.dz/", className = "dz.car.GenereFiboResponse")
    @Action(input = "http://Car.dz/MWSServerH4/genereFiboRequest", output = "http://Car.dz/MWSServerH4/genereFiboResponse")
    public void genereFibo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "normeTotale", targetNamespace = "http://Car.dz/", className = "dz.car.NormeTotale")
    @ResponseWrapper(localName = "normeTotaleResponse", targetNamespace = "http://Car.dz/", className = "dz.car.NormeTotaleResponse")
    @Action(input = "http://Car.dz/MWSServerH4/normeTotaleRequest", output = "http://Car.dz/MWSServerH4/normeTotaleResponse")
    public String normeTotale();

    /**
     * 
     * @param n1
     */
    @WebMethod
    @RequestWrapper(localName = "setNorme1", targetNamespace = "http://Car.dz/", className = "dz.car.SetNorme1")
    @ResponseWrapper(localName = "setNorme1Response", targetNamespace = "http://Car.dz/", className = "dz.car.SetNorme1Response")
    @Action(input = "http://Car.dz/MWSServerH4/setNorme1Request", output = "http://Car.dz/MWSServerH4/setNorme1Response")
    public void setNorme1(
        @WebParam(name = "n1", targetNamespace = "")
        double n1);

    /**
     * 
     * @param n2
     */
    @WebMethod
    @RequestWrapper(localName = "setNorme2", targetNamespace = "http://Car.dz/", className = "dz.car.SetNorme2")
    @ResponseWrapper(localName = "setNorme2Response", targetNamespace = "http://Car.dz/", className = "dz.car.SetNorme2Response")
    @Action(input = "http://Car.dz/MWSServerH4/setNorme2Request", output = "http://Car.dz/MWSServerH4/setNorme2Response")
    public void setNorme2(
        @WebParam(name = "n2", targetNamespace = "")
        double n2);

    /**
     * 
     * @param n2
     */
    @WebMethod
    @RequestWrapper(localName = "setN", targetNamespace = "http://Car.dz/", className = "dz.car.SetN")
    @ResponseWrapper(localName = "setNResponse", targetNamespace = "http://Car.dz/", className = "dz.car.SetNResponse")
    @Action(input = "http://Car.dz/MWSServerH4/setNRequest", output = "http://Car.dz/MWSServerH4/setNResponse")
    public void setN(
        @WebParam(name = "n2", targetNamespace = "")
        int n2);

}