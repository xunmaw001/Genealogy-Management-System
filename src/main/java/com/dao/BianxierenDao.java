package com.dao;

import com.entity.BianxierenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BianxierenVO;
import com.entity.view.BianxierenView;


/**
 * 编写人
 * 
 * @author 
 * @email 
 * @date 2021-03-29 12:34:32
 */
public interface BianxierenDao extends BaseMapper<BianxierenEntity> {
	
	List<BianxierenVO> selectListVO(@Param("ew") Wrapper<BianxierenEntity> wrapper);
	
	BianxierenVO selectVO(@Param("ew") Wrapper<BianxierenEntity> wrapper);
	
	List<BianxierenView> selectListView(@Param("ew") Wrapper<BianxierenEntity> wrapper);

	List<BianxierenView> selectListView(Pagination page,@Param("ew") Wrapper<BianxierenEntity> wrapper);
	
	BianxierenView selectView(@Param("ew") Wrapper<BianxierenEntity> wrapper);
	
}
