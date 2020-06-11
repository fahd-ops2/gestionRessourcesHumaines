package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Absence;
import classes.Admin;
import DAO.AbsenceDao;
import DAO.AdminDao;

/**
 * Servlet implementation class ServletAbsence
 */
@WebServlet("/ServletAbsence")
public class ServletAbsence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private AbsenceDao absencedao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAbsence() {
    	absencedao=new AbsenceDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionID = request.getParameter("actionID");
		//ajout Admin
		
		if(actionID.equals("ajouterAb")){
			String duree= request.getParameter("duree");
			String DateAbsence= request.getParameter("DateAbsence");
			String justification= request.getParameter("justification");
			String idperso=request.getParameter("idperso");
			Absence e =new Absence(idperso,duree,justification,DateAbsence);
			System.out.println(e.toString());
	       try { 
	    	AbsenceDao Absdao= new AbsenceDao();
	    	Absdao.insertAbsence(e);
			System.out.println("yes");
		} catch (Exception e1) {
			System.out.println("not");
		}
	       this.getServletContext().getRequestDispatcher("/ShowAbsences.jsp").forward(request, response);
		}
	}

}
