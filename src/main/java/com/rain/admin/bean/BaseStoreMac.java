package com.rain.admin.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 门店MAC地址(BaseStoreMac)实体类
 *
 * @author rain
 * @since 2021-03-08 11:27:00
 */
@Data
@TableName(value = "baseStoreMac")
public class BaseStoreMac implements Serializable {
    private static final long serialVersionUID = -82042376342155163L;
    
    private String id;
    /**
    * 门店ID
    */
    private String storeid;
    
    private String storecode;
    /**
    * 门店名称
    */
    private String storename;
    /**
    * MAC地址
    */
    private String macid;
    /**
    * 状态：-1删除0禁用1正常
    */
    private Integer status;
    /**
    * 创建时间
    */
    private Date createdate;
    /**
    * 修改时间
    */
    private Date modifydate;
    /**
    * 备注
    */
    private String remark;

    public BaseStoreMac(String id, String storeid, String storecode, String storename, String macid, Integer status, Date createdate, Date modifydate, String remark) {
        this.id = id;
        this.storeid = storeid;
        this.storecode = storecode;
        this.storename = storename;
        this.macid = macid;
        this.status = status;
        this.createdate = createdate;
        this.modifydate = modifydate;
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getStorecode() {
        return storecode;
    }

    public void setStorecode(String storecode) {
        this.storecode = storecode;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getMacid() {
        return macid;
    }

    public void setMacid(String macid) {
        this.macid = macid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}