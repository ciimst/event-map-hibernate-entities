package com.imst.event.map.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Settings generated by hbm2java
 */
@Entity
@Table(name = "user_settings", schema = "public")
public class UserSettings implements java.io.Serializable {

	private Integer id;
	private UserSettingsType userSettingsType;
	private Layer layer;
	private User user;
	private String settingsValue;



	public UserSettings() {
	}

	public UserSettings(UserSettingsType userSettingsType, User user, Layer layer) {
		this.userSettingsType = userSettingsType;
		this.user = user;
		this.layer = layer;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_layer_id", nullable = true)
	public Layer getLayer() {
		return this.layer;
	}

	public void setLayer(Layer layer) {
		this.layer = layer;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_user_settings_type_id", nullable = false)
	public UserSettingsType getUserSettingsType() {
		return this.userSettingsType;
	}

	public void setUserSettingsType(UserSettingsType userSettingsType) {
		this.userSettingsType = userSettingsType;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "settings_value", length = 2048)
	public String getSettingsValue() {
		return this.settingsValue;
	}

	public void setSettingsValue(String settingsValue) {
		this.settingsValue = settingsValue;
	}

}
