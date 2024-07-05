<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>  <!-- To Enable Expression language -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
		<h1>Hi! Help Page....</h1>
		<%
	/*		String name=(String)request.getAttribute("name");
			Integer roll=(Integer)request.getAttribute("roll");
			LocalDateTime time=(LocalDateTime)request.getAttribute("time");  */
			
		%>
		<%--   ========== Using JSP Expression Language  ==========  --%>
		<h1>Name :<%-- <%=name%> --%>	${name}</h1>
		<h2>Roll :<%-- <%=roll%> --%>	${roll }</h2>
		<h3>Date and Time :<%--<%=time.toString()%> --%>   ${time }</h3>  
		<hr>
		<c:forEach var="item" items="${mark }">
			<%--  <h2>${item }</h2>  --%>
			<h3><c:out value="${item }"></c:out></h3>
		</c:forEach>
		<hr>
		<h3>Marks: ${mark }</h3>
		
</body>
</html>