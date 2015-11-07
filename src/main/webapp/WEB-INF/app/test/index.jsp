<%-- 
    Document   : index
    Created on : 24/10/2015, 11:28:02 AM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>${titulo}</h1>
        <p>${texto}</p>

        <form action="${pageContext.request.contextPath}/parametros" method="post" > 


            <input type="text" name="nombre" placeholder="&nbsp Nombre" required> 
            <br>
            <br>
            <input type="text" name="apellido" placeholder="&nbsp Apellidos" required> 
     
            <br>
            <br>
            <input type="submit" value="Grabar" > 
            <br>
            <br>


        </form> 
        
        <form action="${pageContext.request.contextPath}/binding" method="post" > 


            <input type="text" name="nombre" placeholder="&nbsp Nombre" required> 
            <br>
            <br>
            <input type="text" name="apellido" placeholder="&nbsp Apellidos" required> 
            <br>
            <br>
      
            <input type="submit" value="Grabar" > 
            <br>
            <br>


        </form> 
    </body>
</html>
