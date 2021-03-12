package cn.zhen77;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/12 - 03 - 12 - 21:18
 * @Description: cn.zhen77
 * @version: 1.0
 */
public class ReciveContent {
    public static void main(String[] args) {
        try {
        /*
        创建zookeeper对象  你别管干啥,创建就完了
        */
            ZooKeeper zooKeeper = new ZooKeeper("192.168.91.128:2181", 100000, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {
                    System.out.println("获取连接");
                }
            });
            //2.从Zookeeper中 获取内容
            //2.1 获取节点
            List<String> list = zooKeeper.getChildren("/demo",false);
            System.out.println(list);//将集合打印出来

            //获取其内容
            for(String child:list){
                //返回的是字节数组
                byte[] result = zooKeeper.getData("/demo/" + child, false, null);
                //这里注意"不要少/demo/"不然会报无节点异常
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
