package com.hankcs.book;
import com.hankcs.hanlp.HanLP;
public class Demo01 {
    public static void main(String[] args)
    {
//        HanLP.Config.enableDebug();
        System.out.println(HanLP.segment("王国维和服务员"));
    }
}
