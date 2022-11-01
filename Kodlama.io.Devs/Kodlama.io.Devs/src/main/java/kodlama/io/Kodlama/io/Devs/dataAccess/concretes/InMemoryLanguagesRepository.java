package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@Repository
public class InMemoryLanguagesRepository implements LanguagesRepository {
	
	List<Languages> languages;
	
	
	public InMemoryLanguagesRepository() {
		languages = new ArrayList<Languages>();
		
		languages.add(new Languages(1,"C++"));
		languages.add(new Languages(2,"Python"));
		languages.add(new Languages(3,"C"));
	}


	@Override
	public List<Languages> getAll() {
		
		return languages;
	}
	
	public String getById(int id){
		for(Languages langag: languages) {
			if(langag.getId() == id) {
				return langag.getName();
			}
			
		}
		
		return "Language doesn't exist";
	}

	public void update(Languages language) {
		for(Languages langag: languages) {
			if(langag.getId() == language.getId()) {
				langag.setName(language.getName());
			}
		}
		
	}
	
	public void delete(Languages language) {
		for(Languages languag: languages) {
			if(language.getId() == languag.getId()) {
				languages.remove(language);
			}
		}
		
	}
	
	public void add(Languages language) {
		
		for(Languages langag: languages) {
			if(langag.getName() != language.getName()) {
				languages.add(language);
			}
		}
		
		
	}
}
