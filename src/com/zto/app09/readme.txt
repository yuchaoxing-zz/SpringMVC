09 ������Adapter��Actionʵ��ʲô�ӿڡ������ÿ�ʡ��SimpleControllerHandlerAdapter

1��Actionʵ��Controller�ӿ�
org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter
public class EmpAction implements Controller{
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("EmpAction::handleRequest");
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message",username);
		modelAndView.setViewName("/jsp/success.jsp");
		return modelAndView;
	}
}