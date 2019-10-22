package cn.kgc.tangcc.tcbd.nk.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/serviet01")

public class serviet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public serviet01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通过转发的方式转发到index.jsp页面
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
		//通过转发的方式转发到new文件夹下的newindex.jsp页面
		//request.getRequestDispatcher("new/newindex.jsp").forward(request, response);
		//通过重定向的方式跳转到index.jsp页面
		response.sendRedirect("Webservle/index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
