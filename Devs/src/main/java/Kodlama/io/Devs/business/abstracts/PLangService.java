package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.PLanguage;

public interface PLangService {
	void add(PLanguage pLang);
	void delete(int id);
	void update(int id,String name);
	PLanguage getById(int id);
	List<PLanguage> getAll();
}
