package com.example.bonus.repo;

import com.example.bonus.models.Specialize;
import com.example.bonus.models.SpecializePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializeRepository extends JpaRepository<Specialize, SpecializePK> {
}
