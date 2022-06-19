<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>姓名：${sessionScope.student.name}</h1>
    <h1>评级：${sessionScope.grade}</h1>
    <h1>${param.teacher}</h1>
</body>
</html>
