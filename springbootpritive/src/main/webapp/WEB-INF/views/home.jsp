<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<c:if test="${logVO.userid==null}">
		<a href="loginForm">로그인</a>
	</c:if>
	<c:if test="${logVO.userid!=null}">
		${logVO.username}<a href="logout">로그아웃</a>
	</c:if>
	<a href="boardList">게시판</a>
</h1>
</body>
</html>
