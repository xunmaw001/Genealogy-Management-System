package com.entity.model;

import com.entity.JiapuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 家谱信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
public class JiapuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bianxieriqi;
		
	/**
	 * 家族简介
	 */
	
	private String jiazujianjie;
				
	
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
