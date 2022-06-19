package Ajax;

import com.alibaba.fastjson2.JSON;
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
 * created 2022-06-19 14:47
 **/

@WebServlet("/news_list")
public class NewListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //jQuery
        String type = req.getParameter("t");
        List list = new ArrayList();
        if(type != null && type.equals("pypl")){
            list.add(new News("PYPL:2018年5月全球编程语言排行榜","2018-5-1","PYPL","..."));
            list.add(new News("PYPL:2018年6月全球编程语言排行榜","2018-6-1","PYPL","..."));
            list.add(new News("PYPL:2018年7月全球编程语言排行榜","2018-7-1","PYPL","..."));
            list.add(new News("PYPL:2018年8月全球编程语言排行榜","2018-8-1","PYPL","..."));
        }else if(type == null || type.equals("tiobe")) {
            list.add(new News("TIOBE:2018年5月全球编程语言排行榜", "2018-5-1", "TIOBE", "..."));
            list.add(new News("TIOBE:2018年6月全球编程语言排行榜", "2018-6-1", "TIOBE", "..."));
            list.add(new News("TIOBE:2018年7月全球编程语言排行榜", "2018-7-1", "TIOBE", "..."));
            list.add(new News("TIOBE:2018年8月全球编程语言排行榜", "2018-8-1", "TIOBE", "..."));
        }
        String json = JSON.toJSONString(list);
        System.out.println(json);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(json);
    }
}
