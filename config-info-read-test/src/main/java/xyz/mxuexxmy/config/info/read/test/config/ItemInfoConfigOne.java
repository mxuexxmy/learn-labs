package xyz.mxuexxmy.config.info.read.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 配置信息类 -方式二
 *
 * @author <a href="mailto:mxuexxmy@gmail.com">mxuexxmy</a>
 */
@Configuration
public class ItemInfoConfigOne {

    public static String deploymentLocationOne;

    @Value("${deployment-location}")
    public void setDeploymentLocationOne(String deploymentLocationOne) {
        ItemInfoConfigOne.deploymentLocationOne = deploymentLocationOne;
    }

}
