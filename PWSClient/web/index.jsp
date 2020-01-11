<%-- 
    Document   : index
    Created on : 15 déc. 2019, 17:12:51
    Author     : med
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>   
    <center>
         <h1>Hello I'm The Client !!</h1>
      <div>
        <input type="number"  id="n" placeholder="N" required><br><br>
        <button onclick="creTab();">Ok</button><br><br>
      </div>
     <script type="text/javascript">
	   function creTab() {
            document.getElementById('form').innerHTML='';
	    var value1 = document.getElementById('n').value;
	    document.getElementById('form').innerHTML=document.getElementById('form').innerHTML
                                +'<br><br><input type="number"  name="n" value="'+value1+'" required><br><br>';
            for (var i = 0; i < value1; i++) {
              document.getElementById('form').innerHTML=document.getElementById('form').innerHTML
                      +'<input type="number"  name="n'+(i+1)+'" placeholder="value'+(i+1)+'" required><br><br>';
            } 
            document.getElementById('form').innerHTML=document.getElementById('form').innerHTML
                    +'<input type="submit" name="send" value="send" >';
            
		}
	</script>
        <form class="form" id="form" method="post"  action="traite.jsp">             
	</form>
    </center> 
    </body>
</html>

	

