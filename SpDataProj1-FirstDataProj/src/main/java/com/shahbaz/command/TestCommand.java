package com.shahbaz.command;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.shahbaz.model.Personal;
import com.shahbaz.service.IPersonalService;

@Component
public class TestCommand implements CommandLineRunner{
	@Autowired
	private IPersonalService service;
	
	@Override
	public void run(String... args) throws Exception {
		
//		//create entity class object
//		Personal personal=new Personal("shahbaz",false,141.0,"Bangal");
//		//use service
//		System.out.println(service.registerPersonal(personal));
//		try {
//		Iterable<Personal> itPers=service.registerInBatch(List.of(new Personal("shah",false,415.0,"GOa"),
//														          new Personal("kallu",true,741.0,"shimla")));
//		System.out.println("The registration nos are: ");
//		itPers.forEach(vac->System.out.println(vac.getPid()));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println("The total record: "+service.getCountOfRecords());
//			System.out.println("The 52nd record exist:"+service.isRecordExists(100));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			Iterable<Personal>itPers=service.fetchAllRecords();
//			itPers.forEach(it->{
//				System.out.println(it);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
//		
//		try {
//			Iterable<Personal> itPers =	service.fetchAllRecordById(List.of(1,23,52,102));
//			itPers.forEach(it->{
//				System.out.println(it);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			Optional<Personal> opt=service.fetchRecordById(214);
//			if(opt.isPresent())
//				System.out.println(opt.get());
//			else
//				System.out.println("Record not found");
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
		/*try {
			Optional<Personal> opt=service.fetchRecordById(214);
			if(opt.isPresent())
				System.out.println(opt);
			opt.orElseThrow(()->new IllegalArgumentException("Record not found")
			);
				
		}*/
//		try {
//			Personal personal=service.fetchRecordById(274).orElse(new Personal());
//			System.out.println(personal);
//			
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			System.out.println(service.removeById(232));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			Personal personal=new Personal();
//			personal.setPid(1);
//			System.out.println(service.removeByObject(personal));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			System.out.println(service.removeAllById(List.of(252,202)));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			Iterable<Personal> itPersonal=service.fetchAllRecordsByFetching(false, "income");
//			itPersonal.forEach(p->{
//				System.out.println(p);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			Iterable<Personal> itPersonal=service.fetchDetailsByPageNo(2,7, true, "income");
//			itPersonal.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
//		try {
//			Personal personal=new Personal();
//			personal.setAddress("punjab");
//			personal.setIncome(741.0);
//			List<Personal> listp=service.searchPersonalByGivenData(personal, false,"income");
//			listp.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Personal> listP=service.findByLocation("punjab");
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Personal> listP=service.searchByPrice(400.0);
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Personal> listP=service.searchByPriceBetween(100, 200);
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Personal> listP=service.searchByNameLike("r%");
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Personal> listP=service.searchByPnameStartingWith("k%");
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Personal> listP=service.fondByAddress("punjab");
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Personal> listP=service.fondByIncomeInBetween(100, 200);
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Personal> listP=service.fondByLocations("punjab", "shimla", "kolkata");
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<Object[]> listP=service.fondByLocs("punjab", "punjab1");
//			listP.forEach(var->{
//				System.out.println(var[0]+" "+var[1]);
//			});
//			
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			List<String> listP=service.fondByIncome(600);
//			listP.forEach(var->{
//				System.out.println(var);
//			});
//			
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			
//			System.out.println(service.getPersonalized(41));
//			
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		try {
//			
//			Object obj=service.getThis(41);
//			Object ab[]=(Object[])obj;
//			for(Object val:ab) {
//				System.out.println(val);
//			}
//			
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
		
//		try {
//			System.out.println(service.getString(41));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
		try {
			System.out.println(service.updateTheQuery(120, "punjab"));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	}

}
