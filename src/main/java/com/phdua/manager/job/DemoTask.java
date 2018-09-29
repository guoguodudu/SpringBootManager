//package com.phdua.manager.job;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//@Configurable
//@EnableScheduling
//@EnableAsync
//public class DemoTask {
//    @Async
//    @Scheduled(cron = "0/5 * *  * * ? ")
//    public void startSchedule() {
//        System.out.println("===========1=>");
//        try {
//            for(int i=1;i<=10;i++){
//                System.out.println("=1==>"+i+Thread.currentThread().getName());
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Async
//    @Scheduled(cron = "0/5 * *  * * ? ")
//    public void startSchedule2() {
//        for(int i=1;i<=10;i++){
//            System.out.println("=2==>"+i+Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}