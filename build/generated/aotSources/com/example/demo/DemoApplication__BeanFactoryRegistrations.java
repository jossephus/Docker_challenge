package com.example.demo;

import org.springframework.aop.framework.autoproxy.InfrastructureAdvisorAutoProxyCreator__BeanDefinitions;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages__BeanDefinitions;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.context.LifecycleProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.ssl.SslProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.ServerProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.WebProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.client.RestClientAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.MultipartProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration__BeanDefinitions;
import org.springframework.boot.context.properties.BoundConfigurationProperties__BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder__BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor__BeanDefinitions;
import org.springframework.boot.jackson.JsonMixinModuleEntries__BeanDefinitions;
import org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer__BeanDefinitions;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter__BeanDefinitions;
import org.springframework.boot.web.server.ErrorPageRegistrarBeanPostProcessor__BeanDefinitions;
import org.springframework.boot.web.server.WebServerFactoryCustomizerBeanPostProcessor__BeanDefinitions;
import org.springframework.context.event.DefaultEventListenerFactory__BeanDefinitions;
import org.springframework.context.event.EventListenerMethodProcessor__BeanDefinitions;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport__BeanDefinitions;

/**
 * Register bean definitions for the bean factory.
 */
@Generated
public class DemoApplication__BeanFactoryRegistrations {
  /**
   * Register the bean definitions.
   */
  public void registerBeanDefinitions(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerProcessor", EventListenerMethodProcessor__BeanDefinitions.getInternalEventListenerProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerFactory", DefaultEventListenerFactory__BeanDefinitions.getInternalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("demoApplication", DemoApplication__BeanDefinitions.getDemoApplicationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.AutoConfigurationPackages", AutoConfigurationPackages__BeanDefinitions.BasePackages.getAutoConfigurationPackagesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration", PropertyPlaceholderAutoConfiguration__BeanDefinitions.getPropertyPlaceholderAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("propertySourcesPlaceholderConfigurer", PropertyPlaceholderAutoConfiguration__BeanDefinitions.getPropertySourcesPlaceholderConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration", SslAutoConfiguration__BeanDefinitions.getSslAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("fileWatcher", SslAutoConfiguration__BeanDefinitions.getFileWatcherBeanDefinition());
    beanFactory.registerBeanDefinition("sslPropertiesSslBundleRegistrar", SslAutoConfiguration__BeanDefinitions.getSslPropertiesSslBundleRegistrarBeanDefinition());
    beanFactory.registerBeanDefinition("sslBundleRegistry", SslAutoConfiguration__BeanDefinitions.getSslBundleRegistryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor__BeanDefinitions.getConfigurationPropertiesBindingPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder__BeanDefinitions.ConfigurationPropertiesBinderFactory.getInternalConfigurationPropertiesBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties__BeanDefinitions.getBoundConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter__BeanDefinitions.getMethodValidationExcludeFilterBeanDefinition());
    beanFactory.registerBeanDefinition("spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties", SslProperties__BeanDefinitions.getSslPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration", WebSocketServletAutoConfiguration__BeanDefinitions.TomcatWebSocketConfiguration.getTomcatWebSocketConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("websocketServletWebServerCustomizer", WebSocketServletAutoConfiguration__BeanDefinitions.TomcatWebSocketConfiguration.getWebsocketServletWebServerCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration", WebSocketServletAutoConfiguration__BeanDefinitions.getWebSocketServletAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat", ServletWebServerFactoryConfiguration__BeanDefinitions.EmbeddedTomcat.getEmbeddedTomcatBeanDefinition());
    beanFactory.registerBeanDefinition("tomcatServletWebServerFactory", ServletWebServerFactoryConfiguration__BeanDefinitions.EmbeddedTomcat.getTomcatServletWebServerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration", ServletWebServerFactoryAutoConfiguration__BeanDefinitions.getServletWebServerFactoryAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("servletWebServerFactoryCustomizer", ServletWebServerFactoryAutoConfiguration__BeanDefinitions.getServletWebServerFactoryCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("tomcatServletWebServerFactoryCustomizer", ServletWebServerFactoryAutoConfiguration__BeanDefinitions.getTomcatServletWebServerFactoryCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("server-org.springframework.boot.autoconfigure.web.ServerProperties", ServerProperties__BeanDefinitions.getServerPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("webServerFactoryCustomizerBeanPostProcessor", WebServerFactoryCustomizerBeanPostProcessor__BeanDefinitions.getWebServerFactoryCustomizerBeanPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("errorPageRegistrarBeanPostProcessor", ErrorPageRegistrarBeanPostProcessor__BeanDefinitions.getErrorPageRegistrarBeanPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration", DispatcherServletAutoConfiguration__BeanDefinitions.DispatcherServletConfiguration.getDispatcherServletConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("dispatcherServlet", DispatcherServletAutoConfiguration__BeanDefinitions.DispatcherServletConfiguration.getDispatcherServletBeanDefinition());
    beanFactory.registerBeanDefinition("spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties", WebMvcProperties__BeanDefinitions.getWebMvcPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration", DispatcherServletAutoConfiguration__BeanDefinitions.DispatcherServletRegistrationConfiguration.getDispatcherServletRegistrationConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("dispatcherServletRegistration", DispatcherServletAutoConfiguration__BeanDefinitions.DispatcherServletRegistrationConfiguration.getDispatcherServletRegistrationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration", DispatcherServletAutoConfiguration__BeanDefinitions.getDispatcherServletAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$ThreadPoolTaskExecutorBuilderConfiguration", TaskExecutorConfigurations__BeanDefinitions.ThreadPoolTaskExecutorBuilderConfiguration.getThreadPoolTaskExecutorBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("threadPoolTaskExecutorBuilder", TaskExecutorConfigurations__BeanDefinitions.ThreadPoolTaskExecutorBuilderConfiguration.getThreadPoolTaskExecutorBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$TaskExecutorBuilderConfiguration", TaskExecutorConfigurations__BeanDefinitions.TaskExecutorBuilderConfiguration.getTaskExecutorBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("taskExecutorBuilder", TaskExecutorConfigurations__BeanDefinitions.TaskExecutorBuilderConfiguration.getTaskExecutorBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$SimpleAsyncTaskExecutorBuilderConfiguration", TaskExecutorConfigurations__BeanDefinitions.SimpleAsyncTaskExecutorBuilderConfiguration.getSimpleAsyncTaskExecutorBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("simpleAsyncTaskExecutorBuilder", TaskExecutorConfigurations__BeanDefinitions.SimpleAsyncTaskExecutorBuilderConfiguration.getSimpleAsyncTaskExecutorBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$TaskExecutorConfiguration", TaskExecutorConfigurations__BeanDefinitions.TaskExecutorConfiguration.getTaskExecutorConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("applicationTaskExecutor", TaskExecutorConfigurations__BeanDefinitions.TaskExecutorConfiguration.getApplicationTaskExecutorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration", TaskExecutionAutoConfiguration__BeanDefinitions.getTaskExecutionAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties", TaskExecutionProperties__BeanDefinitions.getTaskExecutionPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration", ErrorMvcAutoConfiguration__BeanDefinitions.WhitelabelErrorViewConfiguration.getWhitelabelErrorViewConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("error", ErrorMvcAutoConfiguration__BeanDefinitions.WhitelabelErrorViewConfiguration.getErrorBeanDefinition());
    beanFactory.registerBeanDefinition("beanNameViewResolver", ErrorMvcAutoConfiguration__BeanDefinitions.WhitelabelErrorViewConfiguration.getBeanNameViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration", ErrorMvcAutoConfiguration__BeanDefinitions.DefaultErrorViewResolverConfiguration.getDefaultErrorViewResolverConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("conventionErrorViewResolver", ErrorMvcAutoConfiguration__BeanDefinitions.DefaultErrorViewResolverConfiguration.getConventionErrorViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("spring.web-org.springframework.boot.autoconfigure.web.WebProperties", WebProperties__BeanDefinitions.getWebPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration", ErrorMvcAutoConfiguration__BeanDefinitions.getErrorMvcAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("errorAttributes", ErrorMvcAutoConfiguration__BeanDefinitions.getErrorAttributesBeanDefinition());
    beanFactory.registerBeanDefinition("basicErrorController", ErrorMvcAutoConfiguration__BeanDefinitions.getBasicErrorControllerBeanDefinition());
    beanFactory.registerBeanDefinition("errorPageCustomizer", ErrorMvcAutoConfiguration__BeanDefinitions.getErrorPageCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("preserveErrorControllerTargetClassPostProcessor", ErrorMvcAutoConfiguration__BeanDefinitions.getPreserveErrorControllerTargetClassPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getEnableWebMvcConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("welcomePageHandlerMapping", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getWelcomePageHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("welcomePageNotAcceptableHandlerMapping", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getWelcomePageNotAcceptableHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("localeResolver", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getLocaleResolverBeanDefinition());
    beanFactory.registerBeanDefinition("themeResolver", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getThemeResolverBeanDefinition());
    beanFactory.registerBeanDefinition("flashMapManager", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getFlashMapManagerBeanDefinition());
    beanFactory.registerBeanDefinition("mvcConversionService", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getMvcConversionServiceBeanDefinition());
    beanFactory.registerBeanDefinition("mvcValidator", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getMvcValidatorBeanDefinition());
    beanFactory.registerBeanDefinition("mvcContentNegotiationManager", WebMvcAutoConfiguration__BeanDefinitions.EnableWebMvcConfiguration.getMvcContentNegotiationManagerBeanDefinition());
    beanFactory.registerBeanDefinition("requestMappingHandlerMapping", WebMvcConfigurationSupport__BeanDefinitions.getRequestMappingHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("mvcPatternParser", WebMvcConfigurationSupport__BeanDefinitions.getMvcPatternParserBeanDefinition());
    beanFactory.registerBeanDefinition("mvcUrlPathHelper", WebMvcConfigurationSupport__BeanDefinitions.getMvcUrlPathHelperBeanDefinition());
    beanFactory.registerBeanDefinition("mvcPathMatcher", WebMvcConfigurationSupport__BeanDefinitions.getMvcPathMatcherBeanDefinition());
    beanFactory.registerBeanDefinition("viewControllerHandlerMapping", WebMvcConfigurationSupport__BeanDefinitions.getViewControllerHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("beanNameHandlerMapping", WebMvcConfigurationSupport__BeanDefinitions.getBeanNameHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("routerFunctionMapping", WebMvcConfigurationSupport__BeanDefinitions.getRouterFunctionMappingBeanDefinition());
    beanFactory.registerBeanDefinition("resourceHandlerMapping", WebMvcConfigurationSupport__BeanDefinitions.getResourceHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("mvcResourceUrlProvider", WebMvcConfigurationSupport__BeanDefinitions.getMvcResourceUrlProviderBeanDefinition());
    beanFactory.registerBeanDefinition("defaultServletHandlerMapping", WebMvcConfigurationSupport__BeanDefinitions.getDefaultServletHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("requestMappingHandlerAdapter", WebMvcConfigurationSupport__BeanDefinitions.getRequestMappingHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("handlerFunctionAdapter", WebMvcConfigurationSupport__BeanDefinitions.getHandlerFunctionAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("mvcUriComponentsContributor", WebMvcConfigurationSupport__BeanDefinitions.getMvcUriComponentsContributorBeanDefinition());
    beanFactory.registerBeanDefinition("httpRequestHandlerAdapter", WebMvcConfigurationSupport__BeanDefinitions.getHttpRequestHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("simpleControllerHandlerAdapter", WebMvcConfigurationSupport__BeanDefinitions.getSimpleControllerHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("handlerExceptionResolver", WebMvcConfigurationSupport__BeanDefinitions.getHandlerExceptionResolverBeanDefinition());
    beanFactory.registerBeanDefinition("mvcViewResolver", WebMvcConfigurationSupport__BeanDefinitions.getMvcViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("mvcHandlerMappingIntrospector", WebMvcConfigurationSupport__BeanDefinitions.getMvcHandlerMappingIntrospectorBeanDefinition());
    beanFactory.registerBeanDefinition("viewNameTranslator", WebMvcConfigurationSupport__BeanDefinitions.getViewNameTranslatorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter", WebMvcAutoConfiguration__BeanDefinitions.WebMvcAutoConfigurationAdapter.getWebMvcAutoConfigurationAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("defaultViewResolver", WebMvcAutoConfiguration__BeanDefinitions.WebMvcAutoConfigurationAdapter.getDefaultViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("viewResolver", WebMvcAutoConfiguration__BeanDefinitions.WebMvcAutoConfigurationAdapter.getViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("requestContextFilter", WebMvcAutoConfiguration__BeanDefinitions.WebMvcAutoConfigurationAdapter.getRequestContextFilterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration", WebMvcAutoConfiguration__BeanDefinitions.getWebMvcAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("formContentFilter", WebMvcAutoConfiguration__BeanDefinitions.getFormContentFilterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration", AopAutoConfiguration__BeanDefinitions.ClassProxyingConfiguration.getClassProxyingConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("forceAutoProxyCreatorToUseClassProxying", AopAutoConfiguration__BeanDefinitions.ClassProxyingConfiguration.getForceAutoProxyCreatorToUseClassProxyingBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration", AopAutoConfiguration__BeanDefinitions.getAopAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration", ApplicationAvailabilityAutoConfiguration__BeanDefinitions.getApplicationAvailabilityAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("applicationAvailability", ApplicationAvailabilityAutoConfiguration__BeanDefinitions.getApplicationAvailabilityBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration", JacksonAutoConfiguration__BeanDefinitions.Jackson2ObjectMapperBuilderCustomizerConfiguration.getJacksonObjectMapperBuilderCustomizerConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("standardJacksonObjectMapperBuilderCustomizer", JacksonAutoConfiguration__BeanDefinitions.Jackson2ObjectMapperBuilderCustomizerConfiguration.getStandardJacksonObjectMapperBuilderCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties", JacksonProperties__BeanDefinitions.getJacksonPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration", JacksonAutoConfiguration__BeanDefinitions.JacksonObjectMapperBuilderConfiguration.getJacksonObjectMapperBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jacksonObjectMapperBuilder", JacksonAutoConfiguration__BeanDefinitions.JacksonObjectMapperBuilderConfiguration.getJacksonObjectMapperBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration", JacksonAutoConfiguration__BeanDefinitions.ParameterNamesModuleConfiguration.getParameterNamesModuleConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("parameterNamesModule", JacksonAutoConfiguration__BeanDefinitions.ParameterNamesModuleConfiguration.getParameterNamesModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration", JacksonAutoConfiguration__BeanDefinitions.JacksonObjectMapperConfiguration.getJacksonObjectMapperConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jacksonObjectMapper", JacksonAutoConfiguration__BeanDefinitions.JacksonObjectMapperConfiguration.getJacksonObjectMapperBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonMixinConfiguration", JacksonAutoConfiguration__BeanDefinitions.JacksonMixinConfiguration.getJacksonMixinConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jsonMixinModuleEntries", JsonMixinModuleEntries__BeanDefinitions.getJsonMixinModuleEntriesBeanDefinition());
    beanFactory.registerBeanDefinition("jsonMixinModule", JacksonAutoConfiguration__BeanDefinitions.JacksonMixinConfiguration.getJsonMixinModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration", JacksonAutoConfiguration__BeanDefinitions.getJacksonAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jsonComponentModule", JacksonAutoConfiguration__BeanDefinitions.getJsonComponentModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration", ConfigurationPropertiesAutoConfiguration__BeanDefinitions.getConfigurationPropertiesAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration", LifecycleAutoConfiguration__BeanDefinitions.getLifecycleAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("lifecycleProcessor", LifecycleAutoConfiguration__BeanDefinitions.getLifecycleProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties", LifecycleProperties__BeanDefinitions.getLifecyclePropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration", HttpMessageConvertersAutoConfiguration__BeanDefinitions.StringHttpMessageConverterConfiguration.getStringHttpMessageConverterConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("stringHttpMessageConverter", HttpMessageConvertersAutoConfiguration__BeanDefinitions.StringHttpMessageConverterConfiguration.getStringHttpMessageConverterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration", JacksonHttpMessageConvertersConfiguration__BeanDefinitions.MappingJackson2HttpMessageConverterConfiguration.getMappingJacksonHttpMessageConverterConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("mappingJackson2HttpMessageConverter", JacksonHttpMessageConvertersConfiguration__BeanDefinitions.MappingJackson2HttpMessageConverterConfiguration.getMappingJacksonHttpMessageConverterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration", JacksonHttpMessageConvertersConfiguration__BeanDefinitions.getJacksonHttpMessageConvertersConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration", HttpMessageConvertersAutoConfiguration__BeanDefinitions.getHttpMessageConvertersAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("messageConverters", HttpMessageConvertersAutoConfiguration__BeanDefinitions.getMessageConvertersBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration", ProjectInfoAutoConfiguration__BeanDefinitions.getProjectInfoAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties", ProjectInfoProperties__BeanDefinitions.getProjectInfoPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration", SqlInitializationAutoConfiguration__BeanDefinitions.getSqlInitializationAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties", SqlInitializationProperties__BeanDefinitions.getSqlInitializationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor", DatabaseInitializationDependencyConfigurer__BeanDefinitions.DependsOnDatabaseInitializationPostProcessor.getDependsOnDatabaseInitializationPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$ThreadPoolTaskSchedulerBuilderConfiguration", TaskSchedulingConfigurations__BeanDefinitions.ThreadPoolTaskSchedulerBuilderConfiguration.getThreadPoolTaskSchedulerBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("threadPoolTaskSchedulerBuilder", TaskSchedulingConfigurations__BeanDefinitions.ThreadPoolTaskSchedulerBuilderConfiguration.getThreadPoolTaskSchedulerBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$TaskSchedulerBuilderConfiguration", TaskSchedulingConfigurations__BeanDefinitions.TaskSchedulerBuilderConfiguration.getTaskSchedulerBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("taskSchedulerBuilder", TaskSchedulingConfigurations__BeanDefinitions.TaskSchedulerBuilderConfiguration.getTaskSchedulerBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$SimpleAsyncTaskSchedulerBuilderConfiguration", TaskSchedulingConfigurations__BeanDefinitions.SimpleAsyncTaskSchedulerBuilderConfiguration.getSimpleAsyncTaskSchedulerBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("simpleAsyncTaskSchedulerBuilder", TaskSchedulingConfigurations__BeanDefinitions.SimpleAsyncTaskSchedulerBuilderConfiguration.getSimpleAsyncTaskSchedulerBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration", TaskSchedulingAutoConfiguration__BeanDefinitions.getTaskSchedulingAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties", TaskSchedulingProperties__BeanDefinitions.getTaskSchedulingPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.client.RestClientAutoConfiguration", RestClientAutoConfiguration__BeanDefinitions.getRestClientAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("httpMessageConvertersRestClientCustomizer", RestClientAutoConfiguration__BeanDefinitions.getHttpMessageConvertersRestClientCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("restClientSsl", RestClientAutoConfiguration__BeanDefinitions.getRestClientSslBeanDefinition());
    beanFactory.registerBeanDefinition("restClientBuilderConfigurer", RestClientAutoConfiguration__BeanDefinitions.getRestClientBuilderConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("restClientBuilder", RestClientAutoConfiguration__BeanDefinitions.getRestClientBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration", RestTemplateAutoConfiguration__BeanDefinitions.getRestTemplateAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("restTemplateBuilderConfigurer", RestTemplateAutoConfiguration__BeanDefinitions.getRestTemplateBuilderConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("restTemplateBuilder", RestTemplateAutoConfiguration__BeanDefinitions.getRestTemplateBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration", EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions.TomcatWebServerFactoryCustomizerConfiguration.getTomcatWebServerFactoryCustomizerConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("tomcatWebServerFactoryCustomizer", EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions.TomcatWebServerFactoryCustomizerConfiguration.getTomcatWebServerFactoryCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration", EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions.getEmbeddedWebServerFactoryCustomizerAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration", HttpEncodingAutoConfiguration__BeanDefinitions.getHttpEncodingAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("characterEncodingFilter", HttpEncodingAutoConfiguration__BeanDefinitions.getCharacterEncodingFilterBeanDefinition());
    beanFactory.registerBeanDefinition("localeCharsetMappingsCustomizer", HttpEncodingAutoConfiguration__BeanDefinitions.getLocaleCharsetMappingsCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration", MultipartAutoConfiguration__BeanDefinitions.getMultipartAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("multipartConfigElement", MultipartAutoConfiguration__BeanDefinitions.getMultipartConfigElementBeanDefinition());
    beanFactory.registerBeanDefinition("multipartResolver", MultipartAutoConfiguration__BeanDefinitions.getMultipartResolverBeanDefinition());
    beanFactory.registerBeanDefinition("spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties", MultipartProperties__BeanDefinitions.getMultipartPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.aop.config.internalAutoProxyCreator", InfrastructureAdvisorAutoProxyCreator__BeanDefinitions.getInternalAutoProxyCreatorBeanDefinition());
  }

  /**
   * Register the aliases.
   */
  public void registerAliases(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerAlias("applicationTaskExecutor", "taskExecutor");
  }
}
