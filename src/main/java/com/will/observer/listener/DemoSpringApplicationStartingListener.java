package com.will.observer.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

import java.util.LinkedList;

public class DemoSpringApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {
	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("DemoSpringApplicationStartingListener--------->" + event);
	}
}
