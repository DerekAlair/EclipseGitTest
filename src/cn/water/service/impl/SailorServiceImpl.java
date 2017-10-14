package cn.water.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.water.dao.SailorsMapper;
import cn.water.pojo.Sailors;

@Service
public class SailorServiceImpl implements SailorService {

	@Autowired
	private SailorsMapper sailorsMapper;
	
	@Override
	public void saveSailor(Sailors sailors) {
		sailorsMapper.insert(sailors);
	}

	@Override
	public void updateSailor(Sailors sailors) {
		sailorsMapper.updateByPrimaryKey(sailors);
	}

}
