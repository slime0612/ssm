package com.itheima.service;

import com.itheima.domain.SysLog;

import java.util.List;


public interface SysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}

