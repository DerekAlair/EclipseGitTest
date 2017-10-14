package cn.water.vo;

public class QuerySales {

	private String pname;//品牌
	
	private String aera;//区域
	
    private Integer page;//当前页
    
    private Integer start;//从那一条开始
    
    private Integer size;//每页显示多少条

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAera() {
		return aera;
	}

	public void setAera(String aera) {
		this.aera = aera;
	}
}
