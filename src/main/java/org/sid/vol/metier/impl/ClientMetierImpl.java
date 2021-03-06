package org.sid.vol.metier.impl;

import java.util.List;

import org.sid.vol.dao.IClientDao;
import org.sid.vol.entities.Client;
import org.sid.vol.metier.IClientMetier;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class ClientMetierImpl implements IClientMetier {
	
	private IClientDao dao;
	
	
	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	@Override
	public Client save(Client entity) {
		return dao.save(entity);
	}


	@Override
	public Client update(Client entity) {
		return dao.update(entity);
	}


	@Override
	public List<Client> selectAll() {
		return dao.selectAll();
	}


	@Override
	public List<Client> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}


	@Override
	public Client getById(Long id) {
		return dao.getById(id);
	}


	@Override
	public void remove(Long id) {
     dao.remove(id);		
	}


	@Override
	public Client findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}


	@Override
	public Client findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		return findCountBy(paramName, paramValue);
	}

	

}
