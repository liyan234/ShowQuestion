import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 注解的使用 ()包裹多个属性，属性名=属性值的方式，多个之间逗号间隔
// 属性名为value的时候 可以缺省
// servlet定义服务，注意服务路径必须是/开头 否则tomcat就会报错哦

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String n = req.getParameter("username");
        String p = req.getParameter("password");

        if ("abc".equals(n) && "123".equals(p)) {
            // 重定向： http响应状态码为 301/302/307 响应头Location
            resp.sendRedirect("home.html");
        } else {
            PrintWriter pw = resp.getWriter();
            pw.println("登陆失败");
            pw.println("<h3> 用户名 ：" + n + "或密码错误");
            pw.flush();
            pw.close();
        }
    }
}
