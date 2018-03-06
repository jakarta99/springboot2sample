package tw.com.softleader.springboot2sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "/WEB-INF/pages/index.jsp";
	}

}
