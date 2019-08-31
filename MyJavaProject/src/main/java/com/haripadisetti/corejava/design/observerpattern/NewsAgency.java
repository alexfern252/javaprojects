package com.haripadisetti.corejava.design.observerpattern;

import java.util.ArrayList;
import java.util.List;

//Observable
public class NewsAgency {
	String news;
	List<Channel> channelList = new ArrayList<Channel>(); // list of observers references

	public void addChannel(Channel channel) {
		this.channelList.add(channel);
	}

	public void removeChannel(Channel channel) {
		this.channelList.remove(channel);
	}

	public void setNews(String news) {
		for (Channel channel : channelList) {
			System.out.println("Notififying the  news channel");
			channel.update(news);
			
		}
	}
}
