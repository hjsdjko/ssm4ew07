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


import com.dao.JiangjinxinxiDao;
import com.entity.JiangjinxinxiEntity;
import com.service.JiangjinxinxiService;
import com.entity.vo.JiangjinxinxiVO;
import com.entity.view.JiangjinxinxiView;

@Service("jiangjinxinxiService")
public class JiangjinxinxiServiceImpl extends ServiceImpl<JiangjinxinxiDao, JiangjinxinxiEntity> implements JiangjinxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangjinxinxiEntity> page = this.selectPage(
                new Query<JiangjinxinxiEntity>(params).getPage(),
                new EntityWrapper<JiangjinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangjinxinxiEntity> wrapper) {
		  Page<JiangjinxinxiView> page =new Query<JiangjinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangjinxinxiVO> selectListVO(Wrapper<JiangjinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangjinxinxiVO selectVO(Wrapper<JiangjinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangjinxinxiView> selectListView(Wrapper<JiangjinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangjinxinxiView selectView(Wrapper<JiangjinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
