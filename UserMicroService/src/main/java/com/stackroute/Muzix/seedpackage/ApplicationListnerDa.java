package com.stackroute.Muzix.seedpackage;


import com.stackroute.Muzix.domain.User;
import com.stackroute.Muzix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationListnerDa implements ApplicationListener<ContextRefreshedEvent> {
    private UserService userService;
    @Autowired
    public ApplicationListnerDa(UserService trackService){
        this.userService=trackService;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            userService.saveUser(new User("despacito","excellent"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}
