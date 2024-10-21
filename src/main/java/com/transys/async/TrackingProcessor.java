package com.transys.async;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.transys.service.TrackingService;


public class TrackingProcessor {
	
	@Autowired
	private TrackingService trackingService;	
	
	@Scheduled(fixedRate = 2000)
	public void handle() throws InterruptedException, ExecutionException, IOException{
//		plcWriteService.plcWriteTimer();
		trackingService.ccf1Tracking01();
		trackingService.ccf1Tracking02();
		trackingService.ccf1Tracking03();
		trackingService.ccf1Tracking04();
	}
}
