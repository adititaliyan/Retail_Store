package com.myretailcompany.dataaccesslayer.dao;

import org.springframework.data.repository.CrudRepository;
import com.myretailcompany.dataaccesslayer.entity.Bill;

public interface BillDao extends CrudRepository<Bill, Long> {

}
