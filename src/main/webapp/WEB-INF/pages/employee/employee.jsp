<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>List of all Employees</title>
</head>
<body>
<H1>List of all Employees!</H1>
<a href="/supermarket/">Return to main page</a>
<br>
<b><a href="/supermarket/addNewEmployee">Add new Employee</a></b>
<c:if test="${!empty listEmployees}">
    <table>
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Surename</td>
            <td>Department</td>
            <td>Specialisation</td>
        </tr>
        <c:forEach items="${listEmployees}" var="employee">
            <tr>
                <td>${employee.idEmployee}</td>
                <td>${employee.nameEmployee}</td>
                <td>${employee.surenameEmployee}</td>
                <td>${employee.departmentEmployee.nameDepartment}</td>
                <td>${employee.specialisation.nameSpecialisation}</td>
                <td>
                    <a href="/supermarket/editEmployee/${employee.idEmployee}">Edit employee</a>
                </td>
                <td>
                    <a href="/supermarket/removeEmployee/${employee.idEmployee}">Delete employee</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<c:if test="${empty listEmployees}">
    <h4>Employees not found!</h4>
</c:if>
</body>
</html>
