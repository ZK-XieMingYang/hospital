package com.qhit.doctorMenu.service;

import java.util.List;
import com.qhit.doctorMenu.pojo.DoctorMenu;


public interface IDoctorMenuService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    DoctorMenu findById(Object id);

    boolean freeUpdate(String sql);

    List<DoctorMenu> search(DoctorMenu doctorMenu);

    boolean findByMenuName(String menuName);
}