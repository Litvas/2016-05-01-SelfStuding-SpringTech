<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
<jsp:useBean id="employee" scope="request" type="com.springapp.supermarket.entity.Employee"/>

<a href="/supermarket/">Return to main page</a>

<h1>Edit employee!</h1>

<form action="/supermarket/updateEmployee" method="post">
    <table>
        <tr hidden="hidden">
            <td><input hidden="hidden" name="idEmployee" value="${employee.idEmployee}"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input name="name" value="${employee.nameEmployee}"></td>
        </tr>
        <tr>
            <td>Surename</td>
            <td><input name="surename" value="${employee.surenameEmployee}"></td>
        </tr>
        <tr>
            <td>Department</td>
            <td>
                <select path="nameDepartment" name="nameDepartment">
                    <option>${employee.departmentEmployee.nameDepartment}</option>
                    <c:forEach items="${listDepartment}" var="department">
                        <option>${department.nameDepartment}</option>
                    </c:forEach>
                </select>
        </tr>
        <tr>
            <td>Specialisation</td>
            <td>
                <select path="nameSpecialisation" name="nameSpecialisation">
                    <option>${employee.specialisation.nameSpecialisation}</option>
                    <c:forEach items="${listSpecialisation}" var="specialisation">
                        <option>${specialisation.nameSpecialisation}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Update Employee"></td>
        </tr>
    </table>
</form>
</body>
</html>
