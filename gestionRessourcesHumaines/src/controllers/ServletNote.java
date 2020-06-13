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
 * Servlet implementation class ServletNote
 */
@WebServlet("/ServletNote")
public class ServletNote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionID = request.getParameter("actionID");
		//ajout  d'une note administratif
		if (actionID.equals("addNotea")){
			int PersonnelID= Integer.parseInt(request.getParameter("PersonnelID"));
			float NoteAdministratif= Float.parseFloat(request.getParameter("NoteAdministratif"));
			NoteAdmin na= new NoteAdmin(PersonnelID,NoteAdministratif);
			System.out.println(na.toString());
			try {
				NoteAdminDao nao= new NoteAdminDao();
				nao.insertNoteAdmin(na);
			} catch (Exception e) {
				System.out.println("not");
			}
			this.getServletContext().getRequestDispatcher("/ShowNotes.jsp").forward(request, response);
		}
		if (actionID.equals("addNotep")){
			int PersonnelID= Integer.parseInt(request.getParameter("PersonnelID"));
			float NoteProspection= Float.parseFloat(request.getParameter("NoteProspection"));
			String DateobtentionPro= request.getParameter("DateobtentionPro");
			NoteProsp na= new NoteProsp(PersonnelID,NoteProspection,DateobtentionPro);
			System.out.println(na.toString());
			try {
				NoteProspDao nao= new NoteProspDao();
				nao.insertNoteProsp(na);
			} catch (Exception e) {
				System.out.println("not");
			}
			this.getServletContext().getRequestDispatcher("/ShowNotes.jsp").forward(request, response);
		}
	}

}
