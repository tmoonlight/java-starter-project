package com.cyyz.cy_system.configuration;

import com.cyyz.cy_system.domain.model.ExtraConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: SHZ
 * @Description:
 * @Date: Created in 2018-09-04 14:28
 */
@Configuration
public class ExtraConfiguration {
    @Bean
    public ExtraConfig GetExtra()
    {
        ExtraConfig extraConfig = new ExtraConfig();
        extraConfig.setVar1("1");
        extraConfig.setVar1("2");
        extraConfig.setVar1("3");
        extraConfig.setVar1("4");
        return extraConfig;
    }


}
