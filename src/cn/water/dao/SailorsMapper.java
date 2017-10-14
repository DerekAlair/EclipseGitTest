package cn.water.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.water.pojo.Sailors;
import cn.water.pojo.SailorsExample;

public interface SailorsMapper {
    int countByExample(SailorsExample example);

    int deleteByExample(SailorsExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Sailors record);

    int insertSelective(Sailors record);

    List<Sailors> selectByExample(SailorsExample example);

    Sailors selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Sailors record, @Param("example") SailorsExample example);

    int updateByExample(@Param("record") Sailors record, @Param("example") SailorsExample example);

    int updateByPrimaryKeySelective(Sailors record);

    int updateByPrimaryKey(Sailors record);
}