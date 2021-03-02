package cn.zhen77;

import cn.zhen77.impl.DemoServiceImpl;
import cn.zhen77.service.DemoService;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author : zhen77
 * @date: 2021/3/2 - 03 - 02 - 22:19
 * @Description: cn.zhen77
 * @version: 1.0
 *
 * 服务器
 */
public class DemoServer {
    public static void main(String[] args) {
        try {
            //创建接口实例
            DemoService demoService = new DemoServiceImpl();
            //创建注册表
            LocateRegistry.createRegistry(8989);
            //绑定服务:发送到注册表里,这里不再使用的是http协议而是我们的rmi,第一个url随便写
            //但是  第二个参数必须是我们的服务器的实例
            Naming.bind("rmi://localhost:8989/demoService",demoService);
            System.out.println("服务器启动成功!");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
