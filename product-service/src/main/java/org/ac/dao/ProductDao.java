package org.ac.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.ac.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductDao extends BaseMapper<Product> {
}
