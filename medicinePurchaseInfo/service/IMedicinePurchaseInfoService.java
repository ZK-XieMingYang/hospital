package com.qhit.medicinePurchaseInfo.service;

import java.util.List;
import com.qhit.medicinePurchaseInfo.pojo.MedicinePurchaseInfo;

import javax.servlet.http.HttpSession;


public interface IMedicinePurchaseInfoService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    MedicinePurchaseInfo findById(Object id);

    boolean freeUpdate(String sql);

    List<MedicinePurchaseInfo> search(MedicinePurchaseInfo medicinePurchaseInfo);

    void collect(HttpSession session);

    List<MedicinePurchaseInfo> findAllByUserId(HttpSession session);

    List<MedicinePurchaseInfo> findByApprv(HttpSession session);
}