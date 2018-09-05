package com.cyyz.cy_system;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@MapperScan("com.cyyz.cy_system")
@SpringBootApplication
public class CySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CySystemApplication.class, args);
//		ProcessEngineConfiguration cfg = ProcessEngineConfiguration
//				.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
//		ProcessEngine processEngine = cfg.buildProcessEngine();

	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(CySystemApplication.class);
//	}
}
