<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.asset.jpa.dto.Asset"%>
<%@page import="com.asset.dao.AssetDAOJPAimpl"%>
<%@page import="com.asset.services.AssetServiceJPAimpl"%>
<%@page import="java.sql.ResultSet"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Allocated Asset</title>
<link rel="stylesheet" type="text/css" href="./resources/CSS/table.css">
</head>
<body>

	 <%
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("./loginpage.jsp");
		}
	%> 
	<h2 align="center">All Allocated Assets</h2>
	<table align="center" >
		<tr>
			<th>AssetId</th>
			<th>AssetName</th>
			<th>AssetDes</th>
			<th>Quantity</th>
			<th>Status</th>
		</tr>
		<%
			Iterator itr;
		%>
		<%
			List<Asset> data = (List<Asset>) session.getAttribute("datalist");
		    itr = data.iterator();
			while( itr.hasNext()) 
			{
				Asset a = (Asset) itr.next();
				int aid = a.getAssetId();
				String aname = a.getAssetName();
				String ades = a.getDes();
				int aq = a.getQuantity();
				String astatus = a.getStatus();
				%>	
				<tr>
				<td><%=aid%></td>
				<td><%=aname%></td>
				<td><%=ades%></td>
				<td><%=aq%></td>
				<td><%=astatus%></td>
			</tr>
				<%
				}
			%>
				
	</table>
	
</body>
</html>