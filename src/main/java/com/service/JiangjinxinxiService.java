package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangjinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangjinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangjinxinxiView;


/**
 * 奖金信息
 *
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
public interface JiangjinxinxiService extends IService<JiangjinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangjinxinxiVO> selectListVO(Wrapper<JiangjinxinxiEntity> wrapper);
   	
   	JiangjinxinxiVO selectVO(@Param("ew") Wrapper<JiangjinxinxiEntity> wrapper);
   	
   	List<JiangjinxinxiView> selectListView(Wrapper<JiangjinxinxiEntity> wrapper);
   	
   	JiangjinxinxiView selectView(@Param("ew") Wrapper<JiangjinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangjinxinxiEntity> wrapper);
   	
}

