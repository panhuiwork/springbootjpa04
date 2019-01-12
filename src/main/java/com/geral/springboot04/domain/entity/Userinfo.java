package com.geral.springboot04.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

import lombok.Data;

@Data  //不用写set 和get
@Entity //告诉jpa这是一个实体类（和数据包映射的类）
@Table(name="userinfo") //指定和数据表对应，如果省略就是默认小写的类名
public class Userinfo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //自增主键
	private Long id;

	@Column
	private String username;
	
	@Column(name="user_pass",length=30)
	private String userpass;
	
	@Column
	private String useremail;
	@Column
	private String creatData;
	@Column
	private Integer nstate;
	@Column
	private Integer sex;
	@Column
	private String param;
}
