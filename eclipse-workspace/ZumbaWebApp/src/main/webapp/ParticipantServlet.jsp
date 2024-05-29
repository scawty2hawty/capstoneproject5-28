<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Zumba Participants</title>
    <!-- Add any additional CSS or JS here -->
</head>
<body>
    <h1>Zumba Class Participants</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Instructor</th>
            <th>Schedule Time</th>
        </tr>
        <%-- Loop over the participants list passed from the servlet --%>
        <c:forEach items="${participants}" var="participant">
            <tr>
                <td>${participant.id}</td>
                <td>${participant.name}</td>
                <td>${participant.instructor}</td>
                <td>${participant.scheduleTime}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
