package com.imst.event.map.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EventMedia generated by hbm2java
 */
@Entity
@Table(name = "event_media")
public class EventMedia implements java.io.Serializable {

	private Integer id;
	private Event event;
	private String path;
	private String coverImagePath;
	private Boolean isVideo;

	public EventMedia() {
	}

	public EventMedia(Event event, String path) {
		this.event = event;
		this.path = path;
	}

	public EventMedia(Event event, String path, String coverImagePath, Boolean isVideo) {
		this.event = event;
		this.path = path;
		this.coverImagePath = coverImagePath;
		this.isVideo = isVideo;
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
	@JoinColumn(name = "fk_event_id", nullable = false)
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Column(name = "path", nullable = false, length = 4096)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "cover_image_path", length = 4096)
	public String getCoverImagePath() {
		return this.coverImagePath;
	}

	public void setCoverImagePath(String coverImagePath) {
		this.coverImagePath = coverImagePath;
	}

	@Column(name = "is_video")
	@org.hibernate.annotations.ColumnDefault("false")
	public Boolean getIsVideo() {
		return this.isVideo;
	}

	public void setIsVideo(Boolean isVideo) {
		this.isVideo = isVideo;
	}

}
