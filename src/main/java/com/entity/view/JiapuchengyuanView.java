package com.entity.view;

import com.entity.JiapuchengyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家谱成员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
@TableName("jiapuchengyuan")
public class JiapuchengyuanView  extends JiapuchengyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiapuchengyuanView(){
	}
 
 	public JiapuchengyuanView(JiapuchengyuanEntity jiapuchengyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiapuchengyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
