package com.viscount.freedom.domains;
// Generated Mar 2, 2016 10:13:57 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Amsserver generated by hbm2java
 */
@Entity
@Table(name = "amsserver", schema = "public")
public class Amsserver implements java.io.Serializable {

	private long id;
	private String hostname;
	private Integer port;
	private String protocol;
	private Boolean enabled;
	private String key;

	public Amsserver() {
	}

	public Amsserver(long id, String hostname) {
		this.id = id;
		this.hostname = hostname;
	}

	public Amsserver(long id, String hostname, Integer port, String protocol, Boolean enabled, String key) {
		this.id = id;
		this.hostname = hostname;
		this.port = port;
		this.protocol = protocol;
		this.enabled = enabled;
		this.key = key;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "hostname", nullable = false, length = 50)
	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@Column(name = "port")
	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	@Column(name = "protocol", length = 50)
	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Column(name = "enabled")
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "key", length = 512)
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
