package edu.autocar.domain;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

	@NotEmpty(message = "사용자 ID는 필수 항목입니다.")
	private String userId;
	@NotEmpty(message = "비밀번호는 필수 항목입니다.")
	private String password;
	@NotEmpty(message = "이름은 필수 항목입니다.")
	private String name;
	private String salt;
	private UserLevel userLevel;
	@NotEmpty(message = "email 필수 항목입니다.")
	@Email(message = "email 형식이 아닙니다.")
	private String email;
	private String phone;
	private String address;
	private Date regDate;
	private Date updateDate;
	MultipartFile avata;

	public Member() {
		userLevel = UserLevel.NORMAL;
	}

	public boolean isAdmin() {
		return userLevel == UserLevel.ADMIN;
	}
}
