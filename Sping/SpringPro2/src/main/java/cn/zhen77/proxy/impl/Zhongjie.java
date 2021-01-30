package cn.zhen77.proxy.impl;

import cn.zhen77.proxy.ZuFang;
import com.sun.media.jfxmedia.events.NewFrameEvent;

/**
 * @author : zhen77
 * @date: 2021/1/30 - 01 - 30 - 15:49
 * @Description: cn.zhen77.proxy.impl
 * @version: 1.0
 */
public class Zhongjie implements ZuFang {
    private FangDong fangDong = new FangDong();


    public void zuFang() throws Exception {
        System.out.println("收取房东中介费");
        fangDong.zuFang();
        System.out.println("收取租客中介费");
    }
}
