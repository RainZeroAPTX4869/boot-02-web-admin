package com.rain.admin.service.impl;

import com.rain.admin.bean.BaseStoreMac;
import com.rain.admin.dao.BaseStoreMacDao;
import com.rain.admin.service.BaseStoreMacService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 门店MAC地址(BaseStoreMac)表服务实现类
 *
 * @author rain
 * @since 2021-03-08 11:27:00
 */
@Service("BasestoremacService")
public class BaseStoreMacServiceImpl implements BaseStoreMacService {
    @Resource
    private BaseStoreMacDao basestoremacDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BaseStoreMac queryById(String id) {
        return this.basestoremacDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BaseStoreMac> queryAllByLimit(int offset, int limit) {
        return this.basestoremacDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basestoremac 实例对象
     * @return 实例对象
     */
    @Override
    public BaseStoreMac insert(BaseStoreMac basestoremac) {
        this.basestoremacDao.insert(basestoremac);
        return basestoremac;
    }

    /**
     * 修改数据
     *
     * @param basestoremac 实例对象
     * @return 实例对象
     */
    @Override
    public BaseStoreMac update(BaseStoreMac basestoremac) {
        this.basestoremacDao.update(basestoremac);
        return this.queryById(basestoremac.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basestoremacDao.deleteById(id) > 0;
    }
}