package tw.idv.lynn.web.member.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tw.idv.lynn.core.pojo.Core;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member extends Core {
	private static final long serialVersionUID = 1062017833925367218L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;
	private String nickname;

	@Column(insertable = false)
	private Boolean pass;

	@Column(name = "ROLE_ID")
	private Integer roleId;

	@Column(insertable = false)
	private String creator;

	@Column(insertable = false)
	private Timestamp createdDate;

	private String updater;

	@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
	private Timestamp lastUpdatedDate;

	private byte[] image;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Boolean getPass() {
		return pass;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}
