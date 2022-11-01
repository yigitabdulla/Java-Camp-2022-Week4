package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;



import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;


public interface LanguagesRepository {
	List<Languages> getAll();
	void add(Languages language);
	void delete(Languages language);
	void update(Languages language);
	String getById(int id);
}
