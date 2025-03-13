package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiapuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiapuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiapuxinxiView;


/**
 * 家谱信息
 *
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
public interface JiapuxinxiService extends IService<JiapuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiapuxinxiVO> selectListVO(Wrapper<JiapuxinxiEntity> wrapper);
   	
   	JiapuxinxiVO selectVO(@Param("ew") Wrapper<JiapuxinxiEntity> wrapper);
   	
   	List<JiapuxinxiView> selectListView(Wrapper<JiapuxinxiEntity> wrapper);
   	
   	JiapuxinxiView selectView(@Param("ew") Wrapper<JiapuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiapuxinxiEntity> wrapper);
   	
}

