package Servlests;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@author 19214290020
 */
@WebServlet(name = "CicloVidaServlet", urlPatterns = {"/CicloVidaServlet"})
public class CicloVidaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("Executando CicloVidaServlet...");
        resp.sendRedirect(req.getContextPath()+"+/index.jsp");
  
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Finalizando CicloVidaServlet...");
    }

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }

}