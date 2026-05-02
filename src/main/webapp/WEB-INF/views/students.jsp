<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Student List</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
    <h1>
        Student List
        <a href="/addStudent" class="btn btn-primary">Add New Student</a>
    </h1>
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Course</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="s" items="${students}">
            <tr>
                <td>${s.name}</td>
                <td>${s.email}</td>
                <td>${s.course.title}</td>
                <td>
                    <a href="/editStudent/${s.id}" class="btn btn-outline">Edit</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
