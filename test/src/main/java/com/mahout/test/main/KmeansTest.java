package com.mahout.test.main;

import org.fnlp.nlp.cn.CNFactory;

/**
 * Created by jiang on 11/2/16.
 */
public class KmeansTest {

    public static void main(String[] args) throws Exception{
        CNFactory factory = CNFactory.getInstance("/Users/jiang/Documents/git/fnlp/models");

        // 使用分词器对中文句子进行分词，得到分词结果
        String[] words = factory.seg("北京大学是北京最好的大学");

        // 打印分词结果
        for(String word : words) {
            System.out.print(word + " ");
        }
    }

}
