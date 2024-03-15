package com.authexample.AuthExample.controller;

import com.authexample.AuthExample.model.AuthenticationResponse;
import com.authexample.AuthExample.model.User;
import com.authexample.AuthExample.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody User request) {
        System.out.println("Request received for register");
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody User request) {
        System.out.println("Request received for login");
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
