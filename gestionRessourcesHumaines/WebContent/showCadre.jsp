<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>

     

   
<%
String cinn1 =request.getParameter("cin");
    CadreDao peee= new CadreDao();
	ResultSet rsn = peee.selectbycin(cinn1);
	%>
 <div class="card text-center">
              	<div class="card-header">
               		 <ul class="nav nav-tabs card-header-tabs">
                  	<li class="nav-item">
                   	 <a class="nav-link active" href="#Showcadre" data-toggle="tab">Cadre histori</a>
                 	 </li>
                  	<li class="nav-item">
                   	 <a class="nav-link " href="#addCadre" data-toggle="tab">ajouter un cadre</a>
                  	</li>
                  
	                </ul>
              	</div>    
              	<div class="tab-content">  
                  	<div class="card-body tab-pane active" role="tabpanel" id="Showcadre">
                      	<table class="table myDatatable" >
                      	<thead class="thead-dark">
                        	<tr class="text-center" >
                          	<th scope="col" >Nom En Francais</th>
                          	<th scope="col">الاسم بالعربية</th>
                          	<th scope="col">Cadre</th>
                     
                        	</tr>
                      	</thead>
                      	<tbody>
                        	<%  while(rsn.next()){
                       		   out.write("<tr>");
                          	    out.write("<td class='align-middle'>"+rsn.getString(1)+"</th>");
                           		   out.write("<td class='align-middle' >"+rsn.getString(2)+"</td>");
                            		  out.write("<td class='align-middle'>"+rsn.getString(3)+"</td>");
                          
                            
                           		   out.write("</tr>");
                         		 }
                        		  rsn.close();
                         		 %>
                     	 </tbody>
                      </table>
                   	</div>
                  
                  <div class="card-body tab-pane" role="tabpanel" id="addCadre">
                      <div class="row justify-content-center">
                           <div class="col-6 " >
           
                              <form method="post" action="Cadres">
                                  
                               <%out.write("<input type='text'   style='display: none;' name='PersonnelID' value='"+cinn1+"'>"); %>
  
                                  <div class="form-group">
                                    <label for="exampleInputEmail1">Le Cadre</label>
                                    <input type="text" class="form-control" name="Cadre" id="" >
                                    <small id="emailHelp" class="form-text text-muted">Inserer le Cadre</small>
                                  </div>

                                  <div class="form-group">
                                    <label for="exampleInputEmail1">Le code de Cadre</label>
                                    <input type="text" class="form-control" name="CodeC" id="" >
                                    <small id="emailHelp" class="form-text text-muted">Inserer le Code de Cadre</small>
                                  </div>
  
                                  <input type="submit" name="actionID" class="btn btn-primary"  value="enregestrer">
                                 
                                </form>
                             
                          </div>
                      </div>
                
                 </div>
              </div>  
 </div>
          
            

