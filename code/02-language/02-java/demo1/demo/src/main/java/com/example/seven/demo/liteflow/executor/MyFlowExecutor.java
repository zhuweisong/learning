package com.example.seven.demo.liteflow.executor;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.yomahub.liteflow.core.FlowExecutor;

@Component
public class MyFlowExecutor {

    @Resource
    private FlowExecutor flowExecutor;

    public void execute() {
        flowExecutor.execute2Resp("chain1", "a");
    }

}
