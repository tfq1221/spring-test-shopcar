package com.qf.tian;

import com.qf.tian.common.utils.CommonBeanUtils;
import com.qf.tian.common.vo.ShopcarVO;
import com.qf.tian.entity.Shopcar;
import com.qf.tian.entity.Sign;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
//        ArrayList<Object> list1 = new ArrayList<>();
//        for (int i=1;i<10;i++) {
//            Sign sign = new Sign();
//            sign.setSignMemberId((long) i);
//            list1.add(sign);
//        }
        Shopcar shopcar=new Shopcar();
        shopcar.setShopcarId(1);
        Shopcar shopcar2 = new Shopcar();
        System.out.println(shopcar2);
        CommonBeanUtils.copyProperties(shopcar,shopcar2);
        System.out.println(shopcar2);

    }
}
