package cn.zhen77.service;

import cn.zhen77.pojo.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/13 - 03 - 13 - 19:46
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
public interface MyPersonService extends Remote {
    public List<Person> findAll() throws RemoteException;

}
