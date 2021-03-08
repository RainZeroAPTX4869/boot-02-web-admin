package com.rain.admin.controller;

import com.rain.admin.bean.BaseStoreMac;
import com.rain.admin.service.BaseStoreMacService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    @Resource
    private BaseStoreMacService basestoremacService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ResponseBody
    @GetMapping("selectOne")
    public BaseStoreMac selectOne(@RequestParam("id") String id) {
        return this.basestoremacService.queryById(id);
    }

}