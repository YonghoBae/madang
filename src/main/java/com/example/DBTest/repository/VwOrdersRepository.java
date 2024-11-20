package com.example.DBTest.repository;

import com.example.DBTest.entity.VwOrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VwOrdersRepository extends JpaRepository<VwOrdersEntity, Integer> {
}
