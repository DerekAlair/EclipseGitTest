package cn.water.result;

import cn.water.pojo.Records;

public class RecordAndOrder extends Records{
	
    private String pname;//品牌
    
    private Integer wnumber;//送水量

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getWnumber() {
		return wnumber;
	}

	public void setWnumber(Integer wnumber) {
		this.wnumber = wnumber;
	}
}
