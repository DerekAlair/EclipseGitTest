package cn.water.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.water.dao.AdminsMapper;
import cn.water.pojo.Admins;
import cn.water.pojo.AdminsExample;
import cn.water.pojo.AdminsExample.Criteria;
import cn.water.utils.MD5Utils;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminsMapper adminsMapper;

	public void save(Admins admins) {
		//加密密码
		admins.setPassword(MD5Utils.md5(admins.getPassword()));
		adminsMapper.insert(admins);
	}

	@Override
	public Admins login(String adminname, String password) {
		AdminsExample example = new AdminsExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdminnameEqualTo(adminname);
		criteria.andPasswordEqualTo(MD5Utils.md5(password));
		return adminsMapper.selectByExample(example).get(0);
	}

	@Override
	public void delete(Integer adminid) {
		adminsMapper.deleteByPrimaryKey(adminid);
	}

	@Override
	public void update(Admins admins) {
		adminsMapper.updateByPrimaryKey(admins);
	}
}
