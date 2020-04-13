package com.itheima.dao;

import com.itheima.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public  interface SysLogDao {

    @Insert("insert into sysLog(visitTime,username,ip,url,executionTime,method) values (#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    public  void save(SysLog sysLog) throws Exception;

    @Select("select * from sysLog")
    List<SysLog> findAll();
}
