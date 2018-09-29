package com.phdua.manager.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 从配置文件加载任务信息
 *
 * @author 王久印
 * 2018年3月1日
 */
@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //@Scheduled(fixedDelayString = "${jobs.fixedDelay}")
//    @Scheduled(fixedDelayString = "2000")
//    public void getTask1() {
//        System.out.println("任务1,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
//    }

//    @Scheduled(cron = "${jobs.cron}")
//    public void getTask2() {
//        System.out.println("任务2,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
//    }
}
