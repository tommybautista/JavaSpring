package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepo;

@Service
public class LanguageService {
	private final LanguageRepo languageRepo;
	
	public LanguageService(LanguageRepo languageRepo) {
		this.languageRepo = languageRepo;
	}
	
	public List<Language> allLanguages(){
		return languageRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		// Optional means the object can exist or not
		Optional<Language> optionalLanguage = languageRepo.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}else {
			return null;
		}
	}
	
	public Language createLanguage(Language language) {
		return languageRepo.save(language);
	}
	
	public Language updateLanguage(Language language) {
		return languageRepo.save(language);
	}
	
	public void deleteLanguage(Language language) {
		languageRepo.delete(language);
	}
}
