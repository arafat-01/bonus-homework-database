package com.example.bonus.repo;

import com.example.bonus.models.DiseaseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseTypeRepository extends JpaRepository<DiseaseType, Long> {
}
