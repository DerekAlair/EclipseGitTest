package cn.water.dao;

import cn.water.pojo.Orderes;
import cn.water.pojo.OrderesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderesMapper {
    int countByExample(OrderesExample example);

    int deleteByExample(OrderesExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orderes record);

    int insertSelective(Orderes record);

    List<Orderes> selectByExample(OrderesExample example);

    Orderes selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Orderes record, @Param("example") OrderesExample example);

    int updateByExample(@Param("record") Orderes record, @Param("example") OrderesExample example);

    int updateByPrimaryKeySelective(Orderes record);

    int updateByPrimaryKey(Orderes record);

//	List<String> Brand();
}