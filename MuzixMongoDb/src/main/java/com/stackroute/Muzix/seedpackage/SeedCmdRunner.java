//package com.stackroute.Muzix.seedpackage;
//
//import com.stackroute.Muzix.domain.Track;
//import com.stackroute.Muzix.repository.TrackRepository;
//import com.stackroute.Muzix.service.TrackService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SeedCmdRunner implements CommandLineRunner {
//    private TrackService trackService;
//
//    @Autowired
//    public SeedCmdRunner(TrackService trackService) {
//        this.trackService = trackService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Track muzix1 = Track.builder()
//                .name("Is mey tera ghata")
//                .comment("Gajendra Verma")
//                .build();
//        Track muzix2 = Track.builder()
//                .name("mera swapno ka rani")
//                .comment("Kishor Kumar")
//                .build();
//        Track muzix3 = Track.builder()
//                .name("Tum hi ho")
//                .comment("Arijit Singh")
//                .build();
//        Track muzix4 = Track.builder()
//                .name("Rain Over me")
//                .comment("Mark Anthony")
//                .build();
//        Track muzix5 = Track.builder()
//                .name("Move to the music")
//                .comment("RAW theme")
//                .build();
//        Track muzix6 = Track.builder()
//                .name("Guleba")
//                .comment("Prabhu deba")
//                .build();
//        Track muzix7 = Track.builder()
//                .name("Ekla chalo re")
//                .comment("RAW theme")
//                .build();
//        Track muzix8 = Track.builder()
//                .name("Move to the music")
//                .comment("RAW theme")
//                .build();
//        Track muzix9 = Track.builder()
//                .name("Move to the music")
//                .comment("RAW theme")
//                .build();
//        Track muzix10 = Track.builder()
//                .name("Move to the music")
//                .comment("RAW theme")
//                .build();
//        trackService.saveTrack( muzix1);
//        trackService.saveTrack( muzix2);
//        trackService.saveTrack( muzix3);
//        trackService.saveTrack( muzix4);
//        trackService.saveTrack( muzix5);
//
//    }
//}