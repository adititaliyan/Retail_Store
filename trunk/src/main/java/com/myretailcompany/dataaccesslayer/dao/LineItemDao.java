package com.myretailcompany.dataaccesslayer.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myretailcompany.dataaccesslayer.entity.LineItem;

public interface LineItemDao extends CrudRepository<LineItem, Long> {
	
	public List<LineItem> findByProduct_id(long prodId);

}
