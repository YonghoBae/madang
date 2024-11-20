package com.example.DBTest.repository;

import com.example.DBTest.entity.ImportedBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImportedBookRepository extends JpaRepository<ImportedBookEntity, Integer> {
}
