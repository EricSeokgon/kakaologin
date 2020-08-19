<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<c:if test="${userId eq null}">
    <a href="https://kauth.kakao.com/oauth/authorize?client_id=90a4d5e63b6a29255df89da36fd88c60&redirect_uri=http://localhost:8000/login&response_type=code">
        <img src="/img/kakao_login_medium_narrow.png">
    </a>
</c:if>
<c:if test="${userId ne null}">
    <h1>로그인 성공입니다</h1>
</c:if>
</body>
</html>