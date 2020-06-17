<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>

   
<% 
    String cins =request.getParameter("cin");
   
	NoteAdminDao pea= new NoteAdminDao();
	ResultSet reas = pea.selectAllbycin(cins);
	
	NoteProspDao pee=new NoteProspDao();
	ResultSet rees = pee.selectAllbycin(cins);
	%>
	
	
	<div class="card text-center">
              <div class="card-header">
                <ul class="nav nav-tabs card-header-tabs">
                  <li class="nav-item">
                    <a class="nav-link active" href="#noteAd" data-toggle="tab">note administratif</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link " href="#notePro" data-toggle="tab">note prospection</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="#NoteAdministratif" data-toggle="tab">Ajoute Administratif</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="#hello" data-toggle="tab">Ajouter note prospection</a>
                  </li>
                  
                  
                </ul>
              </div>    
              <div class="tab-content">  
                  <div class="card-body tab-pane active" role="tabpanel" id="noteAd">
                      <table class="table myDatatable" >
                      <thead class="thead-dark">
                        <tr class="text-center" >
                          <th scope="col" >Nom En Francais</th>
                          <th scope="col">الاسم بالعربية</th>
                          <th scope="col">Note adminstratif</th>
                     
                        </tr>
                      </thead>
                      <tbody>
                        <%  while(reas.next()){
                          out.write("<tr>");
                              out.write("<td class='align-middle'>"+reas.getString(1)+"</th>");
                              out.write("<td class='align-middle' >"+reas.getString(2)+"</td>");
                              out.write("<td class='align-middle'>"+reas.getString(3)+"</td>");
                          
                            
                              out.write("</tr>");
                          }
                        reas.close();
                          %>
                      </tbody>
                      </table>
                   </div>
                   <div class="card-body tab-pane" role="tabpanel" id="notePro">
                    <table class="table myDatatable" >
                    <thead class="thead-dark">
                      <tr class="text-center" >
                        <th scope="col" >Nom En Francais</th>
                        <th scope="col">الاسم بالعربية</th>
                        <th scope="col">Note prospection</th>
                        <th scope="col">Date obtention</th>
                   
                      </tr>
                    </thead>
                    <tbody>
                      <%  while(rees.next()){
                        out.write("<tr>");
                            out.write("<td class='align-middle'>"+rees.getString(1)+"</th>");
                            out.write("<td class='align-middle' >"+rees.getString(2)+"</td>");
                            out.write("<td class='align-middle'>"+rees.getString(3)+"</td>");
                            out.write("<td class='align-middle'>"+rees.getString(4)+"</td>");
                         
                          
                            out.write("</tr>");
                        }
                      rees.close();
                        %>
                    </tbody>
                    </table>
                 </div>
                  <div class="card-body tab-pane" role="tabpanel" id="NoteAdministratif">
                      <div class="row justify-content-center">
                           <div class="col-6 " >
           
                              <form method="post" action="Notes">
                                  
                              <%out.write("<input type='text' class=''  style='display: none;' name='PersonnelID' value='"+cins+"'>"); %>
  
                                  <div class="form-group">
                                    <label for="exampleInputEmail1">La Note Administratif</label>
                                    <input type="text" class="form-control"  name="NoteAdministratif" id="" >
                                    <small id="emailHelp" class="form-text text-muted">Inserer la Mission</small>
                                  </div>
  
                                  <input type="submit" name="actionID" class="btn btn-primary" value="enregestrer">
                                 
                                </form>
                             
                          </div>
                      </div>
                  </div>
                  <div class="card-body tab-pane" role="tabpanel" id="hello">
                    <div class="row justify-content-center">
                         <div class="col-6 " >
         
                            <form method="post" action="Notes">
                                <%out.write("<input type='text' class=''  style='display: none;' name='PersonnelID' value='"+cins+"'>"); %>
                              

                                <div class="form-group">
                                  <label for="exampleInputEmail1">note prospection</label>
                                  
                                  <input type="text" class="form-control"  name="NoteProspection" id="" >
                                  <small id="emailHelp" class="form-text text-muted">Inserer la Mission</small>
                                </div>

                                <div class="form-group">
                                  <label for="exampleInputEmail1">Date obtention Pro </label>
                                  <input type="date" class="form-control"  name="DateobtentionPro" id="" >
                                  <small id="emailHelp" class="form-text text-muted">Inserer la Mission</small>
                                </div>

                                <input type="submit" name="actionID" class="btn btn-primary" value="enregestrer">
                               
                              </form>
                           
                        </div>
                    </div>
                </div>
              </div>  
 </div>
