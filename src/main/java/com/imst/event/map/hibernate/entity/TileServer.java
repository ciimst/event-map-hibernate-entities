package com.imst.event.map.hibernate.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TileServer generated by hbm2java
 */
@Entity
@Table(name = "tile_server", schema = "public")
public class TileServer implements java.io.Serializable {

	private Integer id;
	private String name;
	private String url;
	private Timestamp createDate;
	private Timestamp updateDate;
	private Integer sortOrder;
	private Boolean state;

	public TileServer() {
	}

	public TileServer(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public TileServer(String name, String url, Timestamp createDate, Timestamp updateDate, Integer sortOrder,
			Boolean state) {
		this.name = name;
		this.url = url;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.sortOrder = sortOrder;
		this.state = state;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "url", nullable = false, length = 4096)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "create_date", length = 29)
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Column(name = "update_date", length = 29)
	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "sort_order")
	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Column(name = "state")
	@org.hibernate.annotations.ColumnDefault("true")
	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

}
