package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.web.WebConfig;

/**
 * AbstractAnnotationConfigDispatcherServletInitializer
 * Serlet 3.0 中会自动发现并利用它配置Serlvet上下文。
 */
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  // ContextLoaderListener 加载业务逻辑需要的bean
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class };
  }

  // 指定配置类 加载Web组件需要的bean
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

  //将DispatcherServlet映射到"/"
  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}
