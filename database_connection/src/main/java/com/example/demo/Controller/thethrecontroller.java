package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Theatreser;
import com.example.demo.entity.theatre;

@RestController
public class thethrecontroller {

	@Autowired
	private Theatreser th ;
	
	@GetMapping("/getDetails")
	public List<theatre> getData(){
		return th.getData() ;
	}
	
	@PostMapping("/createDetails")
	public void createData(@RequestBody theatre t)
	{
		th.createData(t) ;
	}
	
	@PutMapping("/updateDetails")
	public void updateData(@RequestBody theatre t , @RequestParam String movie_name) 
	{
		t.setMovieName(movie_name) ;
		th.updateData(t) ;
	}
	
	@DeleteMapping("/deleteDetails")
	public void deleteData(@RequestParam String movie_name)
	{
		th.deleteData(movie_name) ;
	}
	
	
}


