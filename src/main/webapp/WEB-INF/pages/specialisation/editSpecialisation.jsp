<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:useBean id="specialisation" scope="request" type="com.springapp.supermarket.entity.Specialisation"/>

<a href="/supermarket/">Return to main page</a>

<h1>Edit Specialisation!</h1>

<form action="/supermarket/updateSpecialisation" method="post">

    <label><input name="idSpecialisation" hidden="hidden" value="${specialisation.idSpecialisation}"></label>
    <label>Name Specialisation<input name="nameSpecialisation" value="${specialisation.nameSpecialisation}"/></label>
    <br>
    <label>Description specialisation<input name="descriptionSpecialisation"
                                            value="${specialisation.descriptionSpecialisation}"/></label>
    <br>
    <label><input type="SUBMIT" VALUE="Update Specialisation"></label>

</form>
</body>
</html>
