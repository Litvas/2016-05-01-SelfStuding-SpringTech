<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>List of all departments</title>
</head>
<body>
<H1>List of all departments!</H1>
<table>

    <%--Head of table--%>
    <tr>
        <td>Name of departments</td>
        <td>Description of departments</td>
    </tr>
    <%--@elvariable id="listDepartments" type="java.util.List"--%>
    <c:forEach items="${listDepartments}" var="department">
        <tr>
            <td>${department.idDepartment}</td>
            <td>${department.nameDepartment}</td>
            <td>${department.descriptionDepartment}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
