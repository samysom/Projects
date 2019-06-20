<%@page import="com.university.dto.ProgramsOffered"%>
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
<h1>List Of All Programs Offered </h1>

<%   List<ProgramsOffered> li=(List<ProgramsOffered>)session.getAttribute("listy");
                  ProgramsOffered prog=new ProgramsOffered();

%>
<style>
table{

border:solid; color:green;
}
</style>

<table border="2">
<tr>
<th><h2>Program Name</h2></th>
<th><h2>Description</h2></th>
<th><h2>Application Eligibility</h2></th>
<th><h2>Duration</h2></th>
<th><h2>Degree Certificate Offered</h2></th>
</tr>
<%      for(int i=0;i<li.size();i++)
            {      
				prog=li.get(i);
				
	                   %>
	                   <tr><td><h4><%=prog.getProgramName()%></h2></td>
     		 <td><h4><%=prog.getDescription() %></h2></td>
	        		 <td><h4><%=prog.getEligibility()%></h4></td>
	        		 <td><h4><%= prog.getDuration()%></h4></td>
	        		 <td><h4><%= prog.getDegCerti()%></h4></td>
</tr>
<% }%>



</table>

</body>
</html>