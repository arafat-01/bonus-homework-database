package com.example.bonus.repo;

import com.example.bonus.models.Doctor;
import com.example.bonus.models.DoctorPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, DoctorPK> {
}
