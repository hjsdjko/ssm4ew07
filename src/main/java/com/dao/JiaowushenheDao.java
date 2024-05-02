package com.dao;

import com.entity.JiaowushenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaowushenheVO;
import com.entity.view.JiaowushenheView;


/**
 * 教务审核
 * 
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
public interface JiaowushenheDao extends BaseMapper<JiaowushenheEntity> {
	
	List<JiaowushenheVO> selectListVO(@Param("ew") Wrapper<JiaowushenheEntity> wrapper);
	
	JiaowushenheVO selectVO(@Param("ew") Wrapper<JiaowushenheEntity> wrapper);
	
	List<JiaowushenheView> selectListView(@Param("ew") Wrapper<JiaowushenheEntity> wrapper);

	List<JiaowushenheView> selectListView(Pagination page,@Param("ew") Wrapper<JiaowushenheEntity> wrapper);
	
	JiaowushenheView selectView(@Param("ew") Wrapper<JiaowushenheEntity> wrapper);
	
}
