package com.shollyb.goodreads.events;

import org.springframework.context.ApplicationEvent;

public class SendMessageEvent extends ApplicationEvent {
    public SendMessageEvent(Object source) {
        super(source);
    }
}
