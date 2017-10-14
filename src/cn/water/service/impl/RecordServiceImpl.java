package cn.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.water.dao.RecordsMapper;
import cn.water.result.RecordAndOrder;
import cn.water.result.SalesResult;
import cn.water.vo.QuerySales;
import cn.water.vo.QueryVo;

@Service
public class RecordServiceImpl implements RecordService {
	
	@Autowired
	private RecordsMapper recordsMapper;

	@Override
	public List<RecordAndOrder> waterRecords(QueryVo vo) {
		return recordsMapper.waterRecords(vo);
	}

	@Override
	public Integer getCount(QueryVo vo) {
		return recordsMapper.getCount(vo);
	}

	@Override
	public List<SalesResult> salesRecord(QuerySales qs) {
		return recordsMapper.salesRecord(qs);
	}

	@Override
	public Integer getCountqs(QuerySales qs) {
		return recordsMapper.getCountqs(qs);
	}
}
