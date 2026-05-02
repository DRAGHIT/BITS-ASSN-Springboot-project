<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Edit Student</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
    <h1>Edit Student</h1>
    <form action="/updateStudent" method="post">
        <input type="hidden" name="id" value="${student.id}"/>
        <div class="form-group">
            <label for="name">Full Name</label>
            <input type="text" id="name" name="name" value="${student.name}" required>
        </div>
        <div class="form-group">
            <label for="email">Email Address</label>
            <input type="email" id="email" name="email" value="${student.email}" required>
        </div>
        <div class="form-group">
            <label for="course">Select Course</label>
            <select id="course" name="course.id" required>
                <c:forEach var="c" items="${courses}">
                    <option value="${c.id}" ${c.id == student.course.id ? 'selected' : ''}>${c.title}</option>
                </c:forEach>
            </select>
        </div>
        <div style="display: flex; gap: 1rem;">
            <button type="submit" class="btn btn-primary">Update Student</button>
            <a href="/students" class="btn btn-outline">Cancel</a>
        </div>
    </form>
</div>
</body>
</html>
