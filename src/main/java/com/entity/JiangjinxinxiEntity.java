package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 奖金信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
@TableName("jiangjinxinxi")
public class JiangjinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiangjinxinxiEntity() {
		
	}
	
	public JiangjinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 奖金名称
	 */
					
	private String jiangjinmingcheng;
	
	/**
	 * 奖金类型
	 */
					
	private String jiangjinleixing;
	
	/**
	 * 奖金金额
	 */
					
	private Integer jiangjinjine;
	
	/**
	 * 申请条件
	 */
					
	private String shenqingtiaojian;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：奖金名称
	 */
	public void setJiangjinmingcheng(String jiangjinmingcheng) {
		this.jiangjinmingcheng = jiangjinmingcheng;
	}
	/**
	 * 获取：奖金名称
	 */
	public String getJiangjinmingcheng() {
		return jiangjinmingcheng;
	}
	/**
	 * 设置：奖金类型
	 */
	public void setJiangjinleixing(String jiangjinleixing) {
		this.jiangjinleixing = jiangjinleixing;
	}
	/**
	 * 获取：奖金类型
	 */
	public String getJiangjinleixing() {
		return jiangjinleixing;
	}
	/**
	 * 设置：奖金金额
	 */
	public void setJiangjinjine(Integer jiangjinjine) {
		this.jiangjinjine = jiangjinjine;
	}
	/**
	 * 获取：奖金金额
	 */
	public Integer getJiangjinjine() {
		return jiangjinjine;
	}
	/**
	 * 设置：申请条件
	 */
	public void setShenqingtiaojian(String shenqingtiaojian) {
		this.shenqingtiaojian = shenqingtiaojian;
	}
	/**
	 * 获取：申请条件
	 */
	public String getShenqingtiaojian() {
		return shenqingtiaojian;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
