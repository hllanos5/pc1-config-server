package com.configserver.ms_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnabledConfigServer
public class MsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConfigServerApplication.class, args);
	}

}
