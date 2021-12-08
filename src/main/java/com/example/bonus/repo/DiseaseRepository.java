package com.example.bonus.repo;

import com.example.bonus.models.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, String> {
    Disease findDiseaseByDiseaseCode(String diseaseCode);

    List<Disease> findAll();
}
