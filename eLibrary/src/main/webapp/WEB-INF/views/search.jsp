<%@page import="com.elibrary.models.BookModel"%>
<form action="searchbook" method="get">
<input type="text" name="title">
<input type="submit" value="search">
</form>
<br>
<%
if(request.getAttribute("result")!=null){
BookModel book = (BookModel) request.getAttribute("result");
out.println(book.getIsbn()+"  "+book.getTitle()+" "+book.getQty());
}
%>