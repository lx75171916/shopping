package com.service;

import com.dao.GoodsDao;
import com.model.Goods;

public class GoodsService {
	GoodsDao goodsDao = new GoodsDao();
	public Goods findGoodsById(Integer goodsid) {
		return goodsDao.findGoodsById(goodsid);
	}
	
}
