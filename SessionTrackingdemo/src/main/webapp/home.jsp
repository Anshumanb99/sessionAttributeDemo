<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
/*String myname=(String) request.getAttribute("name_key");*/
String myname=(String) session.getAttribute("name_key");
String mylocation=(String) session.getAttribute("location_key");
String mygender=(String) session.getAttribute("gendere_key");
%>
<h3>Welcome :<%= myname %></h3>
<h3>Welcome :<%= mylocation %></h3>
<h3>Welcome :<%= mygender %></h3>

<a href="profile.jsp">Profile</a>
<a href="about-us.jsp">ABout us</a>
</body>
</html>