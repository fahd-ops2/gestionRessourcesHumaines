package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.*;
import classes.*;

/**
 * Servlet implementation class ServletMp
 */
@WebServlet("/ServletMp")
public class ServletMp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionID = request.getParameter("actionID");
		//ajout Admin
		
		if(actionID.equals("mpsAjout")){
			int matiere= Integer.parseInt(request.getParameter("matiere"));
			int idp= Integer.parseInt(request.getParameter("id"));
			Mp mp =new Mp(matiere,idp);
			System.out.println(mp.toString());
	
	       try { 
	    	MpDao mpdao= new MpDao();
			mpdao.insertMp(mp);
			System.out.println("yes");
		} catch (Exception e1) {
			System.out.println("not");
		}
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionID = request.getParameter("actionID");
		//ajout Admin
		
		if(actionID.equals("mpsAjout")){
			int matiere= Integer.parseInt(request.getParameter("matiere"));
			int idp= Integer.parseInt(request.getParameter("id"));
			Mp mp =new Mp(matiere,idp);
			System.out.println(mp.toString());
	
	       try { 
	    	MpDao mpdao= new MpDao();
			mpdao.insertMp(mp);
			System.out.println("yes");
		} catch (Exception e1) {
			System.out.println("not");
		}
	       this.getServletContext().getRequestDispatcher("/Afectationmatiere.jsp").forward(request, response);
		}
	}}


