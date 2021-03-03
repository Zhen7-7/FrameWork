package cn.zhen77;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * @author : zhen77
 * @date: 2021/3/3 - 03 - 03 - 21:46
 * @Description: cn.zhen77
 * @version: 1.0
 */
public class SendContent {
    public static void main(String[] args) {
    /*
    * 创建Zookeeper对象
         参数1:zookeeper ip+端口号
         参数2:访问时间设置
         参数3:当连接成功后编写信息
    * */
        try {
            ZooKeeper zooKeeper = new ZooKeeper("192.168.91.128:2181", 10000000, new Watcher() {
                //匿名内部类

                public void process(WatchedEvent watchedEvent) {
                    System.out.println("获取连接");
                }
            });
            /*发送内容向zookeeper服务器
                参数1:发送的文件
                参数2:发送的内容
                参数3:权限
                参数4:内容的格式
                */
            String content = zooKeeper.create("/demo/rmi-address",
                    "rmi:localhost:8080/demoService".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
            System.out.println("content"+content);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }
}
