<%@page import="com.elibrary.models.BookModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px">
<tr>
<th>ISBN</th>
<th>Title</th>
<th>Author</th>
<th>Publisher</th>
<th>Quantity</th>
<th>Delete</th></tr>
<%
List<BookModel> book = (List<BookModel>)request.getAttribute("books");
for(BookModel b : book){
	out.print("<tr>");
	out.print("<td>"+b.getIsbn()+"</td>");
	out.print("<td>"+b.getTitle()+"</td>");
	out.print("<td>"+b.getAuthor()+"</td>");
	out.print("<td>"+b.getPublisher()+"</td>");
	out.print("<td>"+b.getQty()+"</td>");
	out.println("<td><form action='deletebook' method='post'><input id='id' name='id' value="+b.getId()+" type='hidden'><input value='Delete' type='submit'></form></td>");
	out.println("</tr>");
}
%>
</table>
</body>
</html>