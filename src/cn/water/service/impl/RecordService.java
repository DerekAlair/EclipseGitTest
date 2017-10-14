package cn.water.service.impl;

import java.util.List;

import cn.water.result.RecordAndOrder;
import cn.water.result.SalesResult;
import cn.water.vo.QuerySales;
import cn.water.vo.QueryVo;

public interface RecordService {

	List<RecordAndOrder> waterRecords(QueryVo vo);

	Integer getCount(QueryVo vo);

	List<SalesResult> salesRecord(QuerySales qs);

	Integer getCountqs(QuerySales qs);

}
