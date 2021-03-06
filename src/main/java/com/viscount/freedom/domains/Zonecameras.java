package com.viscount.freedom.domains;
// Generated Mar 2, 2016 10:13:57 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Zonecameras generated by hbm2java
 */
@Entity
@Table(name = "zonecameras", schema = "public")
public class Zonecameras implements java.io.Serializable {

	private long id;
	private String zoneid;
	private Integer cameraid;
	private Boolean primarycamera;
	private Integer preevent;
	private Integer postevent;

	public Zonecameras() {
	}

	public Zonecameras(long id) {
		this.id = id;
	}

	public Zonecameras(long id, String zoneid, Integer cameraid, Boolean primarycamera, Integer preevent,
			Integer postevent) {
		this.id = id;
		this.zoneid = zoneid;
		this.cameraid = cameraid;
		this.primarycamera = primarycamera;
		this.preevent = preevent;
		this.postevent = postevent;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "zoneid", length = 200)
	public String getZoneid() {
		return this.zoneid;
	}

	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}

	@Column(name = "cameraid")
	public Integer getCameraid() {
		return this.cameraid;
	}

	public void setCameraid(Integer cameraid) {
		this.cameraid = cameraid;
	}

	@Column(name = "primarycamera")
	public Boolean getPrimarycamera() {
		return this.primarycamera;
	}

	public void setPrimarycamera(Boolean primarycamera) {
		this.primarycamera = primarycamera;
	}

	@Column(name = "preevent")
	public Integer getPreevent() {
		return this.preevent;
	}

	public void setPreevent(Integer preevent) {
		this.preevent = preevent;
	}

	@Column(name = "postevent")
	public Integer getPostevent() {
		return this.postevent;
	}

	public void setPostevent(Integer postevent) {
		this.postevent = postevent;
	}

}
