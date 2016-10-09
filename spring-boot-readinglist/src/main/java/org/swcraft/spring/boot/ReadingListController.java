package org.swcraft.spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReadingListController {

	@Autowired
	private ReadingListRepository repository;

	@RequestMapping("/all")
	@ResponseBody
	public List<Book> read() {
		return repository.findAll();
	}

	@RequestMapping("/reading")
	public String greeting(Model model) {
		List<Book> books = repository.findAll();
		model.addAttribute("books", books);
		return "reading";
	}

}
