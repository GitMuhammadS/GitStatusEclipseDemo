package com.shahbaz.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.shahbaz.model.Personal;

public interface IPersonalRepository extends JpaRepository<Personal,Integer>, PagingAndSortingRepository<Personal,Integer>, CrudRepository<Personal, Integer>{
	
	//public List<Personal> findByAddress(String address);
	//public List<Personal> findByAddressEquals(String address);
	public List<Personal> findByAddressIs(String address);
	public List<Personal> findByIncomeLessThan(Double income);
	
	public List<Personal> findByPnameLike(String initChar);
	public List<Personal> findByPnameStartingWith(String initChar);
	
	@Query("FROM com.shahbaz.model.Personal WHERE address=:address")
	public List<Personal> searchByAddress(@Param("address")String address1);
	
	@Query("FROM com.shahbaz.model.Personal WHERE income>=:min and income<=:max")
	public List<Personal> searchByIncome(double min,double max);
	
	@Query("FROM com.shahbaz.model.Personal WHERE address IN(:addrs1,:addrs2,:addrs3)")
	public List<Personal> searchByListofAdresses(String addrs1,String addrs2,String addrs3);
	
	@Query("SELECT pname,income from com.shahbaz.model.Personal where address IN(:addrs1,:addrs2)")
	public List<Object[]> searchByListOfLocs(String addrs1,String addrs2);
	
	@Query("SELECT pname FROM com.shahbaz.model.Personal WHERE income<=:lessThan")
	public List<String> searchByname(double lessThan);
	
	@Query("FROM com.shahbaz.model.Personal WHERE pid=:id")
	public Optional<Personal> getPersonal(Integer id);
	
	@Query("SELECT pname,income FROM com.shahbaz.model.Personal WHERE pid=:id")
	public Object getOneOrTwoProperty(int id);
	
	@Query("SELECT pname FROM com.shahbaz.model.Personal WHERE pid=:id")
	public String getString(int id);
	
	@Modifying
	@Query("UPDATE PERSONAL_TAB SET INCOME=:income WHERE ADDRESS=:address")
	public int updateTheQuery(double income,String address);
	
	public List<Personal> findByIncomeBetween(Double incL,Double incM);
	
}
