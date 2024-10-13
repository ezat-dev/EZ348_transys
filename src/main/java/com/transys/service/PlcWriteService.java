package com.transys.service;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public interface PlcWriteService {

	void plcWrite() throws InterruptedException, ExecutionException, IOException;
	
	public void plcWriteTimer() throws InterruptedException, ExecutionException, IOException;
}
