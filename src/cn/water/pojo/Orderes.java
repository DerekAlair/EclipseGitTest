package cn.water.pojo;

public class Orderes {
    private Integer oid;//订单ID

    private Integer cid;//客户ID

    private String aera;//区域

    private String pname;//品牌

    private Double price;//价格

    private Integer cycle;//送水周期

    private Integer wnumber;//送水量

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getAera() {
        return aera;
    }

    public void setAera(String aera) {
        this.aera = aera == null ? null : aera.trim();
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

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public Integer getWnumber() {
        return wnumber;
    }

    public void setWnumber(Integer wnumber) {
        this.wnumber = wnumber;
    }
}