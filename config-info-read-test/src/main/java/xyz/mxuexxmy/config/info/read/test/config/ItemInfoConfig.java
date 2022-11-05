package xyz.mxuexxmy.config.info.read.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  配置信息类 -方式一
 *
 * @author <a href="mailto:mxuexxmy@gmail.com">mxuexxmy</a>
 */
@Configuration
public class ItemInfoConfig {

    @Value("${deployment-location}")
    public String deploymentLocation;

    @Bean
    public String getDeploymentLocation() {
        System.out.println("部署地址：" + this.deploymentLocation);
        return this.deploymentLocation;
    }

}
