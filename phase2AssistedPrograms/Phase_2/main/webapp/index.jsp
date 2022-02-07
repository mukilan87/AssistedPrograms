<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Working with JSP's</title>
</head>
<body>

	<h1>JSP Starter</h1>

	<!-- JSP declarations -->

	<%!
		boolean flag = false;
	
	
		String met(){
			return "Inside met...";
	}
	%>
	
	
	<% out.println(met());
		out.println(flag);
	%>

	<%="Yes this is working..."%>

	<%
	out.println("Hello JSP!!!");
	%>
	<%=new Date()%>

	<p>

		<%
		out.println("Addition of two numbers is : " + (114 + 901));
		%>

	</p>

	<p>

		<select>
			<option>Select your ID</option>
			<%
			for (int index = 456; index <= 556; index++) {
			%>
			<option>
				<%
				out.println(index);
				%>
			</option>
			<%
			}
			%>
		</select>

		<%-- <%
			 for(int index = 50; index <= 100; index++){
				out.println(index + "<br>");
			} 
		%> --%>

	</p>

</body>
</html>