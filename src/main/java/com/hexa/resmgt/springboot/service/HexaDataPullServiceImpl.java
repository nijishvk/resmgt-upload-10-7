package com.hexa.resmgt.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.resmgt.springboot.model.HexaDataPull;
<<<<<<< HEAD
import com.hexa.resmgt.springboot.model.ResourceMaster;
import com.hexa.resmgt.springboot.model.ResourceMonthlyCount;
=======
>>>>>>> parent of 2ce40aa... updates from priyanka
import com.hexa.resmgt.springboot.repositories.HexaDataPullRepository;

@Service("hexaDataPullService")
@Transactional
public class HexaDataPullServiceImpl implements HexaDataPullService{
	
	@Autowired
	private HexaDataPullRepository hexaDataPullRepository;

	@Override
	public HexaDataPull findById(Long id) {
		// TODO Auto-generated method stub
		return hexaDataPullRepository.findOne(id);
	}

	@Override
	public HexaDataPull findByName(String name) {
		// TODO Auto-generated method stub
		return hexaDataPullRepository.findByResName(name);
	}

	@Override
	public void saveUser(HexaDataPull user) {
		hexaDataPullRepository.save(user);
	}

	@Override
	public void updateUser(HexaDataPull user) {
		saveUser(user);
	}

	@Override
	public void deleteUserById(Long id) {
		hexaDataPullRepository.delete(id);
	}

	@Override
	public void deleteAllUsers() {
		hexaDataPullRepository.deleteAll();
	}

	@Override
	public List<HexaDataPull> findAllUsers() {
		// TODO Auto-generated method stub
		return hexaDataPullRepository.findAll();
	}

	@Override
	public boolean isUserExist(HexaDataPull user) {
		return findByName(user.getResName()) != null;
	}
<<<<<<< HEAD
	
	/*public List<HexaDataPull> getBillableConsultants(String resType) {
		return hexaDataPullRepository.getBillable(resType);
	}*/
	
	public List<ResourceMaster> getLocationWiseUsers() {
		return resourceMasterRepository.getLocationCount();
	}
	
	public List<ResourceMaster> getProjTypeBillUsers(String resType) {
		return resourceMasterRepository.getProjTypeBillCount(resType);
	}
	
	public List<ResourceMonthlyCount> getResourceCount(String month, String dataTypeCd) {
		if(dataTypeCd.equalsIgnoreCase("ATTR")) {
			return resourceCountRepository.getAttrChartData(month, dataTypeCd);
		}
		return resourceCountRepository.getResourceCount(month, dataTypeCd);
	}
}
=======

}
>>>>>>> parent of 2ce40aa... updates from priyanka
