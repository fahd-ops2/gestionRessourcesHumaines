<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>

<% 
String cinn =request.getParameter("cin");
   
    
    EtablismentDao etap= new EtablismentDao();
	ResultSet rs1 = etap.selectAllbycin(cinn);%>
    
  <div class="card text-center">
                            <div class="card-header">
                              <ul class="nav nav-tabs card-header-tabs">
                                <li class="nav-item">
                                  <a class="nav-link active" href="#missionlist" data-toggle="tab">Les missions</a>
                                </li>
                                <li class="nav-item">
                                  <a class="nav-link" href="#addmission" data-toggle="tab">Ajouter un mission</a>
                                </li>
                                
                              </ul>
                            </div>    
                            <div class="tab-content">  
                                <div class="card-body tab-pane active" role="tabpanel" id="missionlist">
                                    <table class="table myDatatable" >
                                    <thead class="thead-dark">
                                      <tr class="text-center" >
                                        <th scope="col" >Nom En Francais</th>
                                        <th scope="col">الاسم بالعربية</th>
                                        <th scope="col">Mission</th>
                                        <th scope="col">Etablissement ville</th>
                                        <th scope="col">Date Debut</th>
                                        <th scope="col">Date Fin</th>
                                      </tr>
                                    </thead>
                                    <tbody>
                                      <%  while(rs1.next()){
                                        out.write("<tr>");
                                            out.write("<td class='align-middle'>"+rs1.getString(1)+"</th>");
                                            out.write("<td class='align-middle' >"+rs1.getString(2)+"</td>");
                                            out.write("<td class='align-middle'>"+rs1.getString(6)+"</td>");
                                            out.write("<td class='align-middle'>"+rs1.getString(3)+"</td>");
                                            out.write("<td class='align-middle'>"+rs1.getString(4)+"</td>");
                                            out.write("<td class='align-middle'>"+rs1.getString(5)+"</td>");
                                          
                                            out.write("</tr>");
                                        }
                                        rs1.close();
                                        %>
                                    </tbody>
                                    </table>
                                 </div>
                                <div class="card-body tab-pane" role="tabpanel" id="addmission">
                                    <div class="row justify-content-center">
                                         <div class="col-6 " >
                         
                                            <form method="post" action="Missions">
                                                
                                              <input type="text" class=""  style="display: none;" name="PersonnelID" value="a">
                
                                                <div class="form-group">
                                                  <label for="exampleInputEmail1">La Mission</label>
                                                  <input type="text" class="form-control"  name="Mission" id="" >
                                                  <small id="emailHelp" class="form-text text-muted">Inserer la Mission</small>
                                                </div>
                
                                                <div class="form-group">
                                                    <label for="exampleInputEmail1">Date debut de mission</label>
                                                    <input type="date" class="form-control"   name="Date_debut" placeholder="dd/mm/yyyy" min="01/01/1900" max="12/31/2050">
                                                    <small id="emailHelp" class="form-text text-muted">Inserer la Date debut </small>
                                                  </div>
                
                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Date Fin de mission</label>
                                                    <input type="date" class="form-control"   name="Date_fin" placeholder="dd/mm/yyyy" min="01/01/1900" max="12/31/2050">
                                                    <small id="emailHelp" class="form-text text-muted">Inserer la Date fin </small>
                                                  </div>
                
                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Etablissement et ville</label>
                                                    <input type="text" class="form-control"  name="Etablissement_ville" >
                                                    <small id="emailHelp" class="form-text text-muted">Inserer l'etablissement et ville </small>
                                                  </div>
                
                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Code de Mission</label>
                                                    <input type="text" class="form-control"  name="CodeLM" >
                                                    <small id="emailHelp" class="form-text text-muted">Inserer le Code de Mission </small>
                                                  </div>
                
                                              
                                                <input type="submit" name="actionID" class="btn btn-primary" value="enregestrer">
                                               
                                              </form>
                                           
                                        </div>
                                    </div>
                                </div>
                            </div>  
   </div>
                          
                          

   



