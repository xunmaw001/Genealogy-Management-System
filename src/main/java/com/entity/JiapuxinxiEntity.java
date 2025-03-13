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
 * 家谱信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
@TableName("jiapuxinxi")
public class JiapuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiapuxinxiEntity() {
		
	}
	
	public JiapuxinxiEntity(T t) {
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
	 * 家谱名称
	 */
					
	private String jiapumingcheng;
	
	/**
	 * 始祖
	 */
					
	private String shizu;
	
	/**
	 * 编写人账号
	 */
					
	private String bianxierenzhanghao;
	
	/**
	 * 编写人姓名
	 */
					
	private String bianxierenxingming;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 编写日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date bianxieriqi;
	
	/**
	 * 家族简介
	 */
					
	private String jiazujianjie;
	
	
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
	 * 设置：家谱名称
	 */
	public void setJiapumingcheng(String jiapumingcheng) {
		this.jiapumingcheng = jiapumingcheng;
	}
	/**
	 * 获取：家谱名称
	 */
	public String getJiapumingcheng() {
		return jiapumingcheng;
	}
	/**
	 * 设置：始祖
	 */
	public void setShizu(String shizu) {
		this.shizu = shizu;
	}
	/**
	 * 获取：始祖
	 */
	public String getShizu() {
		return shizu;
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
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：编写日期
	 */
	public void setBianxieriqi(Date bianxieriqi) {
		this.bianxieriqi = bianxieriqi;
	}
	/**
	 * 获取：编写日期
	 */
	public Date getBianxieriqi() {
		return bianxieriqi;
	}
	/**
	 * 设置：家族简介
	 */
	public void setJiazujianjie(String jiazujianjie) {
		this.jiazujianjie = jiazujianjie;
	}
	/**
	 * 获取：家族简介
	 */
	public String getJiazujianjie() {
		return jiazujianjie;
	}

}
