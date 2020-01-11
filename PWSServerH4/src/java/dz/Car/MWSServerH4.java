/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.Car;


import dz.car.MWSServer_Service;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;


/**
 *
 * @author med
 */
@WebService(serviceName = "MWSServerH4")
public class MWSServerH4 {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PWSClient/MWSServer.wsdl")
    private MWSServer_Service service;
    private double N1=0,N2=0;
    private  int N=-1,nbO,nbE;
    public static long fibo(long x) {
		if(x==0) return 0;
		if(x==1 || x==2)return 1;
		else {
		long x1=0,x2=1,x3=0;
	    	for(int i=2;i<=x;i++) {
    		x3=x1+x2;
    		x1=x2;x2=x3;}
	    	return x3;}   		
	}
    public void genereFibo (int n) {
		N=n;
                nbO=0;
                nbE=0;
		System.out.println("Valeur reçu de la part de Client="+n);
		long fibo;
		for (int i = 0; i <= N; i++) {
			fibo=fibo(i);
			if(fibo%2==0) nbE++;
			else nbO++;
		}
	}
    @WebMethod(operationName = "normeTotale")
    public String normeTotale() {
        if(N1==0 || N2==0 || N==-1)return "";
        else{
            genereFibo(N);
            double n1=N1;
            double n2=N2;
            N1=0;
            N2=0;
            N=-1;
         return show((nbE*n1)/(nbO*n2));   
        }   
    }
    @WebMethod(operationName = "setNorme1")
    public void setNorme1(@WebParam(name = "n1") double n1) {
        this.N1=n1;
    }
     @WebMethod(operationName = "setNorme2")
    public void setNorme2(@WebParam(name = "n2") double n2) {
        this.N2=n2;
    }
     @WebMethod(operationName = "setN")
    public void setN(@WebParam(name = "n2") int n) {
        this.N=n;
    }
    private String show(double name) {
        dz.car.MWSServer port = service.getMWSServerPort();
        return port.show(name);
    }   
}
