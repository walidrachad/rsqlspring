package com.ayouris.keykoak.repositorys;

import com.ayouris.keykoak.models.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Test,Long> {
    List<Test> findAll(Specification<Test> spec);
}
