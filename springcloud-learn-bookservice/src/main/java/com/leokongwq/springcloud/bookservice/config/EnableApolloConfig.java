package com.leokongwq.springcloud.bookservice.config;

import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(ApolloConfigRegistrar.class)
public @interface EnableApolloConfig {
  /**
   * Apollo namespaces to inject configuration into Spring Property Sources.
   */
  String[] value() default {"/java"};

  /**
   * The order of the apollo config, default is {@link Ordered#LOWEST_PRECEDENCE}, which is Integer.MAX_VALUE.
   * If there are properties with the same name in different apollo configs, the apollo config with smaller order wins.
   */
  int order() default Ordered.LOWEST_PRECEDENCE;
}