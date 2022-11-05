package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.PLangService;
import Kodlama.io.Devs.dataAccess.abstracts.PLangRepository;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@Service
public class PLangManager implements PLangService{

	private PLangRepository pLangRepository;
	
	public PLangManager(PLangRepository pLangRepository) {
		this.pLangRepository = pLangRepository;
	}




	@Override
	public PLanguage getById(int id) {
		
		return pLangRepository.getById(id-1);
	}




	@Override
	public void add(PLanguage pLang) {
		pLangRepository.add(pLang);
		
	}




	@Override
	public void delete(int id) {
		pLangRepository.delete(id);
		
	}




	@Override
	public void update(int id,String name) {
		pLangRepository.update(id, name);
		
	}




	@Override
	public List<PLanguage> getAll() {
		
		return pLangRepository.getAll();
	}

}
