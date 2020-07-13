package com.tmodel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.model.Goods;
import com.model.Orders;
import com.model.Vipuser;
import com.service.GoodsService;
import com.service.UserService;

public class TOrders extends Orders {
	private static final long serialVersionUID = 1L;
	private String tbuytime;
	private Vipuser vipuser;
	private Goods goods;
	public TOrders() {}
	public TOrders(Orders orders) throws Exception {
		this.setOrderid(orders.getOrderid());
		this.setUserid(orders.getUserid());
		this.setGoodsid(orders.getGoodsid());
		this.setBuytime(orders.getBuytime());
		this.setPrice(orders.getPrice());
		this.setGoodsnumber(orders.getGoodsnumber());
		setTbuytime(this.getBuytime());
		setVipuser(this.getUserid());
		setGoods(this.getGoodsid());
	}
	public String getTbuytime() {
		return tbuytime;
	}
	public void setTbuytime(String tbuytime) {
		this.tbuytime = tbuytime;
	}
	public void setTbuytime(Date buytime) {
		DateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:MI:SS"); 
		this.tbuytime = sdf.format(buytime);
	}
	public Vipuser getVipuser() {
		return vipuser;
	}
	public void setVipuser(Vipuser vipuser) {
		this.vipuser = vipuser;
	}
	public void setVipuser(Integer userid) throws Exception {
		UserService userService = new UserService();
		this.vipuser = userService.findUserById(userid);
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public void setGoods(Integer goodsid) {
		GoodsService goodsService = new GoodsService();
		this.goods = goodsService.findGoodsById(goodsid);
	}
}
