<%@page import="java.util.List"%>
<%@ page session="false"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./resources/CSS/table.css">
</head>
<body>

<%@ page import="com.asset.jpa.dto.Asset"%>
	<%
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("./loginpage.jsp");
		}
	%>
	
	<h2 align="center">Status of Request</h2>
	<table align="center">
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
			List<Asset> data = (List<Asset>) session.getAttribute("statusdatalist");
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