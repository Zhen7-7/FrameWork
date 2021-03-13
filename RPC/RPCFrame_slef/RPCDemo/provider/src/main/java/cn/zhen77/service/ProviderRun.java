package cn.zhen77.service;

import cn.zhen77.service.impl.MyPersonServiceImpl;
import org.apache.zookeeper.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author : zhen77
 * @date: 2021/3/13 - 03 - 13 - 19:58
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
public class ProviderRun {
    public static void main(String[] args) {

        try {
            MyPersonService myPersonService = new MyPersonServiceImpl();
            LocateRegistry.createRegistry(8989);
            String url = "rmi://localhost:8989/myPersonService";
            Naming.bind(url,myPersonService);
            System.out.println("RMI 服务启动成功");
            //创建zookeeper并发布信息
            ZooKeeper zooKeeper = new ZooKeeper("192.168.91.128:2181", 100000, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {
                    //可写可不写
                    System.out.println("获取连接");
                }
            });
            zooKeeper.create("/rpc/provider",url.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            System.out.println("注册成功");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
