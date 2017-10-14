package cn.water.utils;

import java.util.List;

public class PageBean<T> {
    
	private int totalCount;
	private int currPage;//当前页
	private int pageSize;//每页显示条数
	private int totalPage;
    private List<T> rows;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getTotalPage() {
		return (int) Math.ceil(totalCount*1.0/pageSize);
	}

}
