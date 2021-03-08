package com.rain.admin.service;

import com.rain.admin.bean.BaseStoreMac;

import java.util.List;

/**
 * 门店MAC地址(BaseStoreMac)表服务接口
 *
 * @author rain
 * @since 2021-03-08 11:27:00
 */
public interface BaseStoreMacService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BaseStoreMac queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BaseStoreMac> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basestoremac 实例对象
     * @return 实例对象
     */
    BaseStoreMac insert(BaseStoreMac basestoremac);

    /**
     * 修改数据
     *
     * @param basestoremac 实例对象
     * @return 实例对象
     */
    BaseStoreMac update(BaseStoreMac basestoremac);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}