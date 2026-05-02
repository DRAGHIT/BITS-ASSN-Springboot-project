<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Add Student</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
    <h1>Add New Student</h1>
    <form action="/saveStudent" method="post">
        <div class="form-group">
            <label for="name">Full Name</label>
            <input type="text" id="name" name="name" placeholder="John Doe" required>
        </div>
        <div class="form-group">
            <label for="email">Email Address</label>
            <input type="email" id="email" name="email" placeholder="john@example.com" required>
        </div>
        <div class="form-group">
            <label for="course">Select Course</label>
            <select id="course" name="course.id" required>
                <c:forEach var="c" items="${courses}">
                    <option value="${c.id}">${c.title}</option>
                </c:forEach>
            </select>
        </div>
        <div style="display: flex; gap: 1rem;">
            <button type="submit" class="btn btn-primary">Save Student</button>
            <a href="/students" class="btn btn-outline">Cancel</a>
        </div>
    </form>
</div>
</body>
</html>
