package cn.water.dao;

import cn.water.pojo.Records;
import cn.water.pojo.RecordsExample;
import cn.water.result.RecordAndOrder;
import cn.water.result.SalesResult;
import cn.water.vo.QuerySales;
import cn.water.vo.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordsMapper {
    int countByExample(RecordsExample example);

    int deleteByExample(RecordsExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Records record);

    int insertSelective(Records record);

    List<Records> selectByExample(RecordsExample example);

    Records selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByExample(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByPrimaryKeySelective(Records record);

    int updateByPrimaryKey(Records record);

	List<RecordAndOrder> waterRecords(QueryVo vo);

	Integer getCount(QueryVo vo);

	List<SalesResult> salesRecord(QuerySales qs);

	Integer getCountqs(QuerySales qs);
}