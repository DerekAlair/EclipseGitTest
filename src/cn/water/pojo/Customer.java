package cn.water.pojo;

public class Customer {
    private Integer cid;//客户ID

    private String cname;//客户姓名

    private String cphone;//客户联系电话

    private String aera;//客户所在区域

    private String caddress;//客户详细地址

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public String getAera() {
        return aera;
    }

    public void setAera(String aera) {
        this.aera = aera == null ? null : aera.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }
}