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


<form action="/user/add" method="post">
  <input type="hidden" name="id" value="${user.id}" /><br/>
  Login: <input type="text" name="name" value="${user.login}"/><br/>
  First name: <input type="text" name="firstName" value="${user.firstName}"/><br/>
  E-mail: <input type="text" name="email" value="${user.email}"/><br/>
  Last name: <input type="text" name="lastName"/><br/>
  Middle name: <input type="text" name="middleName"/><br/>
  Age: <input type="text" name="age"/><br/>
  <input type="submit" name="add" value="Add"/>
</form>


</body>
</html>
