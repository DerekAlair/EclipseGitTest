package cn.water.service.impl;

import java.util.List;

import cn.water.pojo.Customer;
import cn.water.vo.QueryVo;

public interface CustomerService {

	void saveCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Integer cid);

	List<Customer> selectAllCustomer(QueryVo vo);

	Integer getCount(QueryVo vo);


}
