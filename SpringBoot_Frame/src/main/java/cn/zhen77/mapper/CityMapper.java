package cn.zhen77.mapper;

import cn.zhen77.pojo.City;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author : zhen77
 * @date: 2021/5/25 - 05 - 25 - 16:10
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
@Component
public class CityMapper {
    static Map<Integer, City> dataMap = Collections.synchronizedMap(new HashMap<Integer, City>());

    public void add(City  city) throws Exception {
        City  data = dataMap.get(city.getId());
        if(data!=null){
             throw  new Exception("数据已存在");
        }
        dataMap.put(city.getId(),city);
    }
    public List<City> findAll(){
        return  new ArrayList<>(dataMap.values());
    }

}
