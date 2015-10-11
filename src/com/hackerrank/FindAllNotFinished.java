package com.hackerrank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * 
 * 
 * @author Kunal Khaware
 * email : nandkunal@gmail.com
 * Test Data:
 * 
starting task A
starting task B
finishing task B
starting task C
starting task D
finishing task A
 *
 */


public class FindAllNotFinished {
	
	
	private List<String> taskNotFinished = new LinkedList<String>();
	private static final String START="starting";
	private static final String FINISH="finishing";
			
			
	
	public void execute()
	{
		FileReader fr =  null;
		BufferedReader reader = null;
		try{
			fr= new FileReader("input.txt");
			reader = new BufferedReader(fr);
			 String line;
			    while ((line = reader.readLine()) != null) {
			     if(line.startsWith(START)){
			    	 taskNotFinished.add(line);
			     }else if(line.startsWith(FINISH)){
			    	 if(isTaskFinished(line)){
			    		 String modified=line.replace(FINISH, START);
			    		 taskNotFinished.remove(modified);
			    	 }
			     }
			    }
			
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				reader.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		FindAllNotFinished obj =  new FindAllNotFinished();
		obj.execute();
		obj.emit();
		
		
	}
	
	private void emit()
	{
		for(String s:taskNotFinished){
			System.out.println(s);
		}
	}
	
	private boolean isTaskFinished(String taskStr){
		
		String replacedVal=taskStr.replace(FINISH, START);
		return taskNotFinished.contains(replacedVal);
	}
	
}
