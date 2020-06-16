package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DiplomePDao;
import DAO.DiplomeSuDao;
import classes.DiplomeP;
import classes.DiplomeSu;

/**
 * Servlet implementation class ServletDiplomeSu
 */
@WebServlet("/ServletDiplomeSu")
public class ServletDiplomeSu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDiplomeSu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("diplomesu");
	}

	/**
	 * @ HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionID = request.getParameter("actionID");
		if(actionID.equals("ajoutdiplomep")){
			int PersonnelID= Integer.parseInt(request.getParameter("PersonnelID"));
			String DiplomeP = request.getParameter("DiplomeP");
			String DateObtentionP = request.getParameter("DateObtentionP");
			String Specialitee = request.getParameter("Specialitee");
			int CodeS = Integer.parseInt(request.getParameter("CodeS"));
			DiplomeP dip= new DiplomeP(PersonnelID, CodeS, Specialitee, DiplomeP, DateObtentionP);
			System.out.println(dip.toString());
			try {
				DiplomePDao dipdao= new DiplomePDao();
				dipdao.insertDiplomeP(dip);
				System.out.println("yeees");
			} catch (Exception e) {
				System.out.println("nooo");
			}
			this.getServletContext().getRequestDispatcher("/mainProfile.jsp").forward(request, response);
		}
		if(actionID.equals("ajoutdiplomesu")){
			int PersonnelID= Integer.parseInt(request.getParameter("PersonnelID"));
			String DiplomeSU = request.getParameter("DiplomeSU");
			String DateobtentionSu = request.getParameter("DateobtentionSu");
			String Faculte = request.getParameter("Faculte");
			String Specialitee = request.getParameter("Specialitee");
			int CodeS = Integer.parseInt(request.getParameter("CodeS"));
			DiplomeSu dips= new DiplomeSu(PersonnelID,CodeS,DiplomeSU,Faculte,Specialitee,DateobtentionSu);
			System.out.println(dips.toString());
			try {
				DiplomeSuDao dipsdao= new DiplomeSuDao();
				dipsdao.insertDiplomeSu(dips);
				System.out.println("yeees");
			} catch (Exception e) {
				System.out.println("nooo");
			}
			this.getServletContext().getRequestDispatcher("/mainProfile.jsp").forward(request, response);
		}
	}

}
