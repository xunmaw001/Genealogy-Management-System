package com.entity.view;

import com.entity.JiapuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家谱信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
@TableName("jiapuxinxi")
public class JiapuxinxiView  extends JiapuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiapuxinxiView(){
	}
 
 	public JiapuxinxiView(JiapuxinxiEntity jiapuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiapuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
