package com.rain.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.admin.bean.BaseStoreMac;
import com.rain.admin.dao.TableMapper;
import com.rain.admin.service.TableService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/03/08 16:31
 */
@Service
public class TableServiceImpl extends ServiceImpl<TableMapper, BaseStoreMac> implements TableService {
}
