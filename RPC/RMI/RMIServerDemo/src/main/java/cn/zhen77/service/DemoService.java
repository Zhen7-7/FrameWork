package cn.zhen77.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author : zhen77
 * @date: 2021/3/2 - 03 - 02 - 22:09
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
public interface DemoService extends Remote {
    String demo(String param) throws RemoteException;
}
