<%-- 
    Document   : other
    Created on : Apr 12, 2018, 7:42:33 PM
    Author     : EbubekirDogan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        HttpSession oturum = request.getSession(); // session degeri alındır
        String isim =(String) oturum.getAttribute("oturumismi");
       out.print("Oturumdan gelen isim :" + isim);
            %>
    </body>
</html>
