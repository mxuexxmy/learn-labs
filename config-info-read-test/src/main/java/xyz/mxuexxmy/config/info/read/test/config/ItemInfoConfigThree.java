package xyz.mxuexxmy.config.info.read.test.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置信息类 -方式四- 如果配置信息不存在，默认一个配置信息
 *
 * @author <a href="mailto:mxuexxmy@gmail.com">mxuexxmy</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties("custom")
public class ItemInfoConfigThree {

    private String location;

    public String getLocation() {
        return this.location;
    }


}
