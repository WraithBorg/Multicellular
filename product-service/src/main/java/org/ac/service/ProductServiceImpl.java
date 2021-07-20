package org.ac.service;

import org.ac.dao.ProductDao;
import org.ac.domain.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements IProductService {
    @Resource
    ProductDao productDao;

    /**
     * 下单扣减库存
     * @param productId
     * @param subCount
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void subStock(int productId, int subCount) {
        Product product = productDao.selectById(productId);
        int newStock = product.getStock()-subCount;
        product.setStock(newStock);

        productDao.updateById(product);
        int a = 1 / 0;
        System.out.println("下单扣减库存成功!");
    }
}
