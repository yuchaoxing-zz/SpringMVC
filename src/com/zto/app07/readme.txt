07 ��ͼ��������������ͼ�߼�����Ӧ����ʵ·���������ÿ�ʡ��InternalResourceViewResolver

ModelAndView�����м����Է�װ��ʵ��ͼ·������Ҳ���Է�װ��ͼ·�����߼�����springmvc.xml
�������£�
    <!-- ��ͼ������(���) -->  
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    	<property name="prefix" value="/jsp/"/>
    	<property name="suffix" value=".jsp"/>
    </bean>
Action��������£�
modelAndView.setViewName("success");