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


import com.dao.JiangjinshenqingDao;
import com.entity.JiangjinshenqingEntity;
import com.service.JiangjinshenqingService;
import com.entity.vo.JiangjinshenqingVO;
import com.entity.view.JiangjinshenqingView;

@Service("jiangjinshenqingService")
public class JiangjinshenqingServiceImpl extends ServiceImpl<JiangjinshenqingDao, JiangjinshenqingEntity> implements JiangjinshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangjinshenqingEntity> page = this.selectPage(
                new Query<JiangjinshenqingEntity>(params).getPage(),
                new EntityWrapper<JiangjinshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangjinshenqingEntity> wrapper) {
		  Page<JiangjinshenqingView> page =new Query<JiangjinshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangjinshenqingVO> selectListVO(Wrapper<JiangjinshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangjinshenqingVO selectVO(Wrapper<JiangjinshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangjinshenqingView> selectListView(Wrapper<JiangjinshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangjinshenqingView selectView(Wrapper<JiangjinshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
