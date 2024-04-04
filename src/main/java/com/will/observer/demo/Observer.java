package com.will.observer.demo;

import java.util.Observable;


public class Observer implements java.util.Observer {
	private String currentStatus;

	@Override
	public void update(Observable o, Object arg) {
		currentStatus = ((TopicSubject)o).getStatus();
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
}
