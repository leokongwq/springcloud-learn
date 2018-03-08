package com.leokongwq.springcloud.bookservice.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author kongwenqiang
 */
@Component
public class UranusConfigRegistrar implements ImportBeanDefinitionRegistrar {

  @Override
  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
      System.out.println(registry.getClass());
      System.out.println(importingClassMetadata.getClassName());

      Map<String, Object> attributesMap = importingClassMetadata.getAnnotationAttributes(EnableRedisCache.class.getCanonicalName());

      for (Map.Entry<String, Object> entry : attributesMap.entrySet()) {
          System.out.println(entry.getKey() + "=" + entry.getValue().toString());
      }
  }
}