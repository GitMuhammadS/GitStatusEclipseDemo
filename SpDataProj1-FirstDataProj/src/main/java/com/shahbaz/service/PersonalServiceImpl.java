package com.shahbaz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.shahbaz.model.Personal;
import com.shahbaz.repository.IPersonalRepository;

@Service("personalService")
public class PersonalServiceImpl implements IPersonalService{
	@Autowired
	private IPersonalRepository repo;
	
	@Override
	public String registerPersonal(Personal personal) {
		//use repo
		Personal savedPersonal=null;
		if(personal!=null)
			savedPersonal=repo.save(personal);
		return savedPersonal!=null?"Record got saved with id: "+savedPersonal.getPid():"Record not saved ";
		
	}

	@Override
	public Iterable<Personal> registerInBatch(Iterable<Personal> personal) {
		// TODO Auto-generated method stub
		return repo.saveAll(personal);
	}

	@Override
	public Long getCountOfRecords() {
		// TODO Auto-generated method stub
		return repo.count();
	}

	@Override
	public Boolean isRecordExists(Integer id) {
		
		return repo.existsById(id);
	}

	@Override
	public Iterable<Personal> fetchAllRecords() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Iterable<Personal> fetchAllRecordById(List<Integer> ids) {
		
		return repo.findAllById(ids);
	}

	@Override
	public Optional<Personal> fetchRecordById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public String removeById(Integer id) {
		Optional<Personal> opt=repo.findById(id);
		if(opt.isPresent()) {
			repo.deleteById(id);
			return "Record with id: "+id+" got deleted";
		}
		return "Record with id: "+id+" not found";
	}

	@Override
	public String removeByObject(Personal personal) {
		Optional<Personal> opt=repo.findById(personal.getPid());
		if(opt.isPresent()) {
			repo.delete(personal);
			return "Record with id "+personal.getPid()+" got deleted";
		}
		return "Record with id: "+personal.getPid()+" not found";
	}

	@Override
	public String removeAllById(List<Integer> ids) {
		Iterable<Personal> itPers=repo.findAllById(ids);
		int count=0;
		if(itPers!=null) {
			count=((List<Integer>)ids).size();
			repo.deleteAllById(ids);
			itPers.forEach(vac->{
				 System.out.println("Record with id: "+vac.getPid()+" got deleted");
			});
			return "Total "+count+" records got deleted";
		}
		return "Record not found";
	}

	@Override
	public String removeAllRecords() {
		long count=repo.count();
		String msg=null;
		if(count!=0) {
			repo.deleteAll();
			msg="All records got deleted:";
		}
		else {
			msg="Record Got deleted";
		}
		return msg;
		
	}

	@Override
	public Iterable<Personal> fetchAllRecordsByFetching(boolean asc, String... properties) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, properties);
		Iterable<Personal> itPersonal=repo.findAll(sort);
		return itPersonal;
	}

	@Override
	public Iterable<Personal> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... props) {
		Pageable pageable=PageRequest.of(pageNo, pageSize, asc?Direction.ASC:Direction.DESC, props);
		return repo.findAll(pageable);
	}

	@Override
	public List<Personal> searchPersonalByGivenData(Personal personal, boolean order, String... props) {
		//prepare example object
		Example<Personal> example=Example.of(personal);
		//prepare Sort object
		Sort sort=Sort.by(order?Direction.ASC:Direction.DESC, props);
		List<Personal> listPers=repo.findAll(example, sort);
		return listPers;
	}

	@Override
	public List<Personal> findByLocation(String loc) {
		// TODO Auto-generated method stub
		return repo.findByAddressIs(loc);
	}

	@Override
	public List<Personal> searchByPrice(double inc) {
		// TODO Auto-generated method stub
		return repo.findByIncomeLessThan(inc);
	}

	@Override
	public List<Personal> searchByPriceBetween(double incL, double incM) {
		// TODO Auto-generated method stub
		return repo.findByIncomeBetween(incL, incM);
	}

	@Override
	public List<Personal> searchByNameLike(String initChar) {
		// TODO Auto-generated method stub
		return repo.findByPnameLike(initChar);
	}

	@Override
	public List<Personal> searchByPnameStartingWith(String initChar) {
		// TODO Auto-generated method stub
		return repo.findByPnameStartingWith(initChar);
	}

	@Override
	public List<Personal> fondByAddress(String addrs) {
		// TODO Auto-generated method stub
		return repo.searchByAddress(addrs);
	}

	@Override
	public List<Personal> fondByIncomeInBetween(double min, double max) {
		
		return repo.searchByIncome(min, max);
	}

	@Override
	public List<Personal> fondByLocations(String addrs1, String addrs2, String addrs3) {
		// TODO Auto-generated method stub
		return repo.searchByListofAdresses(addrs1, addrs2, addrs3);
	}

	@Override
	public List<Object[]> fondByLocs(String addrs1, String addrs2) {
		// TODO Auto-generated method stub
		return repo.searchByListOfLocs(addrs1, addrs2);
	}
	
	@Override
	public List<String> fondByIncome(double inc) {
		// TODO Auto-generated method stub
		return repo.searchByname(inc);
	}
	
	@Override
	public Optional<Personal> getPersonalized(int id) {
		// TODO Auto-generated method stub
		return repo.getPersonal(id);
	}
	
	@Override
	public Object getThis(int id) {
		// TODO Auto-generated method stub
		return repo.getOneOrTwoProperty(id);
	}
	
	@Override
	public String getString(int id) {
		// TODO Auto-generated method stub
		return repo.getString(id);
	}
	
	@Override
	public String updateTheQuery(double inc, String name) {
		// TODO Auto-generated method stub
		int n= repo.updateTheQuery(inc, name);
		return n==0?"Not updated":"Updated";
	}

}
