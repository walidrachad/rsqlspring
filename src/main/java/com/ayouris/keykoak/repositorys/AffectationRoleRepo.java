package com.ayouris.keykoak.repositorys;

import com.ayouris.keykoak.models.AffectationRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository

public interface AffectationRoleRepo extends JpaRepository<AffectationRole,Long> {

}
