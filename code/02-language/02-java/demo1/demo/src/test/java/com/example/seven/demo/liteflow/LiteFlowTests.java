package com.example.seven.demo.liteflow;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.seven.app.DemoApplication;
import com.example.seven.demo.liteflow.executor.MyFlowExecutor;

@SpringBootTest(classes = DemoApplication.class)
class LiteFlowTests {

	@Autowired
	MyFlowExecutor myFlowExecutor;

	@Test
	void MyFlowExecutorTest() {
		myFlowExecutor.execute();
	}

}
