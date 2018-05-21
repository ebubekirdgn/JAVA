<%-- 
    Document   : cevap
    Created on : Apr 12, 2018, 7:30:19 PM
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
        <h1>Hello World!</h1>
        
        <%
            
          HttpSession oturum = request.getSession();
          String kullanici = request.getParameter("isim");
          String sifre = request.getParameter("sifre");
          out.print("Adınız : " + kullanici + "Sifreniz : " +sifre );
          oturum.setAttribute("oturumismi", kullanici );
        %>
    </body>
</html>
