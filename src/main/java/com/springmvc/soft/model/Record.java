package com.springmvc.soft.model;

import java.util.Date;

/**
 * Created by 宏锅锅 on 2017/1/2.
 */
public class Record {
    private Date createTime;    //创建时间

    private String createBy;    //创建人

    private Date updateTime;    //修改时间

    private String updateBy;    //修改人

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
