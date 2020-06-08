package controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;










import DAO.PersonnelDao;
import classes.Personnel;

/**
 * Servlet implementation class ServletPersonnel
 */
@WebServlet("/Personnel")
public class ServletPersonnel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPersonnel() {
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


			String str_date = "2007/11/12";
			Date date=new Date(str_date);
			System.out.println(date);
			SimpleDateFormat fr = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(fr.format(date));
			


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String actionID = request.getParameter("actionID");
		
		if(actionID.equals("ajouter")){
			String num_p= request.getParameter("num_p");
			String CIN= request.getParameter("cin");
			request.setAttribute("cin",CIN );
			String Pren_n_arabe= new String(request.getParameter("Pren_n_arabe").getBytes(),"UTF-8");
			String Pren_n=request.getParameter("Pren_n");
			String Datenaissance= request.getParameter("Datenaissance");
			Date date=new Date(Datenaissance);
			SimpleDateFormat fr = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(fr.format(date));
			String Adresse= request.getParameter("adresse");
			String Tel= request.getParameter("Tel");
			String nationalite=request.getParameter("nationalite");
			String sexe=request.getParameter("sexe");
			
			Personnel p =new Personnel(num_p,CIN,Pren_n_arabe,Pren_n,fr.format(date),Adresse,Tel,nationalite,sexe);
			System.out.println(p.toString());
	       try { 
	    	PersonnelDao personneldao= new PersonnelDao();
	    	personneldao.insertPersonnel(p);
			System.out.println("yes");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("not");
		}
	       this.getServletContext().getRequestDispatcher("/suivi.jsp").forward(request, response);  
	}
	 if  (actionID.equals("suivre")){
				
			        String Echelle= request.getParameter("Echelle");
			       
					System.out.println(Echelle);
		}

	}}
