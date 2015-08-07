<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 06.07.2015
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>

  <style>
    table, th, td {
      border: 1px solid black;
    }
  </style>

</head>
<body>
USER LIST

<table>
  <thead>
  <tr>
    <th>Id</th>
    <th>login</th>
    <th>firstName</th>
    <th>E-mail</th>
    <th>Действие</th>
  </tr>
  </thead>


  <tbody>

  <c:forEach items="${requestScope.userList}" var="usr">
    <tr>
      <td><c:out value="${usr.id}"></c:out></td>
      <td><c:out value="${usr.login}"></c:out></td>
      <td><c:out value="${usr.firstName}"></c:out></td>
      <td><c:out value="${usr.email}"></c:out></td>
      <td>
        <a href ="${pageContext.servletContext.contextPath}/user/edit?id=${usr.id}">Edit</a>
        <a href ="${pageContext.servletContext.contextPath}/user/delete?id=${usr.id}">Delete</a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<a href=${pageContext.servletContext.contextPath}"/addUser.jsp">add new user</a>
</body>
</html>