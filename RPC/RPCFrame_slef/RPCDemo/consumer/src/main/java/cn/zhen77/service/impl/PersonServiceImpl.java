package cn.zhen77.service.impl;

import cn.zhen77.pojo.Person;
import cn.zhen77.service.MyPersonService;
import cn.zhen77.service.PersonService;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/13 - 03 - 13 - 20:24
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public List<Person> show() {
        try {
            ZooKeeper zooKeeper = new ZooKeeper("192.168.91.128:2181", 100000, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {
                    System.out.println("连接成功");
                }
            });
            //获取数据
            byte[] result = zooKeeper.getData("/rpc/provider", false, null);
            MyPersonService myPersonService = (MyPersonService) Naming.lookup(new String(result));
            return myPersonService.findAll();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
