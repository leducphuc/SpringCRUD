<%-- 
    Document   : login
    Created on : Nov 13, 2015, 8:24:45 PM
    Author     : hoang
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <h1>Dang Nhap</h1>
        <form:form method="post"  action="./check.html" commandName="user">
            Username <form:input path="username"/>
            Password <form:password path="password"/>
            <input type="submit" value="login"/>
        </form:form>
    </body>
</html>
