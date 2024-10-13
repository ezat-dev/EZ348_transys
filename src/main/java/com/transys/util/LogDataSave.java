package com.transys.util;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDataSave {

	/* 화면이름 정리
	  열전출고 : PLCWRITE (창고 -> 열처리설비로 출고)
	  열후입고 : MCHINPUT (열처리설비 -> 공통설비 -> 창고로 입고)
	*/
	
	public void logDataSaveFile(String page, String remark){
		System.out.println(page+" // "+remark);
		//page : 화면이름, remark : 로그내용
		Date today = new Date();
		SimpleDateFormat fileNameFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String fileName = fileNameFormat.format(today)+"_로그";
		String dateTime = dateTimeFormat.format(today);
		
		System.out.println("D:\\LOG\\"+fileName+".txt");
		System.out.println(dateTime+" // "+page+" // "+remark);
		try {
			File file = new File("D:\\LOG\\"+fileName+".txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			//Writer생성
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			//파일에 데이터쓰기
			
			dos.writeUTF(dateTime+" // "+page+" // "+remark);
			
			dos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
