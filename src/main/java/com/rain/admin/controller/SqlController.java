package com.rain.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/03/05 15:31
 */
@Controller
public class SqlController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String druidQuery() {
        Long result = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        return result.toString();
    }
}
