package com.myclass;

import java.util.ArrayList;

public class MyClass {
	
	public int memory = 1024;
	public int i = 0;
	public int cache;
	public int insize;
	public String flag;
	public int free;
	public String result ="";
	ArrayList<String> list = new ArrayList<String>();
	
	public void HardFree(int s){
		i++;
		cache = memory;
		cache += s;
		if(cache <=0){
			System.out.println("Sorry Hadr is full");
		} else {
			free = cache;
			System.out.println("Free memory:"+free+"Mb"+i);
		}
	}
	
	public void SaveNameFile(String NameFile){
		list.add(NameFile);
	}
	
	public void PrintFiles(){
		for (int i = 0; i < list.size(); i++) {
			result = result + list.get(i);
			System.out.println(result);
		}
	}
	
	public void AllMemory(){
		System.out.println("All memory:"+memory+"Mb");
	}
	
	public void Print(){
		//System.out.println(flag);
	}
	
	public void NewFileSize(String name, int size){
		System.out.println("New file with name: '"+name+"' and size:"+size+"Mb");
	}
	
}