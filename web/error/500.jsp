<%@ page contentType="text/html; charset=utf-8" isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    服务器内部错误，请联系管理员，错误信息如下：
    <%
        String msg = exception.getMessage();
        out.print("<br>" + exception.getClass().getSimpleName() + ":" + msg);
    %>
</body>
</html>