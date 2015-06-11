package com;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private List<Answer> answers;
	private Map<String,String> maps;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	/**
	 * @return the maps
	 */
	public Map<String, String> getMaps() {
		return maps;
	}
	/**
	 * @param maps the maps to set
	 */
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	/**
	 * @return the answers
	 */
	public List<Answer> getAnswers() {
		return answers;
	}
	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers
				+ "]";
	}
	
	void display()
	{
		System.out.println("thissss");
		System.out.println(id);
		System.out.println(name);
		Iterator<Answer> it=answers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Set<Entry<String,String>> sets=maps.entrySet();
		Iterator<Entry<String,String>> itm=sets.iterator();
		while(itm.hasNext())
		{
			Entry<String,String> entry=itm.next();
			System.out.println("Answers"+entry.getKey()+"by"+entry.getValue());
		}
		
	}
	
}
