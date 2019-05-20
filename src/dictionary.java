import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "dictionary",urlPatterns = "/dictionary")
public class dictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> map = new HashMap<>();
        map.put("hello","xin chao");
        map.put("how","quyen vo");
        String search = request.getParameter("search");
        String result = map.get(search);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if (result != null){
            writer.println("<h1>word " + search +"</h1>");
            writer.println("<h1>result " + result +"</h1>");
        }else {
            writer.println("<h1>not found</h1>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
