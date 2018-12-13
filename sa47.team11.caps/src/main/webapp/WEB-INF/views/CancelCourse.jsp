<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html> --%>
<!--  -->
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
CourseCancelled
<a
					href="${pageContext.request.contextPath}/studentcourse/list/${user.id}.html">
					<s:message code="return" /></a>