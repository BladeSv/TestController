package by.mitrahovich.bot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

	@RequestMapping("/")
	public String home() {

		String str2 = System.getenv("mytoken");
		String str = "Hello";
		String str3 = str + " " + str2;
		return str3;

	}
}
