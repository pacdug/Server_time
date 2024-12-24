package calculatediscountservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculateDiscount")
public class CalculateDiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy dữ liệu từ form
        String description = request.getParameter("description");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        // Tính toán chiết khấu
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;

        // Hiển thị kết quả
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Discount Calculation Result</h1>");
        out.println("<p><strong>Product Description:</strong> " + description + "</p>");
        out.println("<p><strong>List Price:</strong> $" + listPrice + "</p>");
        out.println("<p><strong>Discount Percent:</strong> " + discountPercent + "%</p>");
        out.println("<p><strong>Discount Amount:</strong> $" + discountAmount + "</p>");
        out.println("<p><strong>Discount Price:</strong> $" + discountPrice + "</p>");
        out.println("</body></html>");
    }
}

