<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>      
            <table  class="">
				<thead style="background-color: #005b91;color: white;">
					<tr>
						<th>login</th>
						<th>mot de passe</th>
						<th>nom</th>
						<th>prenom</th>
						
					</tr>
				</thead>
				<tbody>
				
		      <% 		
				AdminDao sd = new AdminDao();
				ResultSet rs = sd.selectAll();
				String named,type,hidden,action,nameU,nameid,methodeGet,methodePost,update ;
				named="delete";
				nameid="id";
				nameU="update";
				action="Admins";
				type="submit";
				hidden="hidden";
				methodeGet="Get";
				methodePost="Post";
				update="UpdateAdmin.jsp";

					while (rs.next()){
						out.write("<tr>");
							out.write("<td>"+rs.getObject(2)+"</td>");
							out.write("<td>"+rs.getObject(3)+"</td>");
							out.write("<td>"+rs.getObject(4)+"</td>");
							out.write("<td>"+rs.getObject(5)+"</td>");
							out.write("<form method="+methodeGet+" action="+action+">");
							out.write("<td><input  type="+type+"  name="+named+" value="+named+"></input></td>");
							out.write("<td><input  type="+hidden+"  name="+nameid+" value="+rs.getObject(1)+"></a></td>");
							out.write(" </form>");
							out.write("<form method="+methodePost+" action="+action+">");
							out.write("<td><input  type="+type+"  name="+nameU+" value="+rs.getObject(1)+"></td>");
							out.write("<td><input  type="+hidden+"  name="+nameid+" value="+rs.getObject(1)+"></td>");
							out.write(" </form>");
							out.write("</tr>");
						}
							%>					      
					      
							
				  </tbody>
			    </table>
			    
</body>
</html>