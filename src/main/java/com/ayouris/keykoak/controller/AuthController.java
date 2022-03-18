package com.ayouris.keykoak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @GetMapping(value = "/")
    public ResponseEntity<?> helloWorld(){
        return ResponseEntity.ok("hello fom spring");
    }
}
