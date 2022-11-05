package Kodlama.io.Devs.dataAccess.abstracts;



import java.util.List;

import Kodlama.io.Devs.entities.concretes.PLanguage;

public interface PLangRepository {
	void add(PLanguage pLang);
	void delete(int id);
	void update(int id,String name);
	PLanguage getById(int id);
	List<PLanguage> getAll();
}
