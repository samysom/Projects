  package com.asset.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asset.dao.AssetDAOJPAimpl;
import com.asset.dao.AssetDAOJPA;
import com.asset.jpa.dto.Asset;
import com.asset.jpa.dto.AssetRequest;
import com.asset.jpa.dto.Employee;
import com.asset.jpa.dto.User;



@Service
public class AssetServiceJPAimpl implements AssetServiceJPA {

	@Autowired
	AssetDAOJPAimpl imp;
	AssetDAOJPA impl=new AssetDAOJPAimpl();
	@Override
	public User login(String userName, String password, String usertype) {
		
	User us=impl.login(userName, password, usertype);	
	if(us!=null) {
		return us;
	}else {
	
	return null;
}}

	@Override
	public boolean createUser(User u) {
		
		boolean b=impl.createUser(u);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(User u) {
		boolean b=impl.updateUser(u);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(int userId) {
		boolean b=impl.deleteUser(userId);
		if(b==true)
		{
			return true;
		}
		return false;
	}


	@Override
	public boolean addEmployee(Employee e) {
		boolean b=impl.addEmployee(e);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e) {
		boolean b=impl.updateEmployee(e);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int empNo) {
		boolean b=impl.deleteEmployee(empNo);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean createAsset(Asset a) {
		boolean b=impl.createAsset(a);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAsset(Asset a) {
		boolean b=impl.updateAsset(a);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAsset(int assetId, String assetName) {
		boolean b=impl.deleteAsset(assetId, assetName);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean requestAsset(AssetRequest r) {
		boolean b=impl.requestAsset(r);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public   List<AssetRequest> fetchRequest() {
		List<AssetRequest> ar=impl.fetchRequest();	
		if(ar!=null)
		{
			return ar;
		}
		return null;
	}
	
	
	
	@Override
	public List<Asset> statusRequest() {
		List<Asset> list=impl.statusRequest();
		if(list!=null)
		{
			return list;
		}
		return null;
	}

	
	@Override
	public List<Asset> fetchAllocatedAsset() {
		 List<Asset> ast=impl.fetchAllocatedAsset();	
		if(ast!=null)
		{
			return ast;
		}
		return null;
	}

	@Override
	public List<Asset> fetchUnallocatedAsset() {
		List<Asset> ast=impl.fetchUnallocatedAsset();	
		if(ast!=null)
		{
			return ast;
		}
		return null;
	}



//	@Override
//	public Asset statusRequest(int assetId) {
//		Asset ast=impl.statusRequest(assetId);	
//		if(ast!=null)
//		{
//			return ast;
//		}
//		return ast;
//	}
	
}
