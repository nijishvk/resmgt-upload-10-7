package com.hexa.resmgt.springboot.service;

import com.hexa.resmgt.springboot.model.HexaDataPull;
<<<<<<< HEAD
import com.hexa.resmgt.springboot.model.ResourceMaster;
import com.hexa.resmgt.springboot.model.ResourceMonthlyCount;
=======
import java.util.List;
>>>>>>> parent of 2ce40aa... updates from priyanka

public interface HexaDataPullService {

	HexaDataPull findById(Long id);

	HexaDataPull findByName(String name);

	void saveUser(HexaDataPull user);

	void updateUser(HexaDataPull user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<HexaDataPull> findAllUsers();

	boolean isUserExist(HexaDataPull user);
<<<<<<< HEAD
	
	/*List<HexaDataPull> getBillableConsultants(String resType);*/
	
	List<ResourceMaster> getLocationWiseUsers();
	
	List<ResourceMaster> getProjTypeBillUsers(String resType);
	
	List<ResourceMonthlyCount> getResourceCount(String month, String dataTypeCd);
	
=======
>>>>>>> parent of 2ce40aa... updates from priyanka
}
