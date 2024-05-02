package com.entity.view;

import com.entity.JiangjinshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 奖金申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
@TableName("jiangjinshenqing")
public class JiangjinshenqingView  extends JiangjinshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiangjinshenqingView(){
	}
 
 	public JiangjinshenqingView(JiangjinshenqingEntity jiangjinshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, jiangjinshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
