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
		//ͨ��ת���ķ�ʽת����index.jspҳ��
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
		//ͨ��ת���ķ�ʽת����new�ļ����µ�newindex.jspҳ��
		//request.getRequestDispatcher("new/newindex.jsp").forward(request, response);
		//ͨ���ض���ķ�ʽ��ת��index.jspҳ��
		response.sendRedirect("Webservle/index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
