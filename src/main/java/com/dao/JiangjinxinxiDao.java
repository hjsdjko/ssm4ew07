package com.dao;

import com.entity.JiangjinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangjinxinxiVO;
import com.entity.view.JiangjinxinxiView;


/**
 * 奖金信息
 * 
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
public interface JiangjinxinxiDao extends BaseMapper<JiangjinxinxiEntity> {
	
	List<JiangjinxinxiVO> selectListVO(@Param("ew") Wrapper<JiangjinxinxiEntity> wrapper);
	
	JiangjinxinxiVO selectVO(@Param("ew") Wrapper<JiangjinxinxiEntity> wrapper);
	
	List<JiangjinxinxiView> selectListView(@Param("ew") Wrapper<JiangjinxinxiEntity> wrapper);

	List<JiangjinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiangjinxinxiEntity> wrapper);
	
	JiangjinxinxiView selectView(@Param("ew") Wrapper<JiangjinxinxiEntity> wrapper);
	
}
