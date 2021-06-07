package cn.ttpai.mqlistener.starter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 让所有mq server生效
 *
 * @author jiayuan.su
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({
        MqListenerPropertyConfig.class,
        MqListenerBaseConfig.class,
        MqListenerAppServerConfig.class,
        MqListenerSoaServerConfig.class
})

public @interface EnableMqAllServer {
}
