package com.will.observer.event;

import org.springframework.context.ApplicationEvent;


public class DemoCustomEvent extends ApplicationEvent {

	 // Source the object on which the event initially occurred or with which the event is associated
	public DemoCustomEvent(Object source) {
		super(source);
	}
}
