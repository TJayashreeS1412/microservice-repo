package com.stackroute.Muzix.seedpackage;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationListnerDa implements ApplicationListener<ContextRefreshedEvent> {
    private TrackService trackService;
    @Autowired
    public ApplicationListnerDa(TrackService trackService){
        this.trackService=trackService;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            System.out.println("before seeding data");
            trackService.saveTrack(new Track("despacito","excellent"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}
