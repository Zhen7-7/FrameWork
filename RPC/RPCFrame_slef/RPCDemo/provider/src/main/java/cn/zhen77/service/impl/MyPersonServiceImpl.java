package cn.zhen77.service.impl;

import cn.zhen77.pojo.Person;
import cn.zhen77.service.MyPersonService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/13 - 03 - 13 - 19:54
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
public class MyPersonServiceImpl extends UnicastRemoteObject implements MyPersonService {
    public  MyPersonServiceImpl() throws RemoteException {
    }

    @Override
    public List<Person> findAll() throws RemoteException {
        List<Person> personList = new ArrayList<Person>();
        //这是往集合里添加的是对象;
        personList.add(new Person(1,"孙朕"));
        personList.add(new Person(2,"莫玉丹"));
        return personList;
    }
}
