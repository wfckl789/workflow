package com.example.workflow.service;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InstanceService {
    @Autowired
    private EngineService engineService;

    @Autowired
    private DeployService deployService;

    private HashMap<String, Object> mockData(String employeeName, int numberOfDays, String vacationMotivation) {
        HashMap<String, Object> variables = new HashMap<String, Object>();
        variables.put("employeeName", employeeName);
        variables.put("numberOfDays", numberOfDays);
        variables.put("vacationMotivation", vacationMotivation);
        return variables;
    }

    private void startProcessInstance() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        HashMap variables = mockData("qwb", 5, "I'm Chambers");
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("vacationRequest", variables);
    }

    public static void main(String[] args) {
        InstanceService instanceService = new InstanceService();
        instanceService.startProcessInstance();
    }
}
