package com.qfedu.mitu.domain;

import java.util.Date;
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
 * @since 2019-01-07
 */
@TableName("t_logs")
public class TLogs extends Model<TLogs> {

    private static final long serialVersionUID = 1L;

	private Integer iid;
	private Integer uid;
	private String ip;
	@TableField("log_time")
	private Date logTime;
	private String content;

	public TLogs(Integer uid, String ip, String content) {
		this.uid = uid;
		this.ip = ip;
		this.content = content;
	}


	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	protected Serializable pkVal() {
		return this.iid;
	}

}
