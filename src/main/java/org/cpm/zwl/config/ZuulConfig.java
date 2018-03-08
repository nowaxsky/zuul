package org.cpm.zwl.config;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {

  public PatternServiceRouteMapper serviceRouteMapper() {
    return new PatternServiceRouteMapper("/(?<project>^.+)-(?<subProject>.+$)",
        "/${project}-${subProject}");
  }
}
