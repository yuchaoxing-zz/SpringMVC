08 映射器Mapping【什么样的请求交给Action】【配置可省】BeanNameUrlHandlerMapping

1）org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping(核心)
将程序员定义的Action所对应的<bean>标签的name属性作为请求路径
      <!-- 注册控制器(程序员) -->
      <bean name="/add.action" class="cn.itcast.javaee.springmvc.mapping.UserAction"></bean>

      <!-- 注册映射器(handler包)(框架) -->
	  <bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"></bean>

2）org.springframework.web.servlet.handler.SimpleUrlHandlerMapping
/delete.action和/update.action和/find.action请求路径都交由<bean>标签为id的Action，即
多个路径对应同一个Action 
      <!-- 注册控制器(程序员) -->
	  <bean id="userActionID" class="cn.itcast.javaee.springmvc.mapping.UserAction"></bean>
		
	  <!-- 注册映射器(handler包)(框架) -->
	  <bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
	  		<property name="mappings">
	  			<props>
	  				<prop key="/delete.action">userActionID</prop>
	  				<prop key="/update.action">userActionID</prop>
	  				<prop key="/find.action">userActionID</prop>
	  			</props>
	  		</property>
	  </bean>