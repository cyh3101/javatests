package com.cyh.demos.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File(".");
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		//获取file对象的绝对路径名
		System.out.println(file.getAbsolutePath());
		//获取file对象的绝对路径
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
		
		File temFile = File.createTempFile("aaa", ".txt", file);
		temFile.deleteOnExit();
		
		File newFile = new File(System.currentTimeMillis() + "");
		
		System.out.println("newFile对象是否存在:" + newFile.exists());

	}

}
