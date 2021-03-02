package cn.zhen77;

import cn.zhen77.service.DemoService;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author : zhen77
 * @date: 2021/3/2 - 03 - 02 - 22:31
 * @Description: cn.zhen77
 * @version: 1.0
 */
public class ClientDemo {
    public static void main(String[] args) {
        try {
            DemoService demoSevice = (DemoService) Naming.lookup("rmi://localhost:8989/demoService");
            String result = demoSevice.demo("zhen77");
            System.out.println(result);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
