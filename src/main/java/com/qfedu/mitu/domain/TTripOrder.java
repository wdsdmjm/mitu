package com.qfedu.mitu.domain;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
@TableName("t_trip_order")
public class TTripOrder extends Model<TTripOrder> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer uid;
	private Integer tid;
	@TableField("trip_orderno")
	private String tripOrderno;
	@TableField("order_trip_time")
	private Date orderTripTime;
	@TableField("total_price")
	private Double totalPrice;
	private Integer personcount;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTripOrderno() {
		return tripOrderno;
	}

	public void setTripOrderno(String tripOrderno) {
		this.tripOrderno = tripOrderno;
	}

	public Date getOrderTripTime() {
		return orderTripTime;
	}

	public void setOrderTripTime(Date orderTripTime) {
		this.orderTripTime = orderTripTime;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getPersoncount() {
		return personcount;
	}

	public void setPersoncount(Integer personcount) {
		this.personcount = personcount;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
