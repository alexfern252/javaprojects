package com.haripadisetti.corejava.design.observerpattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewsAgency newsAgency = new NewsAgency();
		NewsChannel newsChannel1 = new NewsChannel();
		NewsChannel newsChannel2 = new NewsChannel();
		
		newsAgency.addChannel(newsChannel1);
		newsAgency.addChannel(newsChannel2);

		newsAgency.setNews("Breaking news");
	}

}
