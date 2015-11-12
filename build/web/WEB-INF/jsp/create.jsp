<%-- 
    Document   : create
    Created on : Nov 11, 2015, 1:22:17 AM
    Author     : hoang
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dang ky</title>
    </head>
    <body>
        <h1>Dang ky</h1>
        <form:form method="post"  action="./addProcess.html" commandName="user">
            ID       <form:input path="id"/>
            Username <form:input path="username"/>
            Password <form:password path="password"/>
            <input type="submit" value="Sign Up"/>              
        </form:form>
            ${traloi}
           
    </body>
</html>
