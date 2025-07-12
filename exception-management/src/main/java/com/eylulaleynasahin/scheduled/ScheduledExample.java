package com.eylulaleynasahin.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {

	// * * * * * *
	//@Scheduled(cron = "0 20 14 * * *")
	@Scheduled(cron = "*/5 * * * * *")
	public void write1To10() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");			
//		}
	}
}
