<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" import="ex.*" %>
<%
Employee emp = new Employee("0001", "湊 雄輔");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>練習4-1</title>
</head>
<body>
<% for(int i = 0; i < 10; i++) { %>
<% if (i % 3 == 0) { %>
<p style="color:red">
<% } else { %>
<p>
<% } %>
IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です</p>
<% } %>
</body>
</html>