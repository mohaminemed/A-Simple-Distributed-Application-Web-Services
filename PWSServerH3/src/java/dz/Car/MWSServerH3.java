/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.Car;

import dz.car.MWSServerH4_Service;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author med
 */
@WebService(serviceName = "MWSServerH3")
public class MWSServerH3 {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PWSServerH4/MWSServerH4.wsdl")
    private MWSServerH4_Service service;

    /**
     * This is a sample web service operation
     */
   
  @WebMethod(operationName = "calculNorme2")
    public String calculNorme2(@WebParam(name = "tab") ArrayList<Integer> str) {
        //TODO write your implementation code here:
          double max=-1;
        for (int i = 0; i < str.size(); i++) {
            Integer get = Math.abs(str.get(i));
            if(get>max)max=get;
            }
            setNorme2(max);
            normeTotale();
    
          return max+""; 
    } 
    private void setNorme2(double n2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        dz.car.MWSServerH4 port = service.getMWSServerH4Port();
        port.setNorme2(n2);
    }

    private String normeTotale() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        dz.car.MWSServerH4 port = service.getMWSServerH4Port();
        return port.normeTotale();
    }
    
}
