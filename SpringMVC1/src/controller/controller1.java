package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class controller1 {

	@RequestMapping("/hello/{member}")
	public String doHello(@PathVariable("member") String MemberName, Model model) {
		
		model.addAttribute("member", MemberName);
		
		return "helloview";
	}
}
