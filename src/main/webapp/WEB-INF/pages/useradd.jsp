<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
<script type="text/javascript" src="<%=path %>/js/user.js"></script>
</head>
<body>
	<div>
		名字：<input name="name" type="text">
	</div>
	<div style="padding-top: 5px;">
		年龄：<input name="age" type="text">
	</div>
	权限：
	<div style="padding-top: 5px;padding-left: 10px;">
		<c:forEach items="${rights }" var="rt">
			<input type="checkbox" name="rightcheck" value="${rt.id }">${rt.operight } <br />
		</c:forEach>
	</div>
	<input type="button" value="提交" onclick="adduser();">
</body>
</html>