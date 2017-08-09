package com.etc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.domain.Goods;
import com.etc.service.GoodsService;

/**
 * 
 * 
 * 项目名称：E-Shop
 * 
 * 类描述：获取某一个商品的界面 类名称：com.etc.controller.GoodsController 创建人：st 创建时间：2017年8月9日
 * 下午3:46:51 修改人： 修改时间：2017年8月9日 下午3:46:51 修改备注：
 * 
 * @version V1.0
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;

	@RequestMapping("/{gid}")
	public String toGoods(@PathVariable("gid") int gid,
			HttpServletRequest request) {
		Goods goods = goodsService.getGoods(gid);
		request.setAttribute("goods", goods);
		return "introduction";
	}
}
