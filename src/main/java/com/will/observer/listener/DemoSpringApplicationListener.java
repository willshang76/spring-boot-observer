package com.will.observer.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Define custom listener
 * Implement ApplicationListener interface
 *    What event type is listened by this listener. ApplicationEvent means all events.
 */
public class DemoSpringApplicationListener
		implements ApplicationListener<ApplicationEvent> {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("DemoSpringApplicationListener Listener is triggered by event: " + event);
	}
}
