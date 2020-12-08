package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//所有注册中心通用
@SpringBootApplication
public class NacosProviderMovie6600Application {

	public static void main(String[] args) {
		SpringApplication.run(NacosProviderMovie6600Application.class, args);
	}

}
