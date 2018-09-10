package org.cody.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ WebConfig.class })
public class ApplicationContext {
}
