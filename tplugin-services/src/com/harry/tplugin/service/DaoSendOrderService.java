package com.harry.tplugin.service;

import java.util.List;
import java.util.Map;

import com.harry.tplugin.bean.SendOrder;
import com.harry.tplugin.dao.basic.AbstractServiceDao;

public class DaoSendOrderService extends AbstractServiceDao implements SendOrderService{
	
	@Override
	public void createSendOrder(SendOrder sendOrder) {
		this.getDao().create(sendOrder);
	}

	@Override
	public SendOrder updateSendOrder(SendOrder sendOrder) {
		return (SendOrder) this.getDao().update(sendOrder);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SendOrder> findAllSendOrder() {
		return (List<SendOrder>)this.getDao().query("getAllSendOrder");
	}

	@Override
	public SendOrder findSendOrderByStateProType(String state, String proType) {
		List<?> sendOrderList = (List<?>)this.getDao().query("getSendOrderByStateProType", new String[]{state, proType});
		return sendOrderList == null || sendOrderList.isEmpty() ? null : (SendOrder)sendOrderList.get(0);
	}

	@Override
	public void deleteByStateProType(String state, String proType) {
		SendOrder sendOrder = findSendOrderByStateProType(state, proType);
		if (null != sendOrder)
		{
			this.getDao().delete(sendOrder);
		}
	}

	@Override
	public List<SendOrder> findSendOrderByState(String state) {
		List<?> sendOrderList = (List<?>)this.getDao().query("getSendOrderByState", new String[]{state});
		return sendOrderList == null || sendOrderList.isEmpty() ? null : (List<SendOrder>)sendOrderList;
	}


}
