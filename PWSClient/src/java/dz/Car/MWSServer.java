/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.Car;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author med
 */
@WebService(serviceName = "MWSServer")
public class MWSServer {
    
     @WebMethod(operationName = "show")
    public String show(@WebParam(name = "name") double N) {
        return "Norme-Totale = " + N + " !";
    }  
}
