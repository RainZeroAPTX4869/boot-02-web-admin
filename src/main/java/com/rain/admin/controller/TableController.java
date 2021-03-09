package com.rain.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rain.admin.bean.BaseStoreMac;
import com.rain.admin.bean.User;
import com.rain.admin.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/03/03 16:31
 */
@Controller
public class TableController {

    @Autowired
    TableService tableService;

    @GetMapping("basic_table")
    public String basicTable() {
        return "table/basic_table";
    }

    @GetMapping("dynamic_table")
    public String dynamicTable(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
//        List<BaseStoreMac> baseStoreMacList = tableService.list();
//        model.addAttribute("baseStoreMac",baseStoreMacList);
        Page<BaseStoreMac> baseStoreMacPage = new Page<>(pn, 10);
        Page<BaseStoreMac> page = tableService.page(baseStoreMacPage, null);
        model.addAttribute("page", page);
        return "table/dynamic_table";
    }

    @GetMapping("responsive_table")
    public String responsiveTable() {
        return "table/responsive_table";
    }

    @GetMapping("editable_table")
    public String editableTable(Model model) {
        List<User> users = Arrays.asList(new User("zhangsan", "123"),
                new User("lisi", "456"),
                new User("wangwu", "789"));
        model.addAttribute("users", users);
        return "table/editable_table";
    }

}
