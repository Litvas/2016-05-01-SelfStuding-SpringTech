<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>List of all specialisations</title>
</head>
<body>

<a href="/supermarket/">Return to main page</a>
<br>
<a href="/supermarket/addNewSpecialisation">Add new Specialisation</a>

<H1>List of all specialisations!</H1>
<table border="2">

    <tr>
        <td>ID</td>
        <td>Name of specialisations</td>
        <td>Description of specialisations</td>
    </tr>
    <c:forEach items="${listSpecialisations}" var="specialisation">
        <tr>
            <td>${specialisation.idSpecialisation}</td>
            <td>${specialisation.nameSpecialisation}</td>
            <td>${specialisation.descriptionSpecialisation}</td>
            <td>
                <a href="/supermarket/editSpecialisation/${specialisation.idSpecialisation}">Edit Specialisation</a>
            </td>
            <td>
                <a href="/supermarket/removeSpecialisation/${specialisation.idSpecialisation}">Remove Specialisation</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
