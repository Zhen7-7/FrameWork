package cn.zhen77.controller;

import cn.zhen77.service.CityService;
import cn.zhen77.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/5/25 - 05 - 25 - 16:25
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/add")
    public String add(@RequestParam("id") Integer id,@RequestParam("name") String name){
        City city = new City(id, name);
        cityService.add(city);
        return "add";
    }
    @RequestMapping("/list")
    public String getAll(Model model){
        System.out.println("________________");
        List<City> list = cityService.getAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("addpage")
    public String go(){
        return "add";
    }
}
