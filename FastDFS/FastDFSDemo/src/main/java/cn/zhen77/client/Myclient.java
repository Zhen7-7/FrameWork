package cn.zhen77.client;

import cn.zhen77.utils.FastDFSClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.UUID;

/**
 * @author : zhen77
 * @date: 2021/3/18 - 03 - 18 - 18:33
 * @Description: cn.zhen77.client
 * @version: 1.0
 */
public class Myclient {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Zhen77\\Desktop\\logo.png");
            InputStream is = new FileInputStream(file);
            String fileName = UUID.randomUUID().toString()+".png";
            String[] result = FastDFSClient.uploadFile(is, fileName);
            System.out.println(Arrays.toString(result));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
