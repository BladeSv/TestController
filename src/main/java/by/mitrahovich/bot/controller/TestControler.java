package by.mitrahovich.bot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

	@RequestMapping("/")
	public String home() {

		String str = "Hello";
		return str;

	}
}
