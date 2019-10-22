package com.a2dict.a2dall;

import com.a2dict.a2dall.domain.People;
import com.a2dict.a2dall.domain.query.QPeople;
import io.ebean.DB;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class A2dallApplicationTests {

    @Test
    void contextLoads() {
        for (int i = 0; i < 10; i++) {
            People p = new People()
                    .setId("id" + i)
                    .setName("name" + i);
            DB.save(p);
        }

        List<People> list = new QPeople()
                .id.ge("id3")
                .setMaxRows(3)
                .findList();
        System.out.println(list.size());
        System.out.println(list);

    }

}
