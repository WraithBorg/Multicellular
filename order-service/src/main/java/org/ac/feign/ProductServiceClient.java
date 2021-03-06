package org.ac.feign;

import com.ac.constant.ModulePrePath;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("product-service")
//@FeignClient(name = "product-service", fallbackFactory = ProductFeignClientFallbackFactory.class)
public interface ProductServiceClient {

    /**
     * 更新产品销量
     *
     * @param productId
     */
    @PutMapping(ModulePrePath.API + "/products/{productId}")
    void updateSales (@PathVariable("productId") int productId);

    /**
     * 下单扣减库存
     *
     * @param productId
     * @param subCount
     */
    @PutMapping(ModulePrePath.API + "/products/sub_stock/{productId}/{subCount}")
    void subStock (@PathVariable("productId") int productId, @PathVariable("subCount") int subCount);

}
