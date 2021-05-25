package mapper;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.City;

import java.util.*;

/**
 * @author : zhen77
 * @date: 2021/5/25 - 05 - 25 - 16:10
 * @Description: mapper
 * @version: 1.0
 */
public class CityMapper {
    static Map<Integer,City> dataMap = Collections.synchronizedMap(new HashMap<Integer, City>());

    public void add(City  city) throws Exception {
        City  data = dataMap.get(city.getID());
        if(data!=null){
             throw  new Exception("数据已存在");
        }
        dataMap.put(city.getID(),city);
    }
    public List<City> findAll(){
        return  new ArrayList<>(dataMap.values());
    }

}
