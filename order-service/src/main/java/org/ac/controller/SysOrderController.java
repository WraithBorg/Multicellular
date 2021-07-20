package org.ac.controller;

import org.ac.domain.ProductOrder;
import org.ac.service.ISysOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/orders")
public class SysOrderController {

    @Resource
    ISysOrderService sysOrderService;

    @GetMapping("/{productId}/{userId}")
    public ProductOrder saveOrder(@PathVariable Integer productId, @PathVariable Integer userId){
        return sysOrderService.makeOrder(productId,userId);
    }
}
