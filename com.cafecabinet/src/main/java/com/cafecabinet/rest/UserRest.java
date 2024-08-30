package com.cafecabinet.rest;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping(path="/user")
public interface UserRest {

    @PostMapping(path="/signup")
    public ResponseEntity<String> signUp(@RequestBody(required=true) Map<String, String> requestMap);
}
