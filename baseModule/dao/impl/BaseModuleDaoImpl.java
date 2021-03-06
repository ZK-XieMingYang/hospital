package com.qhit.baseModule.dao.impl;

import com.qhit.baseModule.dao.IBaseModuleDao;
import com.qhit.utils.BaseDao;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BaseModuleDaoImpl extends BaseDao implements IBaseModuleDao {

    @Override 
    public List findAll() { 
        String sql = "select * from base_module"; 
        return freeFind(sql); 
    } 


    @Override 
    public List findById(Object id) { 
        String sql = "select * from base_module where mid='"+id+"'"; 
        return freeFind(sql); 
    } 


    @Override 
    public List findByMname(Object mname) { 
        String sql = "select * from base_module where mname='"+mname+"'"; 
        return freeFind(sql); 
    } 




}