<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Contact List</h1>
            <table border="1">
                <th>No</th>
                <th>id</th>
                <th>Rol</th>
                <c:forEach var="rol" items="${rolList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${rol.rolId}</td>
                    <td>${rol.nbRol}</td>
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>
