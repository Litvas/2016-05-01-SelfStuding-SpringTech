<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<a href="/supermarket/">Return to main page</a>

<h1>Add Specialisation!</h1>

<form action="/supermarket/successAddingSpec" method="post">

    <label>Name Specialisation<input name="nameSpecialisation"></label>
    <br>
    <label>Description specialisation<input name="descriptionSpecialisation"></label>
    <br>
    <label><input type="SUBMIT" VALUE="Update Specialisation"></label>

</form>
</body>
</html>
