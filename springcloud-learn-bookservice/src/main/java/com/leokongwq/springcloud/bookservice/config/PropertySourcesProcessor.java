package com.leokongwq.springcloud.bookservice.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class PropertySourcesProcessor implements BeanFactoryPostProcessor {

  private static final AtomicBoolean PROPERTY_SOURCES_INITIALIZED = new AtomicBoolean(false);

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    if (!PROPERTY_SOURCES_INITIALIZED.compareAndSet(false, true)) {
      //already initialized
      return;
    }

    //initialize and inject Apollo config to Spring Property Sources
    initializePropertySources();
  }

  private void initializePropertySources() {

  }

}