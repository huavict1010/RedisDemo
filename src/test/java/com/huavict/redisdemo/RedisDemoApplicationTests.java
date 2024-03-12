package com.huavict.redisdemo;

import com.huavict.redisdemo.bean.Address;
import com.huavict.redisdemo.bean.Family;
import com.huavict.redisdemo.dao.MetadataWithTagDAO;
import com.huavict.redisdemo.dao.po.MetadataWithTagPO;
import com.huavict.redisdemo.bean.Person;
import com.huavict.redisdemo.enums.*;
//import com.huavict.redisdemo.cache.TestCache;
import com.huavict.redisdemo.repository.PersonRepository;
import com.huavict.redisdemo.service.TestCacheService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@EnableCaching
@SpringBootTest
class RedisDemoApplicationTests {
    @Autowired
    private PersonRepository personRepository;
//    @Autowired
//    private TestCache testCache;
    @Autowired
    private TestCacheService testCacheService;
    @Test
    public void testAddPerson() {
        // 添加第一个人
        Address address = new Address("中国", "泸州");
        Family family1 = new Family("儿子", "张晓刚");
        Family family2 = new Family("女儿", "张晓霞");
        List<Family> familyList = new ArrayList<Family>();
        familyList.add(family1);
        familyList.add(family2);
        Person person = new Person("1", "无忌", "张", address, familyList);
        personRepository.save(person);

        // 添加第二个人
        address = new Address("中国", "上海");
        family1 = new Family("儿子", "李功晨");
        family2 = new Family("女儿", "李晓丽");
        familyList = new ArrayList<Family>();
        familyList.add(family1);
        familyList.add(family2);
        person = new Person("2", "承鹏", "李", address, familyList);
        personRepository.save(person);

        // 添加第三个人
        address = new Address("中国", "北京");
        family1 = new Family("儿子", "唐玉海");
        family2 = new Family("女儿", "唐雨涵");
        familyList = new ArrayList<Family>();
        familyList.add(family1);
        familyList.add(family2);
        person = new Person("3", "大明", "唐", address, familyList);
        personRepository.save(person);

        // 添加第四个人
        address = new Address("中国", "北京");
        family1 = new Family("儿子", "张大明");
        family2 = new Family("女儿", "张丽丽");
        familyList = new ArrayList<Family>();
        familyList.add(family1);
        familyList.add(family2);
        person = new Person("4", "文勇", "张", address, familyList);
        personRepository.save(person);

        System.out.println("成功地添加了4条记录~");
    }

    @Test
    void contextLoads() throws Exception {
//        for (int i = 0; i < 10; i ++) {
//            testCache.checkCache(i);
//        }
//        var POS = testCache.checkCache("com.huawei.sd.isdp.sdimp");
        testCacheService.doProcess();
        System.out.println("hello");
    }

}
