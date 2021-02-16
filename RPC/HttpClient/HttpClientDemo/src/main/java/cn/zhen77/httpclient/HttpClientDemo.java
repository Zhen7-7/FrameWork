package cn.zhen77.httpclient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import javax.swing.text.html.parser.Entity;
import java.io.Closeable;
import java.net.URISyntaxException;

/**
 * @author : zhen77
 * @date: 2021/2/16 - 02 - 16 - 21:52
 * @Description: cn.zhen77.httpclient
 * @version: 1.0
 */
public class HttpClientDemo {
    @Test
    public void testGetDemo(){
        try {
            //1.创建Http工具(理解为浏览器) 发送请求,解析响应
            CloseableHttpClient httpClient = HttpClients.createDefault();//固定操作,相当于浏览器
            //2.获取请求路径
            URIBuilder uriBuilder = new URIBuilder("http://localhost:8080/demo");
            uriBuilder.addParameter("param","zhangsan");//键值对形式
            //3.创建httpGet请求对象
            HttpGet httpGet = new HttpGet(uriBuilder.build());
            //4.获取响应 ,创建相应对象
            CloseableHttpResponse response = httpClient.execute(httpGet);
            //5.由于响应体是字符串,因此吧HttpEntity类型转换成为字符串类型,并设置字符集编码
            String result = EntityUtils.toString(response.getEntity(), "utf-8");
            //输出结果
            System.out.println(result);
            //释放资源
            response.close();
            httpClient.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//结果:zhangsanabc
