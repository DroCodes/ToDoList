/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Mar 31, 2024
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.time.LocalDate;

import dmacc.beans.Todo;
import dmacc.repository.TodoRepository;

/**
 * 
 */
@Controller
public class WebController {
	@Autowired
	private TodoRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllTodo(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewTodo(model);
		}
		
		model.addAttribute("todos", repo.findAll());
		
		return "results";
	}
	
	@GetMapping("/addNew")
	public String addNewTodo(Model model) {
		Todo todo = new Todo();
		model.addAttribute("newTodo", todo);

		return "addNewTodo";
	}
	
	@PostMapping("/addNew")
	public String addNewTodo(@ModelAttribute Todo todo, Model model) {
		repo.save(todo);
		return viewAllTodo(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdatedTodo(@PathVariable("id") int id, Model model) {
		Todo todo = repo.findById(id).orElse(null);
		model.addAttribute("newTodo", todo);
		return "addNewTodo";
	}

	@PostMapping("/update/{id}")
	public String updateTodo(Todo todo, Model model) {
		repo.save(todo);
		return viewAllTodo(model);
	}

	@GetMapping("/delete/{id}")
	public String deleteTodo(@PathVariable("id") int id, Model model) {
		Todo todo = repo.findById(id).orElse(null);
		repo.delete(todo);
		return viewAllTodo(model);
	}

}
