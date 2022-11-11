import Cart.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if (cart == null) {
            cart = new Cart();

            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

//        Integer count = (Integer) session.getAttribute("count");
//        if (count ==0) {
//            session.setAttribute("count", 1);
//            count = 1;
//        }else {
//            session.setAttribute("count",count + 1);
//        }
//
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//
//        PrintWriter pw = response.getWriter();
//
//        pw.println("<html >");
//        pw.println("<h1> Hello, " + name + " " + surname + "</h1>");
//        pw.println("<h1> Your count is! " + count + "</h1>");
//        pw.println("</html >");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
