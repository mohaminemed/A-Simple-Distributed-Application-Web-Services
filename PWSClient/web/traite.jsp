<%-- 
    Document   : traite
    Created on : 15 déc. 2019, 17:15:59
    Author     : med
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	dz.car.MWSServerH2_Service service = new dz.car.MWSServerH2_Service();
	dz.car.MWSServerH2 port = service.getMWSServerH2Port();
	 // TODO initialize WS operation arguments here
          int n=Integer.parseInt(request.getParameter("n"));
	java.util.List<java.lang.Integer> tab = new ArrayList<Integer>(n);
        for (int idx = 0; idx < n; idx++) {    
             tab.add(Integer.parseInt(request.getParameter("n"+(idx+1))));    
             }
	// TODO process result here
	java.lang.String result = port.calculNorme1(tab);
	out.println("<center>Norme -1 = "+result+"</center>");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	dz.car.MWSServerH3_Service service = new dz.car.MWSServerH3_Service();
	dz.car.MWSServerH3 port = service.getMWSServerH3Port();
	 // TODO initialize WS operation arguments here
	 int n=Integer.parseInt(request.getParameter("n"));
	java.util.List<java.lang.Integer> tab = new ArrayList<Integer>(n);
        for (int idx = 0; idx < n; idx++) {    
             tab.add(Integer.parseInt(request.getParameter("n"+(idx+1))));    
             }
	// TODO process result here
	java.lang.String result = port.calculNorme2(tab);
	out.println("<center>Norme -2 = "+result+"</center>");

    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	dz.car.MWSServerH4_Service service = new dz.car.MWSServerH4_Service();
	dz.car.MWSServerH4 port = service.getMWSServerH4Port();
	 // TODO initialize WS operation arguments here
	int n3 =Integer.parseInt(request.getParameter("n"));
	port.setN(n3);
       
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	dz.car.MWSServerH4_Service service = new dz.car.MWSServerH4_Service();
	dz.car.MWSServerH4 port = service.getMWSServerH4Port();
	// TODO process result here
	java.lang.String result = port.normeTotale();
	out.println("<center>"+result+"</center>");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
