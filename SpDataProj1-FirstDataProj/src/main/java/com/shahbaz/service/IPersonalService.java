package com.shahbaz.service;

import java.util.List;
import java.util.Optional;

import com.shahbaz.model.Personal;

public interface IPersonalService {
	public String registerPersonal(Personal personal);
	public Iterable<Personal> registerInBatch(Iterable<Personal> personal);
	public Long getCountOfRecords();
	public Boolean isRecordExists(Integer id);
	public Iterable<Personal> fetchAllRecords();
	public Iterable<Personal> fetchAllRecordById(List<Integer> ids);
	public Optional<Personal> fetchRecordById(Integer id);
	public String removeById(Integer id);
	public String removeByObject(Personal personal);
	public String removeAllById(List<Integer> ids);
	public String removeAllRecords();
	public Iterable<Personal> fetchAllRecordsByFetching(boolean asc,String... properties);
	public Iterable<Personal> fetchDetailsByPageNo(int pageNo,int pageSize, boolean asc,String...props);
	public List<Personal> searchPersonalByGivenData(Personal personal,boolean order,String ...props);
	public List<Personal> findByLocation(String loc);
	public List<Personal> searchByPrice(double inc);
	public List<Personal> searchByPriceBetween(double incL,double incM);
	public List<Personal> searchByNameLike(String initChar);
	public List<Personal> searchByPnameStartingWith(String initChar);
	public List<Personal> fondByAddress(String addrs);
	public List<Personal> fondByIncomeInBetween(double min,double max);
	public List<Personal> fondByLocations(String addrs1,String addrs2,String addrs3);
	public List<Object[]> fondByLocs(String addrs1,String addrs2);
	public List<String> fondByIncome(double inc);
	public Optional<Personal> getPersonalized(int id);
	public Object getThis(int id);
	public String getString(int id);
	public String updateTheQuery(double inc,String name);
	
	
	
}
