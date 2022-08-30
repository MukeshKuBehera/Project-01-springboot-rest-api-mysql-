package com.eidiko.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.eidiko.controller.entity.Eidiko;
import com.eidiko.dao.EidikoDao;



@Service
public class EmpService_implemented implements EmpService{
	
	
	@Autowired
	private EidikoDao eidikodao;
	
	public List<Eidiko> list;
	public EmpService_implemented() {
		
	}
	
	@Override
	public List<Eidiko> getEmp(){
		
		return eidikodao.findAll();
	}
	
	@Override
	public Eidiko getEmpId(int empId) {
	
		
	
			return eidikodao.getOne(empId);
		
		
	}
	
	@Override
	public Eidiko addEmp(Eidiko emp){
		eidikodao.save(emp);
		
		return emp;
		
	}

	
	@Override
	public Eidiko update(Eidiko emp) {
		
	  eidikodao.save(emp);
		return emp;
	}
	
	@Override
	public String  deleteEmp(@PathVariable Integer empId,@RequestBody Eidiko eidiko) {
		//Optional<Eidiko> entity=eidikodao.findById(empId);
		this. eidikodao.delete(eidiko);
		return "successfully deleted";
}

	@Override
	public void deleteEmp(Eidiko empId) {
		// TODO Auto-generated method stub
		
	}
}