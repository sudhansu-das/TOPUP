package org.sci.repo;

import java.util.List;

import org.sci.model.Branch;
import org.sci.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails,Integer>{

	List<CustomerDetails> findByBranchId(String branchId);
	 @Query("SELECT b from CustomerDetails b where b.acc_No = :acc_No") 
	CustomerDetails finByAcc_No(@Param("acc_No") String acc_No);
	 
}
