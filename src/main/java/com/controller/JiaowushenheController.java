package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaowushenheEntity;
import com.entity.view.JiaowushenheView;

import com.service.JiaowushenheService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 教务审核
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
@RestController
@RequestMapping("/jiaowushenhe")
public class JiaowushenheController {
    @Autowired
    private JiaowushenheService jiaowushenheService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaowushenheEntity jiaowushenhe, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fudaoyuan")) {
			jiaowushenhe.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			jiaowushenhe.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaowushenheEntity> ew = new EntityWrapper<JiaowushenheEntity>();
		PageUtils page = jiaowushenheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaowushenhe), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaowushenheEntity jiaowushenhe, 
		HttpServletRequest request){
        EntityWrapper<JiaowushenheEntity> ew = new EntityWrapper<JiaowushenheEntity>();
		PageUtils page = jiaowushenheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaowushenhe), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaowushenheEntity jiaowushenhe){
       	EntityWrapper<JiaowushenheEntity> ew = new EntityWrapper<JiaowushenheEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaowushenhe, "jiaowushenhe")); 
        return R.ok().put("data", jiaowushenheService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaowushenheEntity jiaowushenhe){
        EntityWrapper< JiaowushenheEntity> ew = new EntityWrapper< JiaowushenheEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaowushenhe, "jiaowushenhe")); 
		JiaowushenheView jiaowushenheView =  jiaowushenheService.selectView(ew);
		return R.ok("查询教务审核成功").put("data", jiaowushenheView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaowushenheEntity jiaowushenhe = jiaowushenheService.selectById(id);
        return R.ok().put("data", jiaowushenhe);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaowushenheEntity jiaowushenhe = jiaowushenheService.selectById(id);
        return R.ok().put("data", jiaowushenhe);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaowushenheEntity jiaowushenhe, HttpServletRequest request){
    	jiaowushenhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaowushenhe);

        jiaowushenheService.insert(jiaowushenhe);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaowushenheEntity jiaowushenhe, HttpServletRequest request){
    	jiaowushenhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaowushenhe);

        jiaowushenheService.insert(jiaowushenhe);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiaowushenheEntity jiaowushenhe, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaowushenhe);
        jiaowushenheService.updateById(jiaowushenhe);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaowushenheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaowushenheEntity> wrapper = new EntityWrapper<JiaowushenheEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fudaoyuan")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiaowushenheService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
