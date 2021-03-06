package cn.zhen77.service;

import cn.zhen77.mapper.CityMapper;
import cn.zhen77.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/5/25 - 05 - 25 - 16:20
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class CityService {
    @Autowired
    private CityMapper cityMapper;
    public List<City> getAll(){
        List<City> all = cityMapper.findAll();
        return all;
    }
    public String add(City city){
        try {
            cityMapper.add(city);
            return "添加成功";
        } catch (Exception e) {
            return "添加失败";
        }
    }
}
