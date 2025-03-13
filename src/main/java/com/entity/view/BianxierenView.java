package com.entity.view;

import com.entity.BianxierenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 编写人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
@TableName("bianxieren")
public class BianxierenView  extends BianxierenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BianxierenView(){
	}
 
 	public BianxierenView(BianxierenEntity bianxierenEntity){
 	try {
			BeanUtils.copyProperties(this, bianxierenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
