package com.entity.model;

import com.entity.JiapuchengyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 家谱成员
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
public class JiapuchengyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 编写人姓名
	 */
	
	private String bianxierenxingming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 世代
	 */
	
	private Integer shidai;
		
	/**
	 * 排行
	 */
	
	private Integer paixing;
		
	/**
	 * 出承
	 */
	
	private String chucheng;
		
	/**
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengriqi;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 职业
	 */
	
	private String zhiye;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 婚姻状况
	 */
	
	private String hunyinzhuangkuang;
		
	/**
	 * 配偶
	 */
	
	private String peiou;
		
	/**
	 * 子女信息
	 */
	
	private String zinvxinxi;
		
	/**
	 * 个人事迹
	 */
	
	private String gerenshiji;
				
	
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
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：世代
	 */
	 
	public void setShidai(Integer shidai) {
		this.shidai = shidai;
	}
	
	/**
	 * 获取：世代
	 */
	public Integer getShidai() {
		return shidai;
	}
				
	
	/**
	 * 设置：排行
	 */
	 
	public void setPaixing(Integer paixing) {
		this.paixing = paixing;
	}
	
	/**
	 * 获取：排行
	 */
	public Integer getPaixing() {
		return paixing;
	}
				
	
	/**
	 * 设置：出承
	 */
	 
	public void setChucheng(String chucheng) {
		this.chucheng = chucheng;
	}
	
	/**
	 * 获取：出承
	 */
	public String getChucheng() {
		return chucheng;
	}
				
	
	/**
	 * 设置：出生日期
	 */
	 
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
				
	
	/**
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
				
	
	/**
	 * 设置：职业
	 */
	 
	public void setZhiye(String zhiye) {
		this.zhiye = zhiye;
	}
	
	/**
	 * 获取：职业
	 */
	public String getZhiye() {
		return zhiye;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：婚姻状况
	 */
	 
	public void setHunyinzhuangkuang(String hunyinzhuangkuang) {
		this.hunyinzhuangkuang = hunyinzhuangkuang;
	}
	
	/**
	 * 获取：婚姻状况
	 */
	public String getHunyinzhuangkuang() {
		return hunyinzhuangkuang;
	}
				
	
	/**
	 * 设置：配偶
	 */
	 
	public void setPeiou(String peiou) {
		this.peiou = peiou;
	}
	
	/**
	 * 获取：配偶
	 */
	public String getPeiou() {
		return peiou;
	}
				
	
	/**
	 * 设置：子女信息
	 */
	 
	public void setZinvxinxi(String zinvxinxi) {
		this.zinvxinxi = zinvxinxi;
	}
	
	/**
	 * 获取：子女信息
	 */
	public String getZinvxinxi() {
		return zinvxinxi;
	}
				
	
	/**
	 * 设置：个人事迹
	 */
	 
	public void setGerenshiji(String gerenshiji) {
		this.gerenshiji = gerenshiji;
	}
	
	/**
	 * 获取：个人事迹
	 */
	public String getGerenshiji() {
		return gerenshiji;
	}
			
}
