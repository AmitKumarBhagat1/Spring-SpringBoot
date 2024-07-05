<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h2>Hi! Home page </h2>
	
	<%
		//String s=(String)request.getAttribute("name");
		Object name=request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("id");
		List<String> add=(List<String>)request.getAttribute("address");
	%>
	<h1>Name :<%=name %></h1>
	<h1>id   :<%=id %></h1>
	<%
			for(String s:add){
	%>
				<h2><%=s%></h2>
	<%
							  }
	%>
</body>
</html>