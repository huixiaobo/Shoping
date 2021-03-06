package net.yasite.entity;

import java.io.Serializable;

public class Author implements Serializable {
	private int id, medal_id;
	private String username, avatar, medal_desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMedal_id() {
		return medal_id;
	}

	public void setMedal_id(int medal_id) {
		this.medal_id = medal_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getMedal_desc() {
		return medal_desc;
	}

	public void setMedal_desc(String medal_desc) {
		this.medal_desc = medal_desc;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", medal_id=" + medal_id + ", username="
				+ username + ", avatar=" + avatar + ", medal_desc="
				+ medal_desc + "]";
	}

}
