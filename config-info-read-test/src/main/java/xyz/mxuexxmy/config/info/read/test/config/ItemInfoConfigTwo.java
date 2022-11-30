package xyz.mxuexxmy.config.info.read.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 配置信息类 -方式三 - 如果配置信息不存在，默认一个配置信息
 *
 * @author <a href="mailto:mxuexxmy@gmail.com">mxuexxmy</a>
 */
@Configuration
public class ItemInfoConfigTwo {

    public static String deploymentLocationTwo;

    @Value("${deployment-location:test}")
    public void setDeploymentLocationOne(String deploymentLocationTwo) {
        ItemInfoConfigTwo.deploymentLocationTwo = deploymentLocationTwo;
    }

}
