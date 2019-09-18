package com.direa.kjy;

import java.io.File;
//import java.util.Date;

public class DirectoryChecker {

	public static void main(String[] args) {
		File dir = new File("/home");
		
//		String pathname = "/home/direa/" + new Date().getTime();
//		File makeDir = new File(pathname);
//		System.out.println(new Date().getTime());
//		System.out.println(makeDir.mkdir());
		
		File[] fileList = dir.listFiles();
		for (File file : fileList) {
			String fileName = file.getName();
			System.out.println(fileName);
			String[] fileNameSplit = fileName.split("\\.");
			if(fileNameSplit.length < 2) continue;
			System.out.println(fileName + " + " + fileNameSplit[1]);
		}

	}

}
