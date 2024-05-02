package com.dao;

import com.entity.JiangjinshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangjinshenqingVO;
import com.entity.view.JiangjinshenqingView;


/**
 * 奖金申请
 * 
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
public interface JiangjinshenqingDao extends BaseMapper<JiangjinshenqingEntity> {
	
	List<JiangjinshenqingVO> selectListVO(@Param("ew") Wrapper<JiangjinshenqingEntity> wrapper);
	
	JiangjinshenqingVO selectVO(@Param("ew") Wrapper<JiangjinshenqingEntity> wrapper);
	
	List<JiangjinshenqingView> selectListView(@Param("ew") Wrapper<JiangjinshenqingEntity> wrapper);

	List<JiangjinshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiangjinshenqingEntity> wrapper);
	
	JiangjinshenqingView selectView(@Param("ew") Wrapper<JiangjinshenqingEntity> wrapper);
	
}
