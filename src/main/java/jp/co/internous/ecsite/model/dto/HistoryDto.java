package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.entity.Purchase;

public class HistoryDto {

	private long id;
	private long userId;
	private long goodsId;
	private String goodsName;
	private long itemCount;
	private long total;
	private String createdAt;
	
	public HistoryDto() {}
	public HistoryDto(Purchase entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.goodsId = entity.getGoodsId();
		this.goodsName = entity.getGoodsName();
		this.itemCount = entity.getItemCount();
		this.total = entity.getTotal();
		
		Timestamp d = entity.getCreatedAt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		this.createdAt = f.format(d);
	}
	
	public long getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserId() {
		this.userId = userId;
	}
	
	public long getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId() {
		this.goodsId = goodsId;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName() {
		this.goodsName = goodsName;
	}
	
	public long getItemCount() {
		return itemCount;
	}
	
	public void setItemCount() {
		this.itemCount = itemCount;
	}
	
	public long getTotal() {
		return total;
	}
	
	public void setTotal() {
		this.total = total;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt() {
		this.createdAt = createdAt;
	}
}
