package com.example.workflow.service;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class EngineService {

    public ProcessEngine getProcessEngine() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        return processEngine;
    }

}
