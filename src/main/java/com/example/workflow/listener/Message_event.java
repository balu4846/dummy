package com.example.workflow.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Message_event implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
	     // Get variable sent from Postman
        String messageEvent = (String) execution.getVariable("mssg_sent");

        System.out.println("Received variable: " + messageEvent);

        // You can update variable
        execution.setVariable("status", "processing");
		
	}
	
	

}
