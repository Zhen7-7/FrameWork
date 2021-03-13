package cn.zhen77.controller;

import cn.zhen77.pojo.Person;
import cn.zhen77.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/13 - 03 - 13 - 20:28
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/show")
    @ResponseBody
    public List<Person> show()
    {
        return personService.show();
    }
}
