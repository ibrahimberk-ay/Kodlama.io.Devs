package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.PLangRepository;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@Repository
public class InMemoryPLangRepository implements PLangRepository{

	List<PLanguage> pLangs;
	
	public InMemoryPLangRepository() {
		pLangs = new ArrayList<PLanguage>();
		pLangs.add(new PLanguage(1,"Java"));
		pLangs.add(new PLanguage(2,"C#"));
		pLangs.add(new PLanguage(3,"C++"));
		pLangs.add(new PLanguage(4,"Python"));
		
	}

	@Override
	public PLanguage getById(int id) {
		PLanguage plang = new PLanguage();
		plang = null;
		for(PLanguage lang : pLangs) {
			if(lang.getId() == id+1) {
				plang = lang;
			}
		}
		return plang;
	}

	@Override
	public void add(PLanguage pLang) {
		boolean flag = true;
		String name = pLang.getName();
		for(PLanguage langs : pLangs) {
			if(langs.getName().equals(name)) {
				flag = false;
			}
		}
		if(flag) {
			pLangs.add(pLang);
		}
		
	}

	@Override
	public void delete(int id) {
		PLanguage planguage = new PLanguage();
		planguage = null;
		for(PLanguage plang : pLangs) {
			if(plang.getId() == id) {
				planguage = plang;
			}
		}
		pLangs.remove(planguage);
	
	}

	@Override
	public void update(int id,String name) {
		PLanguage planguage = new PLanguage();
		planguage = null;
		for(PLanguage plang : pLangs) {
			if(plang.getId() == id) {
				planguage = plang;
			}
		}
		planguage.setName(name);
	}

	@Override
	public List<PLanguage> getAll() {
		
		return pLangs;
	}

}
