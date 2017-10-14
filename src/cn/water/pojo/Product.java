package cn.water.pojo;

import java.util.Date;

public class Product {
    private Integer pid;//产品ID

    private String pname;//产品名称

    private Double price;//产品价格

    private Date createdate;//生产日期

    private String mfrs;//生产商

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getMfrs() {
        return mfrs;
    }

    public void setMfrs(String mfrs) {
        this.mfrs = mfrs == null ? null : mfrs.trim();
    }
}