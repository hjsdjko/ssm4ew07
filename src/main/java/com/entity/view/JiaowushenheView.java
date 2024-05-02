package com.entity.view;

import com.entity.JiaowushenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教务审核
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
@TableName("jiaowushenhe")
public class JiaowushenheView  extends JiaowushenheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaowushenheView(){
	}
 
 	public JiaowushenheView(JiaowushenheEntity jiaowushenheEntity){
 	try {
			BeanUtils.copyProperties(this, jiaowushenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
