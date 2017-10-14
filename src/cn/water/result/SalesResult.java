package cn.water.result;

public class SalesResult {

    private String aera;//区域
    
    private String pname;//品牌
    
    private Double price;//单价
    
    private Integer salesNumber;//销售量
    
    private Double totalMoney;//销售金额

	public String getAera() {
		return aera;
	}

	public void setAera(String aera) {
		this.aera = aera;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getSalesNumber() {
		return salesNumber;
	}

	public void setSalesNumber(Integer salesNumber) {
		this.salesNumber = salesNumber;
	}

	public Double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}
}
