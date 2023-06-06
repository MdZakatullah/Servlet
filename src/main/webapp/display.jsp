<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<h1>Message from JSP file</h1>

<%System.out.println("hello there");
%>
<% 
out.println(session.getAttribute("id")); 
%><br>
<%
out.println(session.getAttribute("name"));%><br>
${name}<br>
<%out.println(session.getAttribute("emai")); %><br>
${email}<br>
<br>

<%
List<Integer>list=(List)session.getAttribute("list");
int count=1;
for(Integer i:list){
	out.println("The"+count+"positon data is = "+i);
	%>
	<br>
	<%
	count++;
}
%>

<%System.out.println(a); 
int temp=15;
System.out.println(li);
%>
<h1><%="QWERTY" %></h1>

<%!int a=10;%>

<%!static List<Integer> li=new ArrayList<>();%>


</body>
</html>        