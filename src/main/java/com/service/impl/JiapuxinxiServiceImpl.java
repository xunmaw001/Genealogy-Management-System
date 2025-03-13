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


import com.dao.JiapuxinxiDao;
import com.entity.JiapuxinxiEntity;
import com.service.JiapuxinxiService;
import com.entity.vo.JiapuxinxiVO;
import com.entity.view.JiapuxinxiView;

@Service("jiapuxinxiService")
public class JiapuxinxiServiceImpl extends ServiceImpl<JiapuxinxiDao, JiapuxinxiEntity> implements JiapuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiapuxinxiEntity> page = this.selectPage(
                new Query<JiapuxinxiEntity>(params).getPage(),
                new EntityWrapper<JiapuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiapuxinxiEntity> wrapper) {
		  Page<JiapuxinxiView> page =new Query<JiapuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiapuxinxiVO> selectListVO(Wrapper<JiapuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiapuxinxiVO selectVO(Wrapper<JiapuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiapuxinxiView> selectListView(Wrapper<JiapuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiapuxinxiView selectView(Wrapper<JiapuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
