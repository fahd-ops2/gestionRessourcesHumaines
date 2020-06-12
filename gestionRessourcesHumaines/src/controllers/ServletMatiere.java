package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MpDao;
import classes.Mp;

/**
 * Servlet implementation class ServletMatiere
 */
@WebServlet("/ServletMatiere")
public class ServletMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMatiere() {
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
		String action =request.getParameter("aff");
		if(action.equals("mpsAjout")){
			
			int id=Integer.parseInt(request.getParameter("idp"));
			int mat=Integer.parseInt(request.getParameter("matiere"));
			Mp m = new Mp(mat,id);
			System.out.println(m.toString());
			try{
				MpDao mpdao = new MpDao();
				mpdao.insertMp(m);
				System.out.println("done");
			}
			catch(Exception ex){
				System.out.println("not");
			}
	}}}


