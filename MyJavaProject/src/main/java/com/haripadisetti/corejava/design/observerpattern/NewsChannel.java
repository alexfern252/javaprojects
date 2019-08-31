package com.haripadisetti.corejava.design.observerpattern;


//Observer
public class NewsChannel implements Channel
{
	
	String news ;

	public void update(Object obj) {
		this.news = (String) obj;
		System.out.println("News Channel updated:" + news);
	}

}
