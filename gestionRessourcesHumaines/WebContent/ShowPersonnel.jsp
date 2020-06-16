<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Insert title here</title>
</head>
<body>
    <%@ include file="Index.html" %>
    
     <div class="container">
        <div class="card ">
            <div class="card-header ">
                <div class="row">
                     <a href="AjoutPersonnel.jsp"><button type="button" class="btn btn-success">Ajouter nouveau personnel</button></a>
                      
                </div>
                </div>
            <div class="card-body">
    
    
    
  
  <table class="table myDatatable" id="myTable">
                    <thead class="thead-dark">
                      <tr>
                        <th scope="col">Nom Francais</th>
                        <th scope="col">الاسم بالعربية</th>
                        <th scope="col">CIN</th>
                        <th scope="col"  class="text-center">Options</th>
                      </tr>
                    </thead>
                    <tbody>
<% 
String cinn =request.getParameter("cin");

	PersonnelDao p= new PersonnelDao();
	ResultSet rs = p.SelectAll();

	while(rs.next()){
		out.write("<tr>");
		out.write("<th class='align-middle'>"+rs.getString(5)+"</td>");
		out.write("<td class='align-middle'>"+rs.getString(4)+"</td>");
		out.write("<td class='align-middle'>"+rs.getString(3)+"</td>");
		out.write("<td class='align-middle text-center' scope='col' style='width: 400px;'>");
		out.write(" <div class='row ml-auto'>");
		out.write("<form action='mainProfile.jsp' method='POST' class='col-4 '>");
		out.write(" <input type='text' value='"+rs.getString(3)+"' name ='cin' id='cinBtn' style='display: none;'>");
		out.write("<input type='submit' value='show more'  class='btn btn-info badge-pill '>");
		out.write(" </form>");
		out.write("<form action='updatePersonnel.jsp' method='POST' class='col-4 '>");
		out.write(" <input type='text' value='"+rs.getString(3)+"' name ='cin' id='cinBtn' style='display: none;'>");
		out.write(" <input type='submit' value='Update' name='Update' class='btn btn-info badge-pill'>");
		out.write(" </form>");
		out.write("<form action='Personnels' method='Get' class='col-4 '>");
		out.write(" <input type='text' value='"+rs.getString(3)+"' name ='delete'  id='cinBtn' style='display: none;'>");
		out.write(" <input type='submit' value='Delete'  class='btn btn-danger badge-pill'>");
		out.write("</div>");
		out.write(" </form>");
		out.write("</tr>");
		
	}
%>
 		</tbody>
	</table>
   </div>
          </div>
    	</div>
  
 <script src="js/jquery.dataTables.min.js"></script>
    <script src="js/dataTables.bootstrap4.min.js"></script>
    <script >
        $('.myDatatable').dataTable({
            searching :'false',
            ordering : 'false',
            lengthMenu :[[5,10,15,20,-1],[5,10,15,20,'All']],
            createRow : function (row ,data,index){
                if(data[5].replace(/[\$,]/g,'')*1>150000){
                    $('td',row).eq(5).addClass('text-success');
                }
            }
        });
    </script>
</body>
</html>