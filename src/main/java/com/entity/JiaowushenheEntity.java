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
 * 教务审核
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
@TableName("jiaowushenhe")
public class JiaowushenheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaowushenheEntity() {
		
	}
	
	public JiaowushenheEntity(T t) {
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
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 奖金金额
	 */
					
	private Integer jiangjinjine;
	
	/**
	 * 申请理由
	 */
					
	private String shenqingliyou;
	
	/**
	 * 申请文件
	 */
					
	private String shenqingwenjian;
	
	/**
	 * 申请日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenqingriqi;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 审核意见
	 */
					
	private String shenheyijian;
	
	/**
	 * 审核状态
	 */
					
	private String shenhezhuangtai;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
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
	 * 设置：申请理由
	 */
	public void setShenqingliyou(String shenqingliyou) {
		this.shenqingliyou = shenqingliyou;
	}
	/**
	 * 获取：申请理由
	 */
	public String getShenqingliyou() {
		return shenqingliyou;
	}
	/**
	 * 设置：申请文件
	 */
	public void setShenqingwenjian(String shenqingwenjian) {
		this.shenqingwenjian = shenqingwenjian;
	}
	/**
	 * 获取：申请文件
	 */
	public String getShenqingwenjian() {
		return shenqingwenjian;
	}
	/**
	 * 设置：申请日期
	 */
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：审核意见
	 */
	public void setShenheyijian(String shenheyijian) {
		this.shenheyijian = shenheyijian;
	}
	/**
	 * 获取：审核意见
	 */
	public String getShenheyijian() {
		return shenheyijian;
	}
	/**
	 * 设置：审核状态
	 */
	public void setShenhezhuangtai(String shenhezhuangtai) {
		this.shenhezhuangtai = shenhezhuangtai;
	}
	/**
	 * 获取：审核状态
	 */
	public String getShenhezhuangtai() {
		return shenhezhuangtai;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
