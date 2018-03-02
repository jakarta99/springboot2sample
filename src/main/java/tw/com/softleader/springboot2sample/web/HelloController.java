package tw.com.softleader.springboot2sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/")
	public String index() {
		return "Home";
	}

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "Hello SpringBoot 2.0";
	}
}
