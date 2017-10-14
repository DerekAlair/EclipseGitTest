package cn.water.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.water.pojo.Admins;
import cn.water.pojo.AdminsExample;

public interface AdminsMapper {
    int countByExample(AdminsExample example);

    int deleteByExample(AdminsExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(Admins record);

    int insertSelective(Admins record);

    List<Admins> selectByExample(AdminsExample example);

    Admins selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") Admins record, @Param("example") AdminsExample example);

    int updateByExample(@Param("record") Admins record, @Param("example") AdminsExample example);

    int updateByPrimaryKeySelective(Admins record);

    int updateByPrimaryKey(Admins record);
}