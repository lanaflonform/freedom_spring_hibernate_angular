package com.viscount.freedom.domains;
// Generated Mar 2, 2016 10:13:57 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fbconnection generated by hbm2java
 */
@Entity
@Table(name = "fbconnection", schema = "public")
public class Fbconnection implements java.io.Serializable {

	private String deviceid;
	private Integer serverConnection;
	private Date connectTime;

	public Fbconnection() {
	}

	public Fbconnection(String deviceid) {
		this.deviceid = deviceid;
	}

	public Fbconnection(String deviceid, Integer serverConnection, Date connectTime) {
		this.deviceid = deviceid;
		this.serverConnection = serverConnection;
		this.connectTime = connectTime;
	}

	@Id

	@Column(name = "deviceid", unique = true, nullable = false, length = 200)
	public String getDeviceid() {
		return this.deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	@Column(name = "server_connection")
	public Integer getServerConnection() {
		return this.serverConnection;
	}

	public void setServerConnection(Integer serverConnection) {
		this.serverConnection = serverConnection;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "connect_time", length = 29)
	public Date getConnectTime() {
		return this.connectTime;
	}

	public void setConnectTime(Date connectTime) {
		this.connectTime = connectTime;
	}

}