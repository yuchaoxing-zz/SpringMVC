07 视图解析器【解析视图逻辑名对应的真实路径】【配置可省】InternalResourceViewResolver

ModelAndView对象中即可以封装真实视图路径名，也可以封装视图路径的逻辑名，springmvc.xml
代码如下：
    <!-- 视图解析器(框架) -->  
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    	<property name="prefix" value="/jsp/"/>
    	<property name="suffix" value=".jsp"/>
    </bean>
Action类代码如下：
modelAndView.setViewName("success");