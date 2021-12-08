package com.example.bonus.repo;

import com.example.bonus.models.Disease;
import com.example.bonus.models.RecordPK;
import com.example.bonus.models.Recordd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecorddRepository extends JpaRepository<Recordd, RecordPK> {
    List<Recordd> findAllByRecordPKDisease(Disease disease);
}
