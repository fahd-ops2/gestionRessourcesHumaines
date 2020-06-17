<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>matiere</title>
</head>
<body>
    
   
    
<%  String cin =request.getParameter("cin");
    if (cin=="")this.getServletContext().getRequestDispatcher("/ShowMatieres.jsp").forward(request, response);
    
    MatiereDao p= new MatiereDao();
	ResultSet rs = p.selectbycin(cin);
	%>
	 <div class="card text-center">
              <div class="card-header">
                <ul class="nav nav-tabs card-header-tabs">
                  <li class="nav-item">
                    <a class="nav-link active" href="#Matieress" data-toggle="tab">Les matieres</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link " href="#addMatiere" data-toggle="tab">ajouter une Matiere</a>
                  </li>
                
                  
                  
                </ul>
              </div>    
              <div class="tab-content">  
                  <div class="card-body tab-pane active" role="tabpanel" id="Matieress">
                      <table class="table myDatatable" >
                      <thead class="thead-dark">
                        <tr class="text-center" >
                          <th scope="col" >Nom En Francais</th>
                          <th scope="col">الاسم بالعربية</th>
                          <th scope="col">Matiere</th>
                     
                        </tr>
                      </thead>
                      <tbody>
                        <%  while(rs.next()){
                          out.write("<tr>");
                              out.write("<td class='align-middle'>"+rs.getString(1)+"</th>");
                              out.write("<td class='align-middle' >"+rs.getString(2)+"</td>");
                              out.write("<td class='align-middle'>"+rs.getString(3)+"</td>");
                          
                            
                              out.write("</tr>");
                          }
                          rs.close();
                          %>
                      </tbody>
                      </table>
                   </div>
                  
                  <div class="card-body tab-pane" role="tabpanel" id="addMatiere">
                      <div class="row justify-content-center">
                           <div class="col-6 " >
           
                              <form  method="post" action="Matieres">
                                  
                               <%out.write("<input type='text' class=''  style='display: none;' name='PersonnelID' value='"+cin+"'>"); %>
  
                                  <div class="form-group">
                                    <label for="exampleInputEmail1">La Matiere </label>
                                    <input type="text" class="form-control" name="NomMatiere" id="" >
                                    <small id="emailHelp" class="form-text text-muted">Inserer La Matiere </small>
                                  </div>
  
                                  <input type="submit" name="actionID" class="btn btn-primary"  value="enregestrer">
                                 
                                </form>
                             
                          </div>
                      </div>
                  </div>
                 
              </div>  
            </div>

</body>
</html>