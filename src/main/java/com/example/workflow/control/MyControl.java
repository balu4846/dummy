package com.example.workflow.control;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControl {
	
	@GetMapping("/value")
	public String myExcute() {
		ProcessEngine ps = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder pb = ps.getRuntimeService()
				.createProcessInstanceByKey("Process_1aowrt8");
		pb.executeWithVariablesInReturn();
		
		System.out.println("hllo word king");
		return "My KIng is Lord";
	}
	
}
