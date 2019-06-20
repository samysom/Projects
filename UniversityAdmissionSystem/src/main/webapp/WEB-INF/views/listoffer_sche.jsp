<%@page import="com.university.dto.ProgramsScheduled"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List Of All Scheduled Programs</h1>

<%  List<ProgramsScheduled> li=(List<ProgramsScheduled>)session.getAttribute("listy");
               ProgramsScheduled prog=new ProgramsScheduled();

%>
<style>
table{

border:solid; color: black;
}
</style>

<table border="2" bgcolor="green">
<tr>
<th><h2>Scheduled program ID</h2></th>
<th><h2>Program name</h2></th>
<th><h2>Location</h2></th>
<th><h2>Start date</h2></th>
<th><h2>End date</h2></th>
<th><h2>Session</h2></th>
</tr>
<%      for(int i=0;i<li.size();i++)
            {      
				prog=li.get(i);
				
	                   %>
	                   <tr><td><h4><%=prog.getScheduledProgId()%></h2></td>
     		 <td><h4><%=prog.getProgramName() %></h2></td>
	        		 <td><h4><%=prog.getLocation()%></h4></td>
	        		 <td><h4><%= prog.getStartDate()%></h4></td>
	        		 <td><h4><%= prog.getEndDate()%></h4></td>
	        		 <td><h4><%= prog.getSession()%></h4></td>
</tr>
<% }%>



</table>

</body>

</html>