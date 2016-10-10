package com.shadow.cloud.city;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shadow.cloud.Repository.CityRepository;
import com.shadow.cloud.domain.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

//把文件中的内容存到mongo中
@RunWith(SpringRunner.class)
@SpringBootTest
public class InputSource {

    @Autowired
    CityRepository cityRepository;

    @Test
    public void InsertToMongo() {

        org.springframework.core.io.Resource fileRource = new ClassPathResource("city.list.json");
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null; //用于包装InputStreamReader,提高处理性能。因为BufferedReader有缓冲的，而InputStreamReader没有。
        try {
            String str = "";
            String str1 = "";
            fis = new FileInputStream(fileRource.getFile());// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                City city = JSON.parseObject(str, City.class);

                //---------------insert in to mongo------------------

                cityRepository.save(city);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                isr.close();
                fis.close();
                // 关闭的时候最好按照先后顺序关闭最后开的先关闭所以先关s,再关n,最后关m
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void FindCityById() {
        City city = cityRepository.findBy_id("523523");
    }


    @Test
    public void FindCityByName() {
        City city = cityRepository.findByName("Botswana");
    }
}