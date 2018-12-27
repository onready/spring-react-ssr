package com.onready.springreactssr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.script.ScriptTemplateConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {
    viewResolverRegistry.scriptTemplate().prefix("/templates/").suffix(".html");
  }

  @Bean
  public ScriptTemplateConfigurer scriptTemplateConfigurer() {
    ScriptTemplateConfigurer scriptTemplateConfigurer = new ScriptTemplateConfigurer("nashorn");
    scriptTemplateConfigurer.setScripts("/js/polyfill.js", "/js/built/bundle-server.js");
    scriptTemplateConfigurer.setRenderFunction("render");
    scriptTemplateConfigurer.setSharedEngine(false);
    return scriptTemplateConfigurer;
  }

}
