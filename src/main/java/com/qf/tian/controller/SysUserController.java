package com.qf.tian.controller;

import com.qf.tian.common.result.RespResult;
import com.qf.tian.common.vo.ShopcarVO;
import com.qf.tian.entity.Shopcar;
import com.qf.tian.service.ScoreService;
import com.qf.tian.service.ShopcarService;
import com.qf.tian.service.impl.ShopcarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    ScoreService scoreService;
    @Autowired
    ShopcarService shopcarService;
    @PostMapping("/sign")    //积分签到
    public RespResult<String> sign(@RequestParam("scoreType") int scoreType,
                                   @RequestParam("scoreMemberId") long scoreMemberId,
                                   @RequestParam("scoreSize")int scoreSize){
        return scoreService.sign(scoreType,scoreMemberId,scoreSize);
    }

    @PostMapping("/shopcar/add")         //添加购物车
    public RespResult<String> addShopcar(@RequestParam("shopcarMemberId") long shopcarMemberId, @RequestParam(
            "shopcarGoodsId") int shopcarGoodsId, @RequestParam("shopcarGoodsNumber") int shopcarGoodsNumber) {
        return shopcarService.addShopcar(shopcarMemberId, shopcarGoodsId, shopcarGoodsNumber);
    }

    @PostMapping("/list")        //查询所有购物车
    public RespResult<List<ShopcarVO>> listShopcar(@RequestParam("shopcarMemberId") long shopcarMemberId){
        return shopcarService.listShopcar(shopcarMemberId);
    }
}
