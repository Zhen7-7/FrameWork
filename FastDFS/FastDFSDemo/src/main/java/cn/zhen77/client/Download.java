package cn.zhen77.client;

import cn.zhen77.utils.FastDFSClient;

import java.io.*;

/**
 * @author : zhen77
 * @date: 2021/3/18 - 03 - 18 - 18:39
 * @Description: cn.zhen77.client
 * @version: 1.0
 */
public class Download {

    public static void main(String[] args) {
        try {
            InputStream is = FastDFSClient.downloadFile("group1", "M00/00/00/wKhbgGBTLMWANfxAAAB5ZGJWqvQ546.png");
            OutputStream os = new FileOutputStream(new File("E:/aaaaaa.png"));
            int index = 0 ;
            while((index = is.read())!=-1){
                os.write(index);
            }
            os.flush();
            os.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
