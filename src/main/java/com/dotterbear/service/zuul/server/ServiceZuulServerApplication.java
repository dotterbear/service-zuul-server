package com.dotterbear.service.zuul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ServiceZuulServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServiceZuulServerApplication.class, args);
  }

//  @Bean
//  public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet() {
//    HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//    ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean =
//        new ServletRegistrationBean<>(streamServlet);
//    registrationBean.setLoadOnStartup(1);
//    registrationBean.addUrlMappings("/hystrix.stream");
//    registrationBean.setName("HystrixMetricsStreamServlet");
//    return registrationBean;
//  }
}
