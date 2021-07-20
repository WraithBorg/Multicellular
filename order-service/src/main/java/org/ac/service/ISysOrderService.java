package org.ac.service;

import org.ac.domain.ProductOrder;

public interface ISysOrderService {
    public ProductOrder makeOrder(int productId, int userId) ;
}
