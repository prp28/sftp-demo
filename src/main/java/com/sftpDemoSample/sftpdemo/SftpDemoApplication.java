package com.sftpDemoSample.sftpdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SftpDemoApplication {


	static ConfigurableApplicationContext context;
	
	public static void main(String[] args) {
		
		 context = new ClassPathXmlApplicationContext(
				"/xml-config/SftpInboundReceiveSample-context.xml", SftpDemoApplication.class);
		 
		
		SpringApplication.run(SftpDemoApplication.class, args);
	}
	
	
	/*@Scheduled(fixedRate = 100000)
	public void scheduleFixedRateTask() {
		PropertiesPersistingMetadataStore persistingMetadataStore= (PropertiesPersistingMetadataStore) context.getBean("metadataStore");
		persistingMetadataStore.flush();
		System.out.println("In here scheduleFixedRateTask");
	}*/
}
