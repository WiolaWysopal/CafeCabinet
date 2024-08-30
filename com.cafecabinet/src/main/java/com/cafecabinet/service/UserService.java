package com.cafecabinet.service;

import com.cafecabinet.serviceImpl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import java.util.Map;

public interface UserService{

    ResponseEntity<String> signUp(Map<String, String> requestMap);

}
