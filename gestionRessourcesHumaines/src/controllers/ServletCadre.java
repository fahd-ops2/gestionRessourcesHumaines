package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CadreDao;
import DAO.MatiereDao;
import classes.Cadre;
import classes.Matiere;

/**
 * Servlet implementation class ServletCadre
 */
@WebServlet("/ServletCadre")
public class ServletCadre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCadre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionID = request.getParameter("actionID");
		if(actionID.equals("ajout")){
			int PersonnelID= Integer.parseInt(request.getParameter("PersonnelID"));
			String Cadre= request.getParameter("Cadre");
			int CodeC= Integer.parseInt(request.getParameter("CodeC"));
			Cadre cadre = new Cadre(PersonnelID,CodeC,Cadre);
			System.out.println(cadre.toString());
			try {
				CadreDao cadredao= new CadreDao();
				cadredao.insertCadre(cadre);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/ShowCadres.jsp").forward(request, response);
	}
	}
	}


