package com.etc.dao;

import com.etc.domain.Goods;

public interface GoodsMapper {
	/**
	 * 根据gid获取商品信息
	 * 
	 * @param gid
	 * @return
	 */
	public Goods getGoods(int gid);

}
