package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.entity.Album;


public interface AlbumRepo extends JpaRepository<Album,Integer> {
	List<Album> findByArtist(String artist);
	//List<Album> findBySourceAndDestination(String source, String destination);
	//@Query("FROM Flight WHERE source=:src AND destination=:dest")
	List<Album>findByGenre(String genre);
	} 


