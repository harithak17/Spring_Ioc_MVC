package org.spring.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;  
	private String name;  
	private HashMap<String, String> answers; // Updated to HashMap<String, String>

//	private Map<String,String> answers;  
	public Question() {}  
	public Question(int id, String name, HashMap<String, String> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	
	public void displayInfo() {
	    System.out.println("Question ID: " + id);
	    System.out.println("Question Name: " + name);
	    System.out.println("Answers....");

	    answers.forEach((key, value) ->
        System.out.println("Answer: " + key + " Posted By: " + value)
    );
//	    for (Map.Entry<String, String> entry : answers.entrySet()) {
//	        System.out.println("Answer: " + entry.getKey() + " Posted By: " + entry.getValue());
//	    }
	}
	
	
//	public void displayInfo(){  
//	    System.out.println("question id:"+id);  
//	    System.out.println("question name:"+name);  
//	    System.out.println("Answers....");  
//	    Set<Entry<String, String>> set=answers.entrySet();  
//	    Iterator<Entry<String, String>> itr=set.iterator();  
//	    while(itr.hasNext()){  
//	        Entry<String,String> entry=itr.next();  
//	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
//	    }  
//}
	
}
