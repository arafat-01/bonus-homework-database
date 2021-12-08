package com.example.bonus.repo;

import com.example.bonus.models.Discover;
import com.example.bonus.models.DiscoverPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscoverRepository extends JpaRepository<Discover, DiscoverPK> {
}
