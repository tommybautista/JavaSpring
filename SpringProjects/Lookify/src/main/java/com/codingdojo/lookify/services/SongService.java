package com.codingdojo.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepo;

@Service
public class SongService {
	private final SongRepo songRepo;
	
	public SongService(SongRepo songRepo) {
		this.songRepo = songRepo;
	}
	
	public List<Song> allSongs(){
		return songRepo.findAll();
	}
	
	public Song addSong(Song song) {
		return songRepo.save(song);
	}
	
	public Song findSong(Long id) {
		Optional<Song> optionalSong = songRepo.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		}else {
			return null;
		}
	}
	
	public List<Song> findByArtist(String artist) {
		return songRepo.findByArtistContaining(artist);
	}
	
	public List<Song> findByTitle(String title) {
		return songRepo.findByTitleContaining(title);
	}
	
	public List<Song> topTen() {
		return songRepo.getTopTen();
	}
	
	public Song updateSong(Song song) {
		return songRepo.save(song);
	}
	
	public void deleteSong(Song song) {
		songRepo.delete(song);
	}
}