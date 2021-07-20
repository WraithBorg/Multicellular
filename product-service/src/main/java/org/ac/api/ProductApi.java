package org.ac.api;

import com.ac.constant.ModulePrePath;
import org.ac.service.IProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(ModulePrePath.API + "/products")
public class ProductApi {

    @Resource
    IProductService productService;

    /**
     * 更新销量
     *
     * @param productId
     */
    @PutMapping("/{productId}")
    public void updateSales (@PathVariable String productId) {
        System.out.println("商品：" + productId + "更新销量数");
    }

    /**
     * 下单扣减库存
     *
     * @param productId
     * @param subCount
     */
    @PutMapping("/sub_stock/{productId}/{subCount}")
    public void subStock (@PathVariable int productId, @PathVariable int subCount) {
        productService.subStock(productId, subCount);
    }
}
