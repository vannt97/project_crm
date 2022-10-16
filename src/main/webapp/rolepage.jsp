<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Roles page</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Description</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>

        <c:forEach items="${roles}" var = "role">
        <tr>
            <td>${role.getId()}</td>
            <td>${role.getName_role()}</td>
            <td>${role.getDescription()}</td>
            <td>
            <button>Edit</button>
            <button roleId="${role.getId()}" class="btn-delete">Remove</button>
            </td>
        </tr>
        </c:forEach>

    </tbody>
</table>
<script
        src="https://code.jquery.com/jquery-3.6.1.min.js"
        integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
        crossorigin="anonymous"
></script>
<script src="./role.js"></script>
</body>
</html>
