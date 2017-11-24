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
 * DblogUsers generated by hbm2java
 */
@Entity
@Table(name = "dblog_users", schema = "public")
public class DblogUsers implements java.io.Serializable {

	private int dblogId;
	private Date dblogTimestamp;
	private Integer dblogType;
	private String userid;
	private String firstname;
	private String lastname;
	private String suitenumber;
	private String carddata;
	private String cardnumber;
	private String pin;
	private long usertype;
	private String displayname;
	private String rargroup;
	private Long expire;
	private String wgcarddata;
	private Integer displayuser;
	private Long startdate;
	private String adminid;
	private Long lastupdate;
	private String lastreaderid;
	private Integer lastreaderport;
	private String lastzoneid;
	private Date lastaccess;
	private int id;
	private Long usnchanged;
	private Long usncardchanged;
	private String email;
	private String telephone;
	private Boolean accountdisabled;
	private Date createdAt;
	private Date updatedAt;
	private Integer usercategory;

	public DblogUsers() {
	}

	public DblogUsers(int dblogId, Date dblogTimestamp, String userid, long usertype, int id, Date createdAt,
			Date updatedAt) {
		this.dblogId = dblogId;
		this.dblogTimestamp = dblogTimestamp;
		this.userid = userid;
		this.usertype = usertype;
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public DblogUsers(int dblogId, Date dblogTimestamp, Integer dblogType, String userid, String firstname,
			String lastname, String suitenumber, String carddata, String cardnumber, String pin, long usertype,
			String displayname, String rargroup, Long expire, String wgcarddata, Integer displayuser, Long startdate,
			String adminid, Long lastupdate, String lastreaderid, Integer lastreaderport, String lastzoneid,
			Date lastaccess, int id, Long usnchanged, Long usncardchanged, String email, String telephone,
			Boolean accountdisabled, Date createdAt, Date updatedAt, Integer usercategory) {
		this.dblogId = dblogId;
		this.dblogTimestamp = dblogTimestamp;
		this.dblogType = dblogType;
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.suitenumber = suitenumber;
		this.carddata = carddata;
		this.cardnumber = cardnumber;
		this.pin = pin;
		this.usertype = usertype;
		this.displayname = displayname;
		this.rargroup = rargroup;
		this.expire = expire;
		this.wgcarddata = wgcarddata;
		this.displayuser = displayuser;
		this.startdate = startdate;
		this.adminid = adminid;
		this.lastupdate = lastupdate;
		this.lastreaderid = lastreaderid;
		this.lastreaderport = lastreaderport;
		this.lastzoneid = lastzoneid;
		this.lastaccess = lastaccess;
		this.id = id;
		this.usnchanged = usnchanged;
		this.usncardchanged = usncardchanged;
		this.email = email;
		this.telephone = telephone;
		this.accountdisabled = accountdisabled;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.usercategory = usercategory;
	}

	@Id

	@Column(name = "dblog_id", unique = true, nullable = false)
	public int getDblogId() {
		return this.dblogId;
	}

	public void setDblogId(int dblogId) {
		this.dblogId = dblogId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dblog_timestamp", nullable = false, length = 35)
	public Date getDblogTimestamp() {
		return this.dblogTimestamp;
	}

	public void setDblogTimestamp(Date dblogTimestamp) {
		this.dblogTimestamp = dblogTimestamp;
	}

	@Column(name = "dblog_type")
	public Integer getDblogType() {
		return this.dblogType;
	}

	public void setDblogType(Integer dblogType) {
		this.dblogType = dblogType;
	}

	@Column(name = "userid", nullable = false, length = 200)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "firstname", length = 50)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", length = 50)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "suitenumber", length = 50)
	public String getSuitenumber() {
		return this.suitenumber;
	}

	public void setSuitenumber(String suitenumber) {
		this.suitenumber = suitenumber;
	}

	@Column(name = "carddata", length = 100)
	public String getCarddata() {
		return this.carddata;
	}

	public void setCarddata(String carddata) {
		this.carddata = carddata;
	}

	@Column(name = "cardnumber", length = 50)
	public String getCardnumber() {
		return this.cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	@Column(name = "pin", length = 50)
	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Column(name = "usertype", nullable = false)
	public long getUsertype() {
		return this.usertype;
	}

	public void setUsertype(long usertype) {
		this.usertype = usertype;
	}

	@Column(name = "displayname", length = 50)
	public String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	@Column(name = "rargroup", length = 35)
	public String getRargroup() {
		return this.rargroup;
	}

	public void setRargroup(String rargroup) {
		this.rargroup = rargroup;
	}

	@Column(name = "expire")
	public Long getExpire() {
		return this.expire;
	}

	public void setExpire(Long expire) {
		this.expire = expire;
	}

	@Column(name = "wgcarddata", length = 100)
	public String getWgcarddata() {
		return this.wgcarddata;
	}

	public void setWgcarddata(String wgcarddata) {
		this.wgcarddata = wgcarddata;
	}

	@Column(name = "displayuser")
	public Integer getDisplayuser() {
		return this.displayuser;
	}

	public void setDisplayuser(Integer displayuser) {
		this.displayuser = displayuser;
	}

	@Column(name = "startdate")
	public Long getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Long startdate) {
		this.startdate = startdate;
	}

	@Column(name = "adminid", length = 50)
	public String getAdminid() {
		return this.adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	@Column(name = "lastupdate")
	public Long getLastupdate() {
		return this.lastupdate;
	}

	public void setLastupdate(Long lastupdate) {
		this.lastupdate = lastupdate;
	}

	@Column(name = "lastreaderid", length = 100)
	public String getLastreaderid() {
		return this.lastreaderid;
	}

	public void setLastreaderid(String lastreaderid) {
		this.lastreaderid = lastreaderid;
	}

	@Column(name = "lastreaderport")
	public Integer getLastreaderport() {
		return this.lastreaderport;
	}

	public void setLastreaderport(Integer lastreaderport) {
		this.lastreaderport = lastreaderport;
	}

	@Column(name = "lastzoneid", length = 200)
	public String getLastzoneid() {
		return this.lastzoneid;
	}

	public void setLastzoneid(String lastzoneid) {
		this.lastzoneid = lastzoneid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastaccess", length = 29)
	public Date getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "usnchanged")
	public Long getUsnchanged() {
		return this.usnchanged;
	}

	public void setUsnchanged(Long usnchanged) {
		this.usnchanged = usnchanged;
	}

	@Column(name = "usncardchanged")
	public Long getUsncardchanged() {
		return this.usncardchanged;
	}

	public void setUsncardchanged(Long usncardchanged) {
		this.usncardchanged = usncardchanged;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telephone", length = 50)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "accountdisabled")
	public Boolean getAccountdisabled() {
		return this.accountdisabled;
	}

	public void setAccountdisabled(Boolean accountdisabled) {
		this.accountdisabled = accountdisabled;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 35)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false, length = 35)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "usercategory")
	public Integer getUsercategory() {
		return this.usercategory;
	}

	public void setUsercategory(Integer usercategory) {
		this.usercategory = usercategory;
	}

}