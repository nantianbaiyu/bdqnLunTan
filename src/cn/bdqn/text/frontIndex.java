package cn.bdqn.text;


import cn.bdqn.text.entity.Entries;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebServlet("/list.do")
public class frontIndex extends HttpServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //轮播的 文章
      List<Entries> entries = getListEntries();
        request.setAttribute("entries",entries);
        request.getRequestDispatcher("frontIndex.jsp").forward(request, response);
    }
    private List<Entries> getListEntries(){
        List<Entries> entriesList = new ArrayList<Entries>();
        //写入对象
        entriesList.add(new Entries(1, "人为何是呢嘛要吃饭", "饿了", 12, 12,
                0, 3, new Date(), new Date(), 99, ""));
        entriesList.add(new Entries(2, "人为何是呢嘛要吃饭", "饿了", 12, 12,
                0, 3, new Date(), new Date(), 99, ""));
        entriesList.add(new Entries(3, "人为何是呢嘛要吃饭", "饿了", 12, 12,
                0, 3, new Date(), new Date(), 99, ""));
        entriesList.add(new Entries(4, "人为何是呢嘛要吃饭", "饿了", 12, 12,
                0, 3, new Date(), new Date(), 99, ""));
        entriesList.add(new Entries(5, "人为何是呢嘛要吃饭", "饿了", 12, 12,
                0, 3, new Date(), new Date(), 99, ""));
        return  entriesList;
    }
}
