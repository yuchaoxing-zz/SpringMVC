<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${requestScope.message}<br/>
	姓名：${requestScope.emp.name}<br/>
	性别：${requestScope.emp.gender}<br/>
	
	入职时间：${requestScope.emp.hiredate}<br/>
	<hr/>
	入职时间：<fmt:formatDate 
				value="${requestScope.emp.hiredate}"
				type="date"
				dateStyle="medium"
			/>
</body>
</html>