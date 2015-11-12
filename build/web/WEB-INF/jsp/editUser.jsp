<%-- 
    Document   : editUser
    Created on : Nov 12, 2015, 12:39:48 AM
    Author     : hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit User</title>
    </head>
    <body>
        <h1>Edit User </h1>
        ${user.id}
        ${user.username}
        ${user.password}
        
        <form:form method="post"  action="./updateUser.html" commandName="user">
            ID <form:input path="id"/>
            Name <form:input path="username"/>
            Password <form:input path="password"/>
            <input type="submit" value="submit"/>
        </form:form>
    </body>
</html>
