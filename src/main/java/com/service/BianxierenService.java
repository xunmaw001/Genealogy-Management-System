package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BianxierenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BianxierenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BianxierenView;


/**
 * 编写人
 *
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
public interface BianxierenService extends IService<BianxierenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BianxierenVO> selectListVO(Wrapper<BianxierenEntity> wrapper);
   	
   	BianxierenVO selectVO(@Param("ew") Wrapper<BianxierenEntity> wrapper);
   	
   	List<BianxierenView> selectListView(Wrapper<BianxierenEntity> wrapper);
   	
   	BianxierenView selectView(@Param("ew") Wrapper<BianxierenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BianxierenEntity> wrapper);
   	
}

