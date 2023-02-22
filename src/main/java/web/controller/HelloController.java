package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I am the only one like this:");
		messages.add("    db/new ->    C");
		messages.add("    db/users ->  R");
		messages.add("    db/{id} ->   R");
		messages.add("    db/update -> U");
		messages.add("    db/ ->       D");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}