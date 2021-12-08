package com.example.bonus.repo;

import com.example.bonus.models.PublicServant;
import com.example.bonus.models.PublicServantPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicServantRepository extends JpaRepository<PublicServant, PublicServantPK> {
}
