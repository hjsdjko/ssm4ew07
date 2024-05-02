package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangjinshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangjinshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangjinshenqingView;


/**
 * 奖金申请
 *
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
public interface JiangjinshenqingService extends IService<JiangjinshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangjinshenqingVO> selectListVO(Wrapper<JiangjinshenqingEntity> wrapper);
   	
   	JiangjinshenqingVO selectVO(@Param("ew") Wrapper<JiangjinshenqingEntity> wrapper);
   	
   	List<JiangjinshenqingView> selectListView(Wrapper<JiangjinshenqingEntity> wrapper);
   	
   	JiangjinshenqingView selectView(@Param("ew") Wrapper<JiangjinshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangjinshenqingEntity> wrapper);
   	
}

