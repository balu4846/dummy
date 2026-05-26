package com.example.workflow;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServies implements JavaDelegate {

	private int leave = 5;

	public org.slf4j.Logger lg = LoggerFactory.getLogger(this.getClass());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		if (leave > 0) {
			lg.info("holidya are approved");
		} else {
			lg.error("not approved");

		}

	}
}
