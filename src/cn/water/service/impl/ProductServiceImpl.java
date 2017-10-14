package cn.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.water.dao.ProductMapper;
import cn.water.pojo.Product;
import cn.water.vo.QueryVo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<String> brands() {
		return productMapper.Brand();
	}

	@Override
	public List<Double> prices() {
		return productMapper.prices();
	}

	@Override
	public void saveProduct(Product product) {
		productMapper.insert(product);
	}

	@Override
	public void updateProduct(Product product) {
		productMapper.updateByPrimaryKey(product);
	}

	@Override
	public void deleteProduct(Integer pid) {
		productMapper.deleteByPrimaryKey(pid);
	}

	@Override
	public List<Product> selectAllProduct(QueryVo vo) {
		return productMapper.selectAllProduct(vo);
	}

	@Override
	public Integer getCount(QueryVo vo) {
		return productMapper.getCount(vo);
	}
}
