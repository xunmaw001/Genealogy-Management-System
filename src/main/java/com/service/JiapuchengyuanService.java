package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiapuchengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiapuchengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiapuchengyuanView;


/**
 * 家谱成员
 *
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
public interface JiapuchengyuanService extends IService<JiapuchengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiapuchengyuanVO> selectListVO(Wrapper<JiapuchengyuanEntity> wrapper);
   	
   	JiapuchengyuanVO selectVO(@Param("ew") Wrapper<JiapuchengyuanEntity> wrapper);
   	
   	List<JiapuchengyuanView> selectListView(Wrapper<JiapuchengyuanEntity> wrapper);
   	
   	JiapuchengyuanView selectView(@Param("ew") Wrapper<JiapuchengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiapuchengyuanEntity> wrapper);
   	
}

