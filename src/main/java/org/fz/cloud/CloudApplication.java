package org.fz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
*-------------------------------------------------
* @类名称 : CloudApplication
* @说明 : TODO
* @作者 : fengzijk
* @email: guozhifengvip@163.com
* @时间 : 2017/9/18 12:09
* @修改 : who   when    what
*--------------------------------------------------
*/
@EnableEurekaServer
@SpringBootApplication
public class CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);

	}
}
