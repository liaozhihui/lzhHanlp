package com.hankcs.book;
import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.collection.trie.bintrie.BaseNode;
public class Demo01 {
    public static void main(String[] args)
    {
//        HanLP.Config.enableDebug();
        System.out.println(HanLP.segment("����ά�ͷ���Ա"));
    }
}
