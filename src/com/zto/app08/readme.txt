08 ӳ����Mapping��ʲô�������󽻸�Action�������ÿ�ʡ��BeanNameUrlHandlerMapping

1��org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping(����)
������Ա�����Action����Ӧ��<bean>��ǩ��name������Ϊ����·��
      <!-- ע�������(����Ա) -->
      <bean name="/add.action" class="cn.itcast.javaee.springmvc.mapping.UserAction"></bean>

      <!-- ע��ӳ����(handler��)(���) -->
	  <bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"></bean>

2��org.springframework.web.servlet.handler.SimpleUrlHandlerMapping
/delete.action��/update.action��/find.action����·��������<bean>��ǩΪid��Action����
���·����Ӧͬһ��Action 
      <!-- ע�������(����Ա) -->
	  <bean id="userActionID" class="cn.itcast.javaee.springmvc.mapping.UserAction"></bean>
		
	  <!-- ע��ӳ����(handler��)(���) -->
	  <bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
	  		<property name="mappings">
	  			<props>
	  				<prop key="/delete.action">userActionID</prop>
	  				<prop key="/update.action">userActionID</prop>
	  				<prop key="/find.action">userActionID</prop>
	  			</props>
	  		</property>
	  </bean>