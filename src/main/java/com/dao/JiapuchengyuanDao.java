package com.dao;

import com.entity.JiapuchengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiapuchengyuanVO;
import com.entity.view.JiapuchengyuanView;


/**
 * 家谱成员
 * 
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
public interface JiapuchengyuanDao extends BaseMapper<JiapuchengyuanEntity> {
	
	List<JiapuchengyuanVO> selectListVO(@Param("ew") Wrapper<JiapuchengyuanEntity> wrapper);
	
	JiapuchengyuanVO selectVO(@Param("ew") Wrapper<JiapuchengyuanEntity> wrapper);
	
	List<JiapuchengyuanView> selectListView(@Param("ew") Wrapper<JiapuchengyuanEntity> wrapper);

	List<JiapuchengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiapuchengyuanEntity> wrapper);
	
	JiapuchengyuanView selectView(@Param("ew") Wrapper<JiapuchengyuanEntity> wrapper);
	
}
