import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalServlet", value = "/display-discount")
public class DiscountCalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String desc= request.getParameter("desc");
        float price= Float.parseFloat(request.getParameter("price"));
        float discount= Float.parseFloat(request.getParameter("discount"));
        float amount= price * discount * 0.01f;
        float disc_price= price - amount;
        PrintWriter writer= response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Discount Amount: "+amount+"</h2>");
        writer.println("<h2>Discount Price: "+disc_price+"</h2>");
        writer.println("</html>");

    }
}
