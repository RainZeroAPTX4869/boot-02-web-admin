package com.rain.admin;

import com.rain.admin.bean.BaseStoreMac;
import com.rain.admin.dao.TableMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Boot02WebAdminApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    TableMapper tableMapper;

    @Test
    void contextLoads() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user ");
        for (Map map : maps) {
            System.out.println(map.values());
        }


    }

    @Test
    void findTable() {
        List<BaseStoreMac> baseStoreMacList = tableMapper.selectList(null);
        baseStoreMacList.forEach(System.out::println);


    }

}
