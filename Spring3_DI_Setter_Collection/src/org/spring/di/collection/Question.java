package org.spring.di.collection;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int qId;
	private String ques;
	private List<String> answers;
	
	
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	
	public void displayInfo()
	{
		System.out.println(qId+". "+ques);
		System.out.println("Answers are:");
		Iterator<String> itr=answers.iterator();
		int i=1;
		while(itr.hasNext())
		{
			System.out.println(i+") "+itr.next());
			i++;
		}
	}

}
