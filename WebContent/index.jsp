<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <a href="${pageContext.request.contextPath }/add.action?username=邢宇超">跳转</a> --%>
<center>
<a href="">添加新用户</a><br>
<table border="1" width="50%">
	<tr><td>编号</td><td>姓名</td><td>身份证</td><td>操作</td></tr>
	<c:forEach var="list" items="${message }">
		<tr>
			<td>${list.personid }</td>
			<td>${list.personname }</td>
			<td>${list.idcard }</td>
			<td>
				<a href="#">修改</a>
				<a href="#">删除</a>
			</td>
		</tr>
	</c:forEach>
</table>
</center>
</body>
</html>