package com.dao;

import com.entity.JiapuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiapuxinxiVO;
import com.entity.view.JiapuxinxiView;


/**
 * 家谱信息
 * 
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
public interface JiapuxinxiDao extends BaseMapper<JiapuxinxiEntity> {
	
	List<JiapuxinxiVO> selectListVO(@Param("ew") Wrapper<JiapuxinxiEntity> wrapper);
	
	JiapuxinxiVO selectVO(@Param("ew") Wrapper<JiapuxinxiEntity> wrapper);
	
	List<JiapuxinxiView> selectListView(@Param("ew") Wrapper<JiapuxinxiEntity> wrapper);

	List<JiapuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiapuxinxiEntity> wrapper);
	
	JiapuxinxiView selectView(@Param("ew") Wrapper<JiapuxinxiEntity> wrapper);
	
}
