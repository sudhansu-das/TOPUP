package org.sci.repo;


import org.sci.model.LoandetailsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoandetailsinfoRepo extends JpaRepository<LoandetailsInfo,Long> {
	@Query("select l from LoandetailsInfo l where l.acc_No=:acc_No")
	LoandetailsInfo findByAcc_No(@Param("acc_No") String acc_No);

}
