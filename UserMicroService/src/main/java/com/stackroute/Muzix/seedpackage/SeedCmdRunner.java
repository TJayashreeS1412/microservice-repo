//package com.stackroute.Muzix.seedpackage;
//
//import com.stackroute.Muzix.domain.User;
//import com.stackroute.Muzix.repository.UserRepository;
//import com.stackroute.Muzix.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SeedCmdRunner implements CommandLineRunner {
//    private UserService userService;
//
//    @Autowired
//    public SeedCmdRunner(UserService userService) {
//        this.userService =userService ;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        User muzix1 = User.builder()
//                .name("Is mey tera ghata")
//                .comment("Gajendra Verma")
//                .build();
//        User muzix2 = User.builder()
//                .name("mera swapno ka rani")
//                .comment("Kishor Kumar")
//                .build();
//        User muzix3 = User.builder()
//                .name("Tum hi ho")
//                .comment("Arijit Singh")
//                .build();
//        User muzix4 = User.builder()
//                .name("Rain Over me")
//                .comment("Mark Anthony")
//                .build();
//        User muzix5 = User.builder()
//                .name("Move to the music")
//                .comment("RAW theme")
//                .build();
//        User muzix6 = User.builder()
//                .name("Guleba")
//                .comment("Prabhu deba")
//                .build();
//        User muzix7 = User.builder()
//                .name("Ekla chalo re")
//                .comment("RAW theme")
//                .build();
////        Track muzix8 = Track.builder()
////                .name("Move to the music")
////                .comment("RAW theme")
////                .build();
////        Track muzix9 = Track.builder()
////                .name("Move to the music")
////                .comment("RAW theme")
////                .build();
////        Track muzix10 = Track.builder()
////                .name("Move to the music")
////                .comment("RAW theme")
////                .build();
//        userService.saveUser( muzix1);
//        userService.saveUser( muzix2);
//        userService.saveUser( muzix3);
//        userService.saveUser( muzix4);
//        userService.saveUser( muzix5);
//
//    }
//}