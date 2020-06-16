<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>

   
   
	</head>
	<body>
  <%  
   String cin =request.getParameter("cin");
   if (cin=="")this.getServletContext().getRequestDispatcher("/mainProfilef.jsp").forward(request, response);
   DiplomePDao p1= new DiplomePDao();
   ResultSet rs = p1.selectbycin(cin);
   DiplomeSuDao pa= new DiplomeSuDao();
	   ResultSet res = pa.selectbycin(cin);
   %>
  
	<div class="card text-center">
               <div class="card text-center">
                    <div class="card-header">
                      
                      <ul class="nav nav-tabs card-header-tabs">
                        <li class="nav-item">
                          <a class="nav-link active" href="#deps" data-toggle="tab">Diplome scolaire et universitaire</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#depsa" data-toggle="tab">Diplome professionnel </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#adddep" data-toggle="tab">Ajoute deplome</a>
                          </li>
                       
                      </ul>
                    </div>
                    <!--Here -->
                    <div class="tab-content">
                        
                        <!--code de liste Diplome scolaire et universitaire-->
                    <div class="card-body tab-pane active" role="tabpanel" id="deps">
                        <div class="row">
                            <h1 class="title ml-auto mr-auto">Diplome scolaire et universitaire</h1>
                        </div>
                        <table class="table myDatatable" id="myTable">
                                 <thead class="thead-dark">
                                     <tr>
                                    <th scope="col">Nom Francais</th>
                                    <th scope="col">الاسم بالعربية</th>
                                    <th scope="col">diplome</th>
                                    <th scope="col">Specialitee</th>
                                   
                                    </tr>
                                </thead>
                            <tbody>
                   
                        		          <% 
                            
                             while(res.next()){
                            	 
                        out.write("<tr>");
                            out.write("<td class='align-middle'>"+res.getString(1)+"</th>");
                            out.write("<td class='align-middle' >"+res.getString(2)+"</td>");
                            out.write("<td class='align-middle'>"+res.getString(3)+"</td>");
                            out.write("<td class='align-middle'>"+res.getString(4)+"</td>");
                          
                            out.write("</tr>");
                        }
                       
                        %>
                            </tbody>
                          
                          </table>
                    </div>
                    <!--code de liste deplome professionnel-->
                    <div class="card-body tab-pane " role="tabpanel" id="depsa">
                        <div class="row">
                            <h1 class="title ml-auto mr-auto">Diplome professionnel</h1>
                        </div>
                        <table class="table myDatatable" id="myTable">
                                 <thead class="thead-dark">
                                     <tr>
                                   <th scope="col">Nom Francais</th>
                                   <th scope="col">الاسم بالعربية</th>
                                   <th scope="col">diplome</th>
                                   <th scope="col">Specialitee</th>
                                   
                                    </tr>
                                       
                                        </tr>
                                </thead>
                            <tbody>
                               <% 
                         while(rs.next()){
                           out.write("<tr>");
                               out.write("<th class='align-middle'>"+rs.getString("Pren_n")+"</th>");
                               out.write("<td class='align-middle' >"+rs.getString("Pren_n_arabe")+"</td>");
                               out.write("<td class='align-middle'>"+rs.getString("Diplomep")+"</td>");
                               out.write("<td class='align-middle'>"+rs.getString("Specialitee")+"</td>");
                             
                               out.write("</tr>"); 
                         }
                         rs.close();
                               %>
                            </tbody>
                          
                          </table>
                    </div>
                    <!--code ajouter un deplome-->
                    <div class="card-body tab-pane " role="tabpanel" id="adddep">
                        <div class="row justify-content-between">
                            <div class="col-5 text-center">
					         <%
					         
					         PersonnelDao per=new PersonnelDao();
					         ResultSet resp =per.selectby(cin);
					         while (resp.next()){

       						%>
                                <form method="post" action="Diplomes">
                                    <h3>Diplome scolaire et universitaire </h3>
                                    
                                    <input type='hidden' class=''   name='PersonnelID' value="<%=resp.getInt("ID")%>"> 
                                   
                                    
                                    <div class="form-group">
                                      <label for="exampleInputEmail1">Nom de diplome</label>
                                      <input type="text" class="form-control"  name="DiplomeSU" id="" aria-describedby="Nom de deplome">
                                      <small id="emailHelp" class="form-text text-muted">Inserer le nome de Deplome</small>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Date d'obtention</label>
                                        <input type="date" class="form-control"  name="DateobtentionSu" aria-describedby="Nom de deplome" placeholder="dd/mm/yyyy" min="01/01/1900" max="12/31/2050">
                                        <small id="emailHelp" class="form-text text-muted">Inserer la Date de Deplome</small>
                                      </div>
                                      <div class="form-group">
                                        <label for="exampleInputEmail1">Faculte </label>
                                        <input type="text" class="form-control"  name="Faculte" aria-describedby="Faculte">
                                        <small id="emailHelp" class="form-text text-muted">Inserer le Code de specialtee </small>
                                      </div>
                                      <div class="form-group">
                                        <label for="exampleInputEmail1">Specialtee </label>
                                        <input type="text" class="form-control"  name="Specialitee" aria-describedby="Nom de deplome">
                                        <small id="emailHelp" class="form-text text-muted">Inserer le Code de specialtee </small>
                                      </div>
                                      <div class="form-group">
                                        <label for="exampleInputEmail1">Code de specialtee </label>
                                        <input type="text" class="form-control"  name="CodeS" aria-describedby="Nom de deplome">
                                        <small id="emailHelp" class="form-text text-muted">Inserer le Code de specialtee </small>
                                      </div>
                                  
                                    <input type="submit" name="actionID" class="btn btn-primary" value="ajoutdiplomesu">
                                   
                                  </form>
                                  
                            </div>
                            <div class="col-5 text-center">
                                
                                <form action="Diplomes" method="Post">
                                    <h3>Diplome professionnel</h3>
                                     <input type='hidden' class=''   name='PersonnelID' value="<%=resp.getInt("ID")%>">
                                   
                                    <div class="form-group">
                                      <label for="exampleInputEmail1">Nom de diplome</label>
                                      <input type="text" class="form-control"  name="DiplomeP" id="" aria-describedby="Nom de deplome">
                                      <small id="emailHelp" class="form-text text-muted">Inserer le nome de Deplome</small>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Date d'obtenir</label>
                                        <input type="date" class="form-control"  name="DateObtentionP" aria-describedby="Nom de deplome" placeholder="dd/mm/yyyy" min="01/01/1900" max="12/31/2050">
                                        <small id="emailHelp" class="form-text text-muted">Inserer la Date de Deplome</small>
                                      </div>
                                      <div class="form-group">
                                        <label for="exampleInputEmail1">specialtee </label>
                                        <input type="text" class="form-control"  name="Specialitee" aria-describedby="Nom de deplome">
                                        <small id="emailHelp" class="form-text text-muted">Inserer la specialtee </small>
                                      </div>
                                      <div class="form-group">
                                        <label for="exampleInputEmail1">Code de specialtee </label>
                                        <input type="text" class="form-control"  name="CodeS" aria-describedby="Nom de deplome">
                                        <small id="emailHelp" class="form-text text-muted">Inserer le Code de specialtee </small>
                                      </div>
                                  
                                    <input type="submit" name="actionID" class="btn btn-primary" value="ajoutdiplomep">
                                  </form>
                                  <%} %>
                            </div>
                        </div>
                    </div>
                    </div>
                    </div>
     </body>
	 </html>
