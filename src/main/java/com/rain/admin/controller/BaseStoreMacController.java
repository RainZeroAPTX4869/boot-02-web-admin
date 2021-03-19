package com.rain.admin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rain.admin.bean.BaseStoreMac;
import com.rain.admin.service.BaseStoreMacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 门店MAC地址(BaseStoreMac)表控制层
 *
 * @author rain
 * @since 2021-03-08 11:27:00
 */
@Controller
public class BaseStoreMacController {
    /**
     * 服务对象
     */
    @Autowired
    private BaseStoreMacService basestoremacService;
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ResponseBody
    @GetMapping("selectOne")
    public String selectOne(@RequestParam("id") String id) throws JsonProcessingException {
        BaseStoreMac baseStoreMac = this.basestoremacService.queryById(id);
        return objectMapper.writeValueAsString(baseStoreMac);

    }

    @ResponseBody
    @GetMapping("select")
    public String select(@RequestParam("offset") int offset, @RequestParam("limit") int limit) throws JsonProcessingException {
        List<BaseStoreMac> baseStoreMacs = this.basestoremacService.queryAllByLimit(offset, limit);
        return objectMapper.writeValueAsString(baseStoreMacs);
    }

}