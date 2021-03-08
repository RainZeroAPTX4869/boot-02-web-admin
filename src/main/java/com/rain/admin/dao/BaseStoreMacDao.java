package com.rain.admin.dao;

import com.rain.admin.bean.BaseStoreMac;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 门店MAC地址(BaseStoreMac)表数据库访问层
 *
 * @author rain
 * @since 2021-03-08 11:27:00
 */
public interface BaseStoreMacDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BaseStoreMac queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BaseStoreMac> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param basestoremac 实例对象
     * @return 对象列表
     */
    List<BaseStoreMac> queryAll(BaseStoreMac basestoremac);

    /**
     * 新增数据
     *
     * @param basestoremac 实例对象
     * @return 影响行数
     */
    int insert(BaseStoreMac basestoremac);

    /**
     * 修改数据
     *
     * @param basestoremac 实例对象
     * @return 影响行数
     */
    int update(BaseStoreMac basestoremac);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}