<%@page import="com.university.dto.Application"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%    List<Application> li=(List<Application>)session.getAttribute("listy");
Application a=new Application();
%>
<style>
table{

border:solid; color: black;
}
</style>

<table border="2" bgcolor="green">
<tr>
<th><h2>Application Id</h2></th>
<th><h2>Full Name</h2></th>
<th><h2>D.O.B</h2></th>
<th><h2>Highest Qualification</h2></th>
<th><h2>Marks</h2></th>
<th><h2>Goals</h2></th>
<th><h2>Email</h2></th>
<th><h2>ScheduledProgId</h2></th>
<th><h2>Status</h2></th>
<th><h2>InterviewDates</h2></th>
</tr>
<%      for(int i=0;i<li.size();i++)
            {      
				a=li.get(i);
%>
	                <tr><td><h4><%=a.getApplicId()%></h4></td>
     				<td><h4><%=a.getFullName() %></h4></td>
     				<td><h4><%=a.getDob()%></h4></td>
	        		<td><h4><%=a.getQualification() %></h4></td>
       		 		<td><h4><%=a.getMarks()%></h4></td>
       				<td><h4><%=a.getGoals()%></h4></td>
       		 		<td><h4><%=a.getEmail()%></h4></td>
       		 		<td><h4><%=a.getScheduledProgId()%></h4></td>
       		 		<td><h4><%=a.getStatus()%></h4></td>
       		 		<td><h4><%=a.getInterviewDate()%></h4></td></tr>
</tr>
<% }%>



</table>
</body>
</html>