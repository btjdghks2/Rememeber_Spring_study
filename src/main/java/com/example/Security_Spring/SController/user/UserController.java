package com.example.Security_Spring.SController.user;

import com.example.Security_Spring.SService.UserService;
import com.example.Security_Spring.Security_Entity.BaseDto;
import com.example.Security_Spring.Security_Entity.BaseEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(value="/mypage")
    public String myPage() throws Exception {
        return "user/mypage";
    }

    @GetMapping("/users")
    public String createUser() {
        return "user/login/register";
    }

    @PostMapping("/users")
    public String createUser(BaseDto baseDto) {

        ModelMapper modelMapper = new ModelMapper();
        BaseEntity baseEntity = modelMapper.map(baseDto, BaseEntity.class);
        baseEntity.setPassword(passwordEncoder.encode(baseEntity.getPassword()));
        userService.createUser(baseEntity);


        return "redirect:/";
    }
}
