package com.ayouris.keykoak.controller;

import com.ayouris.keykoak.models.Test;
import com.ayouris.keykoak.repositorys.UserRepository;
import com.ayouris.keykoak.rsql.service.CustomRsqlVisitor;
import cz.jirutka.rsql.parser.RSQLParser;
import cz.jirutka.rsql.parser.ast.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/")
public class UserController {
    //KeycloakAccount keycloakAccount;
    //@Autowired
    //private KeycloakRestTemplate keycloakRestTemplate;
    @Autowired
    UserRepository userRepository;
    //public void t(){
      //  keycloakAccount.getRoles();
    //}
    @RequestMapping(method = RequestMethod.GET, value = "users")
    @ResponseBody
    public Object findAllByRsql(@RequestParam(value = "search") String search) {
        Node rootNode = new RSQLParser().parse(search);
        Specification<Test> spec = rootNode.accept(new CustomRsqlVisitor<>());
        return userRepository.findAll(spec);
    }
    @PostMapping(value = "users/add")
    public ResponseEntity<?> addUser(@RequestBody Test test){
        return ResponseEntity.ok(userRepository.save(test));
    }
}
