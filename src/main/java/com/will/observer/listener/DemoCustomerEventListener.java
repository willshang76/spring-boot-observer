package com.will.observer.listener;

import com.will.observer.event.DemoCustomEvent;
import org.springframework.context.ApplicationListener;

public class DemoCustomerEventListener implements ApplicationListener<DemoCustomEvent> {
	@Override
	public void onApplicationEvent(DemoCustomEvent event) {
		System.out.println("DemoCustomerEventListener Listener is triggered by event: " + event);
	}
}
