package cn.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.water.dao.OrderesMapper;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderesMapper ordersMapper;

//	@Override
//	public List<String> Brand() {
//		return ordersMapper.Brand();
//	}
}
