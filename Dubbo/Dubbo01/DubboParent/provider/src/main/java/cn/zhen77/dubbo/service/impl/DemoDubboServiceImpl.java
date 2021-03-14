package cn.zhen77.dubbo.service.impl;

import cn.zhen77.dubbo.service.DemoDubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author : zhen77
 * @date: 2021/3/14 - 03 - 14 - 22:09
 * @Description: cn.zhen77.dubbo.service.impl
 * @version: 1.0
 * 重点来了 ,拿小本本记号,这里是接口的实现类没错吧,一定要加@Service
 * 但是 一定要不要加入Spring的@Service 一定要加入 dubbo的@Service
 * 到了Consumer去添加spring的注解
 */

@Service
public class DemoDubboServiceImpl implements DemoDubboService {

    @Override
    public String demo(String param) {
        System.out.println("执行demo....");
        return param+"123";
    }
}
