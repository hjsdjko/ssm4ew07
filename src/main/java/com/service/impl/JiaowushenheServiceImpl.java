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


import com.dao.JiaowushenheDao;
import com.entity.JiaowushenheEntity;
import com.service.JiaowushenheService;
import com.entity.vo.JiaowushenheVO;
import com.entity.view.JiaowushenheView;

@Service("jiaowushenheService")
public class JiaowushenheServiceImpl extends ServiceImpl<JiaowushenheDao, JiaowushenheEntity> implements JiaowushenheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaowushenheEntity> page = this.selectPage(
                new Query<JiaowushenheEntity>(params).getPage(),
                new EntityWrapper<JiaowushenheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaowushenheEntity> wrapper) {
		  Page<JiaowushenheView> page =new Query<JiaowushenheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaowushenheVO> selectListVO(Wrapper<JiaowushenheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaowushenheVO selectVO(Wrapper<JiaowushenheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaowushenheView> selectListView(Wrapper<JiaowushenheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaowushenheView selectView(Wrapper<JiaowushenheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
