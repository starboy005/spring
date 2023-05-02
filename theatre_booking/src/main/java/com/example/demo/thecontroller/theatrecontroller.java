package com.example.demo.thecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.theservice.theatreservice;
import com.example.demo.entity.theatrebooking;

@RestController
public class theatrecontroller {

	@Autowired
	private theatreservice th ;
	
	@GetMapping("/getDetails")
	public List<theatrebooking> getData(){
		return th.getData() ;
	}
	
	@PostMapping("/createDetails")
	public void createData(@RequestBody theatrebooking t)
	{
		th.createData(t) ;
	}
	
	@PutMapping("/updateDetails")
	public void updateData(@RequestBody theatrebooking t) 
	{
		
		th.updateData(t) ;
	}
	
	@DeleteMapping("/deleteDetails")
	public void deleteData(@RequestParam String movie_name)
	{
		th.deleteData(movie_name) ;
	}
	
	
	@GetMapping("/sortAsc/{movieName}")
	public List<theatrebooking> sortAscend(@PathVariable("movieName") String vehicleName)
	{
		return th.sortAsc(vehicleName);
	}
	@GetMapping("/sortDesc/{vehicleName}")
	public List<theatrebooking> sortDesc(@PathVariable("movieName") String vehicleName)
	{
		return th.sortDesc(vehicleName);
	}
	
	@GetMapping("/pagination/{pageNo}/{pageSize}")
	public List<theatrebooking> paginationData(@PathVariable("pageNo")int pnu,@PathVariable("pageSize") int psize)
	{
		return th.paginationData(pnu,psize);
	}
	
	@GetMapping("/pagiantionAndSorting/{pageNo}/{pageSize}/{vehicleName}")
	public List<theatrebooking> paginationAndSorting(@PathVariable("pageNo") int pnu,@PathVariable("pageSize") int psize,@PathVariable("vehicleName") String vehicleName)
	{
		return th.paginationAndSorting(pnu, psize, vehicleName);
	}
	
	
}

