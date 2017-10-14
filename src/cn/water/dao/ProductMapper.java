package cn.water.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.water.pojo.Product;
import cn.water.pojo.ProductExample;
import cn.water.vo.QueryVo;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

	List<String> Brand();

	List<Double> prices();

	List<Product> selectAllProduct(QueryVo vo);

	Integer getCount(QueryVo vo);
}