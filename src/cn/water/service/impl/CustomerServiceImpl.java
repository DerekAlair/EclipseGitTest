package cn.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.water.dao.CustomerMapper;
import cn.water.pojo.Customer;
import cn.water.vo.QueryVo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public void saveCustomer(Customer customer) {
		customerMapper.insert(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerMapper.updateByPrimaryKey(customer);
	}

	@Override
	public void deleteCustomer(Integer cid) {
		customerMapper.deleteByPrimaryKey(cid);
	}

	@Override
	public List<Customer> selectAllCustomer(QueryVo vo) {
		return customerMapper.selectAllCustomer(vo);
	}

	@Override
	public Integer getCount(QueryVo vo) {
		return customerMapper.getCount(vo);
	}
}
