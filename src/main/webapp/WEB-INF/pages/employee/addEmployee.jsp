<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>

<a href="/supermarket/">Return to main page</a>

<h1>Add new employee</h1>

<form:form action="/supermarket/successAdding" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input name="name" placeholder="Enter name employee"></td>
        </tr>
        <tr>
            <td>Surename</td>
            <td><input name="surename" placeholder="Enter name employee"></td>
        </tr>
        <tr>
            <td>Department</td>
            <td>
                <select path="nameDepartment" name="nameDepartment">
                    <c:forEach items="${listDepartment}" var="department">
                        <option>${department.nameDepartment}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>Specialisation</td>
            <td>
                <select path="nameSpecialisation" name="nameSpecialisation">
                <c:forEach items="${listSpecialisation}" var="specialisation">
                    <option>${specialisation.nameSpecialisation}</option>
                </c:forEach>
            </select>
        </tr>
        <tr>
            <td><input type="submit" value="Add new employee"></td>
        </tr>
    </table>
</form:form>

</body>
</html>
