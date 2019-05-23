<%@page import="com.globant.contactmanager.model.ContactModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<ContactModel> contact = (List<ContactModel>)request.getAttribute("contact");
for(ContactModel c : contact){
	out.println(c);
}
%>
</body>
</html>