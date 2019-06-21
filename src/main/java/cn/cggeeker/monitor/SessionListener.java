package cn.cggeeker.monitor;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Auther:CG
 * @Date:2019/6/21/021
 * @Description:cn.cggeeker.monitor
 * @version:1.0
 */

@WebListener
public class SessionListener implements HttpSessionListener {

    private static int onlineCount = 0;//记录session的数量

    /**
     * session创建后执行
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        onlineCount++;
        System.out.println("【HttpSessionListener监听器】 sessionCreated, onlineCount:" + onlineCount);
        //将最新的onlineCount值存起来
        se.getSession().getServletContext().setAttribute("onlineCount", onlineCount);

    }

    /**
     * session失效后执行
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        if (onlineCount > 0) {
            onlineCount--;
        }
        System.out.println("【HttpSessionListener监听器】 sessionDestroyed, onlineCount:" + onlineCount);
        //将最新的onlineCount值存起来
        se.getSession().getServletContext().setAttribute("onlineCount", onlineCount);
    }

}