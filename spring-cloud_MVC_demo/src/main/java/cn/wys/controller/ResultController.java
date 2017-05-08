package cn.wys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	@RequestMapping("/result/{previousPage}/{status}")
	public String showResultPage(Model model, @PathVariable String previousPage, @PathVariable String status){
		model.addAttribute("previousPage",previousPage);
		model.addAttribute("status",status);
		return "result";
	}
}
