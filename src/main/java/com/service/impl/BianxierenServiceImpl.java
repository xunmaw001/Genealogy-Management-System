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


import com.dao.BianxierenDao;
import com.entity.BianxierenEntity;
import com.service.BianxierenService;
import com.entity.vo.BianxierenVO;
import com.entity.view.BianxierenView;

@Service("bianxierenService")
public class BianxierenServiceImpl extends ServiceImpl<BianxierenDao, BianxierenEntity> implements BianxierenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BianxierenEntity> page = this.selectPage(
                new Query<BianxierenEntity>(params).getPage(),
                new EntityWrapper<BianxierenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BianxierenEntity> wrapper) {
		  Page<BianxierenView> page =new Query<BianxierenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BianxierenVO> selectListVO(Wrapper<BianxierenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BianxierenVO selectVO(Wrapper<BianxierenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BianxierenView> selectListView(Wrapper<BianxierenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BianxierenView selectView(Wrapper<BianxierenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
