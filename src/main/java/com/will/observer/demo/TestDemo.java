package com.will.observer.demo;

import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {

		// Create Topic
		TopicSubject topic = new TopicSubject();

		// Create Observers list
		Observer observer1 = new Observer();
		Observer observer2 = new Observer();

		// Make observers listen to the topic.
		topic.addObserver(observer1);
		topic.addObserver(observer2);

		// Update Topic
		topic.set("Status 1");
		// Observers get notified with the new status.
		System.out.println("observer1.getCurrentStatus() = " + observer1.getCurrentStatus());
		System.out.println("observer2.getCurrentStatus() = " + observer2.getCurrentStatus());

		// Update Topic
		topic.set("Status 2");
		System.out.println(" ============================= status changed! ");
		// Observers get notified with the new status.
		System.out.println("observer1.getCurrentStatus() = " + observer1.getCurrentStatus());
		System.out.println("observer2.getCurrentStatus() = " + observer2.getCurrentStatus());

		// Remove an observer.
		topic.deleteObserver(observer1);
		// Update Topic
		topic.set("Status 3");
		System.out.println(" ============================= status changed! ");
		// Observers get notified with the new status.
		System.out.println("observer1.getCurrentStatus() = " + observer1.getCurrentStatus());
		System.out.println("observer2.getCurrentStatus() = " + observer2.getCurrentStatus());
	}
}
