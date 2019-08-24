package space.mamba.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import space.mamba.component.handle.camel.SnakeToCamelRequestMappingHandlerAdapter;

/**
 * @author pankui
 * @date 2019/8/23
 * <pre>
 *      register your resolver in this way to be able to inject beans:
 * </pre>
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected RequestMappingHandlerAdapter createRequestMappingHandlerAdapter() {
        return new SnakeToCamelRequestMappingHandlerAdapter();
    }
}
