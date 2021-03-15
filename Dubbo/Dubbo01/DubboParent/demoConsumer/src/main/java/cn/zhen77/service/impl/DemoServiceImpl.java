package cn.zhen77.service.impl;

import cn.zhen77.dubbo.service.DemoDubboService;
import cn.zhen77.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;

import org.springframework.stereotype.Service;

/**
 * @author : zhen77
 * @date: 2021/3/14 - 03 - 14 - 22:43
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
/*一定要从spring中去注入
* 现在使用dubbo有一些变化了,以前我们使用注解注入的时候在创建对象时使用的是@Autowired
* 而现在替换成@reference 而且是apache dubbo下的  这个注解简化了RMI远程调用的代码
* */
@Service
public class DemoServiceImpl implements DemoService {
    @Reference
    private DemoDubboService demoDubboService;
    @Override
    public String consumerDemo() {
        return demoDubboService.demo("哈喽");
    }
}
