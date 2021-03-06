package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BEAN.danhsachdetai;
import DAO.selectDSdetaicuatoi;

/**
 * Servlet implementation class DSdetaicuatoiController
 */
@WebServlet("/DSdetaicuatoiController")
public class DSdetaicuatoiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DSdetaicuatoiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		List<danhsachdetai> list = selectDSdetaicuatoi.DisplayList(session.getAttribute("MSGV").toString());
		System.out.println("1111zzz11");
		request.setAttribute("listdanhsachdetai", list);
		
		RequestDispatcher rd= request.getRequestDispatcher("JSP/danhsachdetaicuatoi.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
