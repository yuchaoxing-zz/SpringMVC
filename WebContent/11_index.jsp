<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="${pageContext.request.contextPath }/add.action" method="post">
		<table border="1" width="30%">
		<tr>
			<td>姓名：</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>性别</td>
			<td>
				<input type="radio" name="gender" value="男"/>男
				<input type="radio" name="gender" value="女" checked/>女
			</td>
		</tr>
		<tr>
			<td>入职时间</td>
			<td><input type="text" name="hiredate" value="2015-5-10"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="提交"/></td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>