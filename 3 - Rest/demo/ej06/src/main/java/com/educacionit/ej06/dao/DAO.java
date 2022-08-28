package com.educacionit.ej06.dao;

import java.util.List;

public interface DAO<T,k> {
	
	Boolean add(T t);
	
	Boolean del(T t);
	
	Boolean upd(T t);
	
	T getById(k id);
	
	List<T> getAll();

}
