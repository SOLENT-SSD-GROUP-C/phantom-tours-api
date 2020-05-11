package com.ssdgroupc.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ssdgroupc.app.entity.Bike;

public interface BikeRepository extends CrudRepository<Bike, Integer> {

}
