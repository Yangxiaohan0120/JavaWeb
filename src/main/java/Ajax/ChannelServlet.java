package Ajax;

import com.alibaba.fastjson.JSON;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Yang
 * created 2022-06-19 16:39
 **/

@WebServlet("/Channel")
public class ChannelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String level = req.getParameter("level");
        String parent = req.getParameter("parent");

        List chlist = new ArrayList();
        if(level.equals("1")){
            chlist.add(new Channel("AI","前沿/区块链/人工智能"));
            chlist.add(new Channel("WEB","前端/小程序/JS"));
        }else if(level.equals("2")){
            if(parent.equals("AI")){
                chlist.add(new Channel("micro","微服务"));
                chlist.add(new Channel("blockchain","区块链"));
                chlist.add(new Channel("other","..."));
            }else if(parent.equals("WEB")){
                chlist.add(new Channel("html","HTML"));
                chlist.add(new Channel("css","CSS"));
                chlist.add(new Channel("other","..."));
            }
        }
        String json = JSON.toJSONString(chlist);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(json);
    }
}
