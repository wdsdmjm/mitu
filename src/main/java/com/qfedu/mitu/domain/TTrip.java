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
@TableName("t_trip")
public class TTrip extends Model<TTrip> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String logo;
	@TableField("trip_location")
	private String tripLocation;
	@TableField("trip_name")
	private String tripName;
	@TableField("trip_price")
	private Double tripPrice;
	@TableField("trip_info")
	private String tripInfo;
	@TableField("trip_start_time")
	private Date tripStartTime;
	@TableField("trip_end_time")
	private Date tripEndTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTripLocation() {
		return tripLocation;
	}

	public void setTripLocation(String tripLocation) {
		this.tripLocation = tripLocation;
	}

	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	public Double getTripPrice() {
		return tripPrice;
	}

	public void setTripPrice(Double tripPrice) {
		this.tripPrice = tripPrice;
	}

	public String getTripInfo() {
		return tripInfo;
	}

	public void setTripInfo(String tripInfo) {
		this.tripInfo = tripInfo;
	}

	public Date getTripStartTime() {
		return tripStartTime;
	}

	public void setTripStartTime(Date tripStartTime) {
		this.tripStartTime = tripStartTime;
	}

	public Date getTripEndTime() {
		return tripEndTime;
	}

	public void setTripEndTime(Date tripEndTime) {
		this.tripEndTime = tripEndTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
