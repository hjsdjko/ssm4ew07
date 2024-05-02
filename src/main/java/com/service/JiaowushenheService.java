package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaowushenheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaowushenheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaowushenheView;


/**
 * 教务审核
 *
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
public interface JiaowushenheService extends IService<JiaowushenheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaowushenheVO> selectListVO(Wrapper<JiaowushenheEntity> wrapper);
   	
   	JiaowushenheVO selectVO(@Param("ew") Wrapper<JiaowushenheEntity> wrapper);
   	
   	List<JiaowushenheView> selectListView(Wrapper<JiaowushenheEntity> wrapper);
   	
   	JiaowushenheView selectView(@Param("ew") Wrapper<JiaowushenheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaowushenheEntity> wrapper);
   	
}

