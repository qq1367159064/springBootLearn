package cn.smile.core.entity;

/**
 * @author smiletofotget
 * @creationTime 2020-06-2020/6/11
 */

import javax.persistence.*;

/**
 * jap => javaEE中的一种规范
 * 使用jpa注解配置映射关系
 *
 */
@Entity //告诉jpa这是一个实体类(和数据库的数据表映射的类)
@Table(name = "tbl_user")//指定和那个数据表映射，可以省略,默认就是类名小写
public class User {
	
	@Id//标识这是一个主键
	@GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
	private Integer id;
	@Column(name = "last_name",length = 50)
	private String lastName;
	@Column //可以省略,默认就是属性名
	private String email;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
