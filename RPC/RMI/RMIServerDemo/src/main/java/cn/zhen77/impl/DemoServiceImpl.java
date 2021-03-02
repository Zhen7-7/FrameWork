package cn.zhen77.impl;

import cn.zhen77.service.DemoService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author : zhen77
 * @date: 2021/3/2 - 03 - 02 - 22:11
 * @Description: cn.zhen77.impl
 * @version: 1.0
 */
public class DemoServiceImpl extends UnicastRemoteObject implements DemoService {
    public DemoServiceImpl() throws RemoteException {
    }

    @Override
    public String demo(String param) throws RemoteException {
        return param +"abc";
    }
}
