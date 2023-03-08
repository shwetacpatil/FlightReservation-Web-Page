package com.Flight_reservation.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_reservation.entity.User;
import com.Flight_reservation.repository.UserRepository;

@Controller
public class User_Controller {
	@Autowired 
	private UserRepository userRepo;
	
	@RequestMapping("/showReg")
	public String ShowReg() {
		return "login/showReg";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") User user) {
		userRepo.save(user);
		return "login/login";
	}
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}
	
	@RequestMapping("/varifyLogin")
	public String varifyLogin(@RequestParam("emailId") String emailId, @RequestParam("password") String password, Model model) {
		User user=userRepo.findByEmail(emailId);
		if(user!= null) {
		if(user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
			return "findFlights";
		}else {
			model.addAttribute("error", "invalid username and password");
			return "login/login";
			
		}
		}else {
			model.addAttribute("error", "invalid username and password");
			return "login/login";
		}
		
	}
	

}















