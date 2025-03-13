package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 编写人
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
@TableName("bianxieren")
public class BianxierenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BianxierenEntity() {
		
	}
	
	public BianxierenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编写人账号
	 */
					
	private String bianxierenzhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 编写人姓名
	 */
					
	private String bianxierenxingming;
	
	/**
	 * 编写人性别
	 */
					
	private String bianxierenxingbie;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 邮箱
	 */
					
	private String youxiang;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编写人账号
	 */
	public void setBianxierenzhanghao(String bianxierenzhanghao) {
		this.bianxierenzhanghao = bianxierenzhanghao;
	}
	/**
	 * 获取：编写人账号
	 */
	public String getBianxierenzhanghao() {
		return bianxierenzhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：编写人姓名
	 */
	public void setBianxierenxingming(String bianxierenxingming) {
		this.bianxierenxingming = bianxierenxingming;
	}
	/**
	 * 获取：编写人姓名
	 */
	public String getBianxierenxingming() {
		return bianxierenxingming;
	}
	/**
	 * 设置：编写人性别
	 */
	public void setBianxierenxingbie(String bianxierenxingbie) {
		this.bianxierenxingbie = bianxierenxingbie;
	}
	/**
	 * 获取：编写人性别
	 */
	public String getBianxierenxingbie() {
		return bianxierenxingbie;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}

}
