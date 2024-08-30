package com.cafecabinet.serviceImpl;

import com.cafecabinet.POJO.User;
import com.cafecabinet.constents.CafeConstant;
import com.cafecabinet.dao.UserDao;
import com.cafecabinet.service.UserService;
import com.cafecabinet.utils.CafeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        log.info("Inside signup {}", requestMap);
        if (validateSignUpMap(requestMap)) {

            User user = userDao.findByEmailId(requestMap.get("email"));

        }
        else {
            return CafeUtils.getResponseEntity(CafeConstant.INVALID_DATA, HttpStatus.BAD_REQUEST);
        }
        return null;
    }

    private boolean validateSignUpMap(Map<String, String> requestMap) {
        if (requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
                && requestMap.containsKey("email") && requestMap.containsKey("password"))
        {
            return true;
        }
        else
            return false;
    }
}
