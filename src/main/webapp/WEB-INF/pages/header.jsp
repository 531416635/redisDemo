<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title><decorator:title default="用户信息平台" /></title>
<script type="text/javascript" src="<%=path%>/js/jquery-1.10.2.min.js"></script>
<decorator:head />
</head>
<body>
	This is my JSP page.
	<a href="user/user.do">用户列表</a> 
	<a href="user/add.do">添加</a> 
	<hr>
		<decorator:body />
</body>
</html>
