package cn.water.service.impl;

import cn.water.pojo.Admins;

public interface AdminService {

	void save(Admins admins);

	Admins login(String adminname, String password);

	void delete(Integer adminid);

	void update(Admins admins);


}
