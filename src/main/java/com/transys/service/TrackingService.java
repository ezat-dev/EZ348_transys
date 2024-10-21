package com.transys.service;

import java.util.concurrent.ExecutionException;

public interface TrackingService {
	
	public void trackingDataSet(String devicecode, int curLocation, String setDataDir) throws InterruptedException, ExecutionException;
	public void ccf1Tracking01() throws InterruptedException, ExecutionException;
	public void ccf1Tracking02() throws InterruptedException, ExecutionException;
	public void ccf1Tracking03() throws InterruptedException, ExecutionException;
	public void ccf1Tracking04() throws InterruptedException, ExecutionException;
}
