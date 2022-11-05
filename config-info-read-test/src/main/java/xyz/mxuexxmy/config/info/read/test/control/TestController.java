package xyz.mxuexxmy.config.info.read.test.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.mxuexxmy.config.info.read.test.config.ItemInfoConfig;
import xyz.mxuexxmy.config.info.read.test.config.ItemInfoConfigOne;

/**
 * 测试类
 *
 * @author <a href="mailto:mxuexxmy@gmail.com">mxuexxmy</a>
 */
@RequestMapping("/config")
@RestController
public class TestController {

    @Autowired
    private ItemInfoConfig itemInfoConfig;

    @GetMapping("/1")
    public String getConfigurationInfo() {
        return itemInfoConfig.deploymentLocation;
    }

    @GetMapping("/2")
    public String getConfigurationInfoOne() {
        return ItemInfoConfigOne.deploymentLocationOne;
    }


}
