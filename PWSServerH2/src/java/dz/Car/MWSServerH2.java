/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.Car;


import dz.car.MWSServerH4_Service;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author med
 */
@WebService(serviceName = "MWSServerH2")
public class MWSServerH2 {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PWSServerH4/MWSServerH4.wsdl")
    private MWSServerH4_Service service;
    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    private void setNorme1(double n1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        dz.car.MWSServerH4 port = service.getMWSServerH4Port();
        port.setNorme1(n1);
    }

    private String normeTotale() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        dz.car.MWSServerH4 port = service.getMWSServerH4Port();
        return port.normeTotale();
    }

    /**
     * Web service operation
     * @param tab
     * @return 
     */
    @WebMethod(operationName = "calculNorme1")
    public String calculNorme1(@WebParam(name = "tab") ArrayList<Integer> str) {
        //TODO write your implementation code here:
         double som=0;
        for (int i = 0; i < str.size(); i++) {
            Integer get = Math.abs(str.get(i));
            som=som+get*get;
            }
            setNorme1(Math.sqrt(som));
            normeTotale();
    
          return Math.sqrt(som)+""; 
           
    }     
}   

