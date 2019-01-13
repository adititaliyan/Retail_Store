package com.myretailcompany.dataaccesslayer.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myretailcompany.dataaccesslayer.entity.Product;

public interface ProductDao extends CrudRepository<Product, Long> {

	public long count();

	public List<Product> findByBarCodeId(String barCodeId);

}
