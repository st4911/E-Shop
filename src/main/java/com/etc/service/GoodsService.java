package com.etc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.dao.GoodsMapper;
import com.etc.domain.Goods;

@Service
public class GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;

	/**
	 * 根据gid获取商品信息
	 * 
	 * @param gid
	 * @return
	 */
	public Goods getGoods(int gid) {
		return goodsMapper.getGoods(gid);
	}

}
