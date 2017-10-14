package cn.water.vo;

public class QueryVo {
	
    private String keyword;//送水员姓名、产品名称、客户姓名
    
    private Integer page;//当前页
    
    private Integer start;//从那一条开始
    
    private Integer size;//每页显示多少条

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

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
}
