package cn.cggeeker.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * @Auther:CG
 * @Date:2019/6/11/011
 * @Description:cn.cggeeker.util
 * @version:1.0
 */
public class CurrentTime {
    //获取当前网络时间
    /*@Test */ //测试
    public long getWebsiteDatetime(){
        try {
            String baiduUrl = "https://www.baidu.com";//百度
            URL url = new URL(baiduUrl);// 取得资源对象
            URLConnection uc = url.openConnection();// 生成连接对象
            uc.connect();// 发出连接
            long ldtime = uc.getDate();// 读取网站日期时间
            System.out.println("打印当前时间戳为："+ldtime);
            Date date = new Date(ldtime/1000);// 转换为标准时间对象
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);// 输出北京时间
            System.out.println("当前标准时间格式："+sdf.format(date));
            return ldtime;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
