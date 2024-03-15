package com.example.seven.demo.liteflow.cmp;

import org.springframework.stereotype.Component;

import com.yomahub.liteflow.core.NodeComponent;

@Component("c")
public class CCmp extends NodeComponent {

	@Override
	public void process() {
		System.out.println("CCmp");
	}
}