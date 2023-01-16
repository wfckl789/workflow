package com.example.workflow.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ApiModel(description = "工作流表单")
public class CustomFormVo {

    @NotBlank(message = "任务节点名不能为空！")
    @ApiModelProperty(value = "任务节点名")
    private String taskName;
}
