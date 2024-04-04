package com.will.observer.demo;

import java.util.Observable;

public class TopicSubject extends Observable {
	private String status;

	public void set(String s){
		status = s;
		setChanged();
		notifyObservers(status);
	}

	public String getStatus() {
		return status;
	}

}
