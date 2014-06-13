package com.mission.shop.admin.service.manage.log.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mission.shop.admin.dao.entity.manage.log.LogEntity;
import com.mission.shop.admin.dao.mapper.manage.log.ILogMapper;
import com.mission.shop.admin.exception.ServiceException;
import com.mission.shop.admin.service.manage.log.ILogService;
import com.mission.shop.admin.service.manage.role.impl.OperatorServiceImpl;
import com.mission.shop.admin.utils.log.JscnLogger;
import com.mission.shop.admin.utils.page.Pagination;
import com.mission.shop.admin.utils.persistent.ResultList;
import com.mission.shop.admin.utils.persistent.ResultListImpl;

@Service(value = ILogService.SERVICE_NAME)
public class LogServiceImpl implements ILogService {

	@Autowired
	private ILogMapper logMapper;

	@Override
	@Transactional(readOnly = true)
	public LogEntity getLogById(String id) throws ServiceException {
		LogEntity log = null;
		try {
			log = logMapper.getLogById(id);
		} catch (SQLException e) {
			JscnLogger.error("根据ID查找日志出错", e, OperatorServiceImpl.class);
			throw new ServiceException(e);
		}
		return log;
	}

	@Override
	@Transactional(readOnly = true)
	public ResultList<LogEntity> getLogs(String operatorId,
			String operatorName, String beginTime, String endTime,
			Pagination page) throws ServiceException {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("operatorId", operatorId);
		condition.put("operatorName", operatorName);
		condition.put("beginTime", beginTime);
		condition.put("endTime", endTime);
		Long totalCount;
		try {
			totalCount = logMapper.logCount(condition);
			page.setTotalCount(totalCount.intValue());
		} catch (SQLException e) {
			JscnLogger.error("查找日志数量出错", e, OperatorServiceImpl.class);
			throw new ServiceException(e);
		}

		condition.put("minnum", page.getStartNo());
		condition.put("maxnum", page.getEndNo());
		List<LogEntity> list;
		ResultList<LogEntity> res = new ResultListImpl<LogEntity>();
		try {
			list = logMapper.queryLogs(condition);

			res.setPage(page);
			res.setResults(list);
		} catch (SQLException e) {
			JscnLogger.error("查询日志列表出错", e, OperatorServiceImpl.class);
			throw new ServiceException(e);
		}
		return res;
	}

	@Override
	@Transactional
	public void addLog(LogEntity log) throws ServiceException {
		try {
			logMapper.insertLog(log);
		} catch (SQLException e) {
			JscnLogger.error("添加日志出错", e, OperatorServiceImpl.class);
			throw new ServiceException(e);
		}

	}

}
