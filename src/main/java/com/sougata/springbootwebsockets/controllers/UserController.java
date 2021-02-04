package com.sougata.springbootwebsockets.controllers;

import com.sougata.springbootwebsockets.models.User;
import com.sougata.springbootwebsockets.models.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    UserResponse getUser(User user) {
        return new UserResponse(user.getName());
    }
}
