package com.service.greeting.delegate;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true)
public class GreetingServiceDelegate implements IServiceDelegate {
    public String getGreeting() { 
        return "hello";
    }
}
