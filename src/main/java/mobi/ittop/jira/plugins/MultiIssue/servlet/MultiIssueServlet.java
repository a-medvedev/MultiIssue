package mobi.ittop.jira.plugins.MultiIssue.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MultiIssueServlet extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(MultiIssueServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>This is a test servlet. Working from doGet Method</body></html>");
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
//    {
//        resp.setContentType("text/html");
//        resp.getWriter().write("<html><body>This is a test servlet. Working from doPost Method</body></html>");
//    }
}