package cn.zhen77.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author : zhen77
 * @date: 2021/2/4 - 02 - 04 - 13:11
 * @Description: cn.zhen77.util
 * @version: 1.0
 */
public class MyDateConverter implements Converter<String,Date> {


    @Override
    public Date convert(String s) {
        Date dt = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            dt=sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  dt;
    }
}
