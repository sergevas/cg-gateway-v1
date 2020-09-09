package dev.sergevas.cg.gateway;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableIntegration
@IntegrationComponentScan
public class CgGateway {
    private static final Logger LOG = LoggerFactory.getLogger("dev.sergevas.cg.gateway");

    public static void main(String[] args) {
        LOG.info("Init {} with args[{}]", CgGateway.class, args);
        SpringApplication.run(CgGateway.class, args);
    }
}
