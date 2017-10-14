package cn.water.service.impl;

import java.util.List;

import cn.water.pojo.Product;
import cn.water.vo.QueryVo;

public interface ProductService {

	List<String> brands();

	List<Double> prices();

	void saveProduct(Product product);

	void updateProduct(Product product);

	void deleteProduct(Integer pid);

	List<Product> selectAllProduct(QueryVo vo);

	Integer getCount(QueryVo vo);


}
