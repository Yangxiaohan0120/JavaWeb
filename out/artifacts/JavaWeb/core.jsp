<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 在Java或者JSP文件中输入 Alt + / 可出现智能提示 -->
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${requestScope.score}</h1>
	<c:if test = "${score >= 60 }">
		<h1 style = "color:green">恭喜，你已通过测试</h1>
	</c:if>
	<c:if test = "${score < 60 }">
		<h1 style = "color:red">对不起，再接再厉</h1>
	</c:if>
	
	<!-- choose when otherwise -->
	${grade }
	<c:choose>
		<c:when test="${grade == 'A'}">
			<h2>你很优秀</h2>
		</c:when>
		<c:when test="${grade == 'B' }">
			<h2>不错呦</h2>
		</c:when>
		<c:when test="${grade == 'C' }">
			<h2>水平一般，需要提高</h2>
		</c:when>
		<c:when test = "${grade == 'D'}">
			<h2>需要努力啦，不要气馁</h2>
		</c:when>
		<c:otherwise>
			<h2>一切随缘吧</h2>
		</c:otherwise>
	</c:choose>
	
	<!-- forEach标签用于遍历集合
		List companys = (List)request.getAttribute("companys")
		for(Company c : companys){
			out.print("...")
		}
		idx = index
		idx.index属性代表循环的索引值（0开始）
	-->
	<c:forEach varStatus="idx" items = "${requestScope.companys }" var = "c">
		<h2>${idx.index + 1}-${c.cname }-${c.url }</h2>
	</c:forEach>
	
</body>
</html>