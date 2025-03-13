package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiapuchengyuanDao;
import com.entity.JiapuchengyuanEntity;
import com.service.JiapuchengyuanService;
import com.entity.vo.JiapuchengyuanVO;
import com.entity.view.JiapuchengyuanView;

@Service("jiapuchengyuanService")
public class JiapuchengyuanServiceImpl extends ServiceImpl<JiapuchengyuanDao, JiapuchengyuanEntity> implements JiapuchengyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiapuchengyuanEntity> page = this.selectPage(
                new Query<JiapuchengyuanEntity>(params).getPage(),
                new EntityWrapper<JiapuchengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiapuchengyuanEntity> wrapper) {
		  Page<JiapuchengyuanView> page =new Query<JiapuchengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiapuchengyuanVO> selectListVO(Wrapper<JiapuchengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiapuchengyuanVO selectVO(Wrapper<JiapuchengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiapuchengyuanView> selectListView(Wrapper<JiapuchengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiapuchengyuanView selectView(Wrapper<JiapuchengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
