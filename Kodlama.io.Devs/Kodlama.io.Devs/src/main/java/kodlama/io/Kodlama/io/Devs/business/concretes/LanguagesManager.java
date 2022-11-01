package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguagesService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@Service
public class LanguagesManager implements LanguagesService {
	
	private LanguagesRepository languageRepository;
	
	@Autowired
	public LanguagesManager(LanguagesRepository languageRepository) {
	
		this.languageRepository = languageRepository;
	}


	@Override
	public List<Languages> getAll() {
		// iş kuralları
		return languageRepository.getAll();
	}


	@Override
	public void add(Languages language) {
		for(Languages languag: languageRepository.getAll()) {
			if(language.getName() != languag.getName()) {
				languageRepository.add(language);
			}
		}
		
	}


	@Override
	public void delete(Languages language) {
		languageRepository.delete(language);
		
	}


	@Override
	public void update(Languages language) {
		languageRepository.update(language);
		
	}


	@Override
	public String getById(int id) {
		return languageRepository.getById(id);
	}

}
