<%-- 
    Document   : principal
    Created on : 31/10/2015, 12:25:19 PM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>Bienvenido a la Tienda de Comercio Electrónico</h1>
        <h2>${mensaje}</h2>
        <h4><a href="<%=request.getContextPath()%>/ventas/principal">Vendedor</a></
            h4>
            <h4><a href="<%=request.getContextPath()%>/adm/principal">Administrador</
                    a></h4>
    </body>
</html>