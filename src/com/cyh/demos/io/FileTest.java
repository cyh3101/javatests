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
		//��ȡfile����ľ���·����
		System.out.println(file.getAbsolutePath());
		//��ȡfile����ľ���·��
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
		
		File temFile = File.createTempFile("aaa", ".txt", file);
		temFile.deleteOnExit();
		
		File newFile = new File(System.currentTimeMillis() + "");
		
		System.out.println("newFile�����Ƿ����:" + newFile.exists());

	}

}
