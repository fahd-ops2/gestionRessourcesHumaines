<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
 
    <title>Hello</title>
</head>
<body>
  <%@ include file="Index.html" %>

  <div class="container">
  		<div class="card">
  			<div class="card-header">
                  <ul class="nav nav-tabs card-header-tabs ">
                     <li class="nav-item">
                     	<a class="nav-link active" href="#info" data-toggle="tab">Informations</a>
                     </li>
                     <li class="nav-item">
                      <a class="nav-link" href="#dep" data-toggle="tab">Diplomes</a>
                     </li>
                   	 <li class="nav-item">
                        <a class="nav-link" href="#missions" data-toggle="tab">Missions</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="#notes" data-toggle="tab">Notes</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="#cadre" data-toggle="tab">Cadre</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="#matiere" data-toggle="tab">Matiere</a>
                     </li>
                   
                  </ul>
               
            </div>
            <div class="tab-content">
            	<div class="card-body tab-pane active" role="tabpanel" id="info">
            	  <div class="row justify-content-center">
               			 <div class="col-8 ml-auto mr-auto" >
           		 	<%@ include file="showmore.jsp" %>
           		 	</div>
           		 	</div>
            	</div>
            	<div class="card-body tab-pane" role="tabpanel" id="dep">
					<%@ include file="ShowDiplome.jsp" %>
					</div>
            	</div>
             	<div class="card-body tab-pane" role="tabpanel" id="missions">
					<jsp:include page="showMission.jsp" />
            	</div>
            
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