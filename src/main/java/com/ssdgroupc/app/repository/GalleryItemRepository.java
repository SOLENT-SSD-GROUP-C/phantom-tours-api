package com.ssdgroupc.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ssdgroupc.app.entity.GalleryItem;

public interface GalleryItemRepository extends CrudRepository<GalleryItem, Integer> {

}
