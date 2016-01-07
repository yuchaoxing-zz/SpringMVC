09 适配器Adapter【Action实现什么接口】【配置可省】SimpleControllerHandlerAdapter

1）Action实现Controller接口
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