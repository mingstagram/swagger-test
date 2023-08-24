package com.cos.rtspTest;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j 
//@Configuration
//@EnableScheduling
public class ScheduleTest {
	
//	@Scheduled(cron = "* * * * * *")
	public void test() { 
		log.info("Scheduled task executed.");
	}

}
