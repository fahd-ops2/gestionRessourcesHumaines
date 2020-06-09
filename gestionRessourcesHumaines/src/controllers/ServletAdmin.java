package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Admin;

import DAO.AdminDao;


/**
 * Servlet implementation class ServletAdmin
 */
@WebServlet("/ServletAdmin")
public class ServletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAdmin() {
    	
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("delete"));
		AdminDao a=new AdminDao();
		a.deleteAdmin(id);
		this.getServletContext().getRequestDispatcher("/AdminView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("enregistrer").equals("ajouter")){
			String email= request.getParameter("email");
			String password= request.getParameter("password");
			String nom= request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			Admin e =new Admin(email,password,nom,prenom);
			System.out.println(e.toString());
	       try { 
	    	AdminDao Admindao= new AdminDao();
			Admindao.insertAdmin(e);
			System.out.println("yes");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("not");
		}
	}}

}
