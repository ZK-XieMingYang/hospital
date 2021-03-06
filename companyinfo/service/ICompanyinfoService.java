package com.qhit.companyinfo.service;

import java.util.List;
import com.qhit.companyinfo.pojo.Companyinfo;


public interface ICompanyinfoService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    Companyinfo findById(Object id);

    boolean freeUpdate(String sql);

    List<Companyinfo> search(Companyinfo companyinfo);

}