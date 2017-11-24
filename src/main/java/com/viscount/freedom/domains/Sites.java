package com.viscount.freedom.domains;
// Generated Mar 2, 2016 10:13:57 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Sites generated by hbm2java
 */
@Entity
@Table(name = "sites", schema = "public")
public class Sites implements java.io.Serializable {

	private int siteid;
	private String sitename;
	private String sitedesc;
	private String timezoneid;
	private Set<Resolutions> resolutionses = new HashSet<Resolutions>(0);
	private Set<Adminusersites> adminusersiteses = new HashSet<Adminusersites>(0);

	public Sites() {
	}

	public Sites(int siteid, String sitename, String timezoneid) {
		this.siteid = siteid;
		this.sitename = sitename;
		this.timezoneid = timezoneid;
	}

	public Sites(int siteid, String sitename, String sitedesc, String timezoneid, Set<Resolutions> resolutionses,
			Set<Adminusersites> adminusersiteses) {
		this.siteid = siteid;
		this.sitename = sitename;
		this.sitedesc = sitedesc;
		this.timezoneid = timezoneid;
		this.resolutionses = resolutionses;
		this.adminusersiteses = adminusersiteses;
	}

	@Id

	@Column(name = "siteid", unique = true, nullable = false)
	public int getSiteid() {
		return this.siteid;
	}

	public void setSiteid(int siteid) {
		this.siteid = siteid;
	}

	@Column(name = "sitename", nullable = false, length = 200)
	public String getSitename() {
		return this.sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	@Column(name = "sitedesc", length = 200)
	public String getSitedesc() {
		return this.sitedesc;
	}

	public void setSitedesc(String sitedesc) {
		this.sitedesc = sitedesc;
	}

	@Column(name = "timezoneid", nullable = false, length = 200)
	public String getTimezoneid() {
		return this.timezoneid;
	}

	public void setTimezoneid(String timezoneid) {
		this.timezoneid = timezoneid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sites")
	public Set<Resolutions> getResolutionses() {
		return this.resolutionses;
	}

	public void setResolutionses(Set<Resolutions> resolutionses) {
		this.resolutionses = resolutionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sites")
	public Set<Adminusersites> getAdminusersiteses() {
		return this.adminusersiteses;
	}

	public void setAdminusersiteses(Set<Adminusersites> adminusersiteses) {
		this.adminusersiteses = adminusersiteses;
	}

}