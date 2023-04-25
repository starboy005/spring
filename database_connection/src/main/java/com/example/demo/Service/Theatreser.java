package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.theatre;
import com.example.demo.repository.theatre_repo;

@Service
public class Theatreser {
	@Autowired 
	private theatre_repo tr ;
	
	public List<theatre> getData()
	{
		return tr.findAll() ;
	}
	
	public void createData(theatre t)
	{
		tr.save(t) ;
	}
	
	public void updateData(theatre t)
	{
		tr.save(t) ;
	}
	
	public void deleteData(String movie_name)
	{
		tr.deleteById(movie_name);
	}
}
