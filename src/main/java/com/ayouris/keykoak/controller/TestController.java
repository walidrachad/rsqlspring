package com.ayouris.keykoak.controller;

import com.ayouris.keykoak.models.AffectationRole;
import com.ayouris.keykoak.repositorys.AffectationRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    AffectationRoleRepo affectationRoleRepo;
    @GetMapping(value = "/")
    public ResponseEntity<?> getTestText(){
        return ResponseEntity.ok("done test");
    }

    public List<AffectationRole> affectationRole(){
        return affectationRoleRepo.findAll();
    }
    @PostMapping(value = "/add")
    public ResponseEntity<?> addEntity(@RequestBody AffectationRole affectationRole){
        return ResponseEntity.ok(affectationRoleRepo.save(affectationRole));
    }
}
