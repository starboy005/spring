package com.example.demo.theservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.theatrebooking;
import com.example.demo.therepository.theatrerepository;

@Service
public class theatreservice {
	@Autowired 
	private theatrerepository tr ;
	
	public List<theatrebooking> getData()
	{
		return tr.findAll() ;
	}
	
	public void createData(theatrebooking t)
	{
		tr.save(t) ;
	}
	
	public void updateData(theatrebooking t)
	{
		tr.save(t) ;
	}
	
	public void deleteData(String movie_name)
	{
		tr.deleteById(movie_name);
	}
	
	
	
	//sorting
		public List<theatrebooking> sortAsc(String movieName)
		{
			return tr.findAll(Sort.by(movieName).ascending());
		}
		
		public List<theatrebooking> sortDesc(String movieName)
		{
			return tr.findAll(Sort.by(movieName).descending());
		}
		
		//pagination
		public List<theatrebooking> paginationData(int pageNo, int pageSize)
		{
			Page<theatrebooking> p = tr.findAll(PageRequest.of(pageNo, pageSize));
			return p.getContent();
		}
		
		//paginationAndSorting
		public List<theatrebooking> paginationAndSorting(int pageNo,int pageSize,String vehicleName)
		{
			Page<theatrebooking> p = tr.findAll(PageRequest.of(pageNo, pageSize, Sort.by(vehicleName).ascending()));
			return p.getContent();
		}
		
}
