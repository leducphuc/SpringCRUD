<%-- 
    Document   : info
    Created on : Nov 11, 2015, 1:39:44 AM
    Author     : hoang
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Danh sach user</h3>
        <table border="1" >
            <tr>
                <td class="heading"> Id</td>
                <td class="heading"> Name</td>
            </tr>
            <c:forEach var ="s" items="${list}">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.username}</td>

                    <td><a href="/DemoSpring/user_form/editUser/${s.id}.html">edit</a></td>
                    <td><a href="deleteUser/${s.id}">delete</a></td>
                </tr>

            </c:forEach>
            <tr><td colspan="7"><a href="./add.htm">Add New User</a></td></tr>  
        </table>
        Dau tien: ${dautien.id}
    </body>
</html>
