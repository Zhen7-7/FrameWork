package cn.zhen77.httpclient;

import cn.zhen77.bean.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import javax.swing.text.html.parser.Entity;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

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
    @Test
    public void testPostDemo(){
        try {
            //1.创建http工具（理解成:浏览器） 发起请求，解析响应
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //2.创建HttpPOST请求对象
            HttpPost post = new HttpPost("http://localhost:8080/demo");
            //2.1 创建请求参数
            List<NameValuePair> params = new ArrayList<>();
            //2.2因为NameValuePair是接口不能直接获取,因为要先获取其实现类BasicNamevaluePair
            params.add(new BasicNameValuePair("param","123"));
            //2.3创建HttpEntity接口的文本实现类的对象，放入参数并设置编码
            HttpEntity httpEntity = new UrlEncodedFormEntity(params,"utf-8");//多态,接口类型指向实现类
            //2.4放入到HttpPost对象中
            post.setEntity(httpEntity);
            //3.创建响应对象
            CloseableHttpResponse response = httpClient.execute(post);
            //4.由于响应体是字符串，因此把HttpEntity类型转换为字符串类型
            String result = EntityUtils.toString(response.getEntity());
            //5.输出结果
            System.out.println(result);
            //6.释放资源
            response.close();
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //结果:zhangsanabc

    }

    /*相应对象转换为json格式的字符串*/
    @Test
    public void testObjectPostDemo(){
        try {
            //1.创建http工具(浏览器)
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //2.创建httpPost请求对象
            HttpPost httpPost = new HttpPost("http://localhost:8080/demo2");
            //3.创建参数
            List<NameValuePair> param = new ArrayList<>();
            param.add(new BasicNameValuePair("id","1"));
            param.add(new BasicNameValuePair("name","小皮皮"));
            //由于响应体是字符串，因此把HttpEntity类型转换为字符串类型
            HttpEntity httpEntity = new UrlEncodedFormEntity(param,"utf-8");

            //4.获取相应对象
            httpPost.setEntity(httpEntity);
            CloseableHttpResponse response = httpClient.execute(httpPost);

            String content = EntityUtils.toString(response.getEntity());
            //打印出来是json格式,有的时候我们希望获得的是User对象,所以我们需要在客户端也创建User对象
            System.out.println(content);

            //jackson 把字符串转换为对象
            ObjectMapper objectMapper = new ObjectMapper();
            User user = objectMapper.readValue(content, User.class);
            System.out.println(user);

            //使用jackson把对象转为json
            String userjson = objectMapper.writeValueAsString(user);
            System.out.println(userjson);

            response.close();
            httpClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
