package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Album;
import com.ibm.service.AlbumService;

@RestController
public class AlbumController {
	@Autowired
	AlbumService s;
	@PostMapping(value = "/add", consumes = "application/json")
	public String save(@RequestBody Album a) {
		int id = s.save(a);
		return "Album added with id: "+id;
	}
	@GetMapping(value ="/get/{id}", produces = "application/json")
	public Album ftech( int id) {
		return s.ftech(id);
	}
	@GetMapping(value = "/list", produces = "application/json")
	public List<Album> list(){
		return s.list();
	}
	@GetMapping(value = "/artist/{artist}", produces = "application/json")
	public List<Album> listByArtist(@PathVariable String artist){
		return s.byArtist(artist);
	}
	@GetMapping(value = "/genre/{genre}", produces = "application/json")
	public List<Album> listByGenre(@PathVariable String genre){
		return s.byGenre(genre);
	}
}