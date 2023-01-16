package com.example.workflow.service;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeployService {

    @Autowired
    private EngineService engineService;

    private void createDeployment() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment()
                .addClasspathResource("BPMN/VacationRequest.bpmn20.xml")
                .deploy();
//        logger.info("Number of process definitions: " + repositoryService.createProcessDefinitionQuery().count());
    }

    public void testLog() {
//        logger.info("111");
    }

    public static void main(String[] args) {
        DeployService deployService = new DeployService();
        deployService.createDeployment();

    }
}
