package com.micro.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author saikr
 *
 *http://localhost:8888/limits-service/default
 *http://localhost:8888/limits-service/dev
 */
@EnableConfigServer
@SpringBootApplication
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}

}
