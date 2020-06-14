package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EtablismentDao;
import classes.Etablisment;

/**
 * Servlet implementation class ServletMission
 */
@WebServlet("/ServletMission")
public class ServletMission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMission() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionID = request.getParameter("actionID");
		if(actionID.equals("affecter")){
			int PersonnelID= Integer.parseInt(request.getParameter("PersonnelID"));
			String Mission= request.getParameter("Mission");
			String Date_debut= request.getParameter("Date_debut");
			String Date_fin=request.getParameter("Date_fin");
			String Etablissement_ville= request.getParameter("Etablissement_ville");
			int CodeLM= Integer.parseInt(request.getParameter("CodeLM"));
			Etablisment etab = new Etablisment(CodeLM,Etablissement_ville,Mission,Date_debut,Date_fin,PersonnelID);
			System.out.println(etab.toString());
			try {
				EtablismentDao etabdao = new EtablismentDao();
				etabdao.insertEtablisment(etab);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/showMissions.jsp").forward(request, response);
	}
	}
}
