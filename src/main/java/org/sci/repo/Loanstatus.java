package org.sci.repo;

import java.util.List;

import org.sci.model.Loanstatusdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Loanstatus extends JpaRepository<Loanstatusdetails, Long> {
	 @Query(value="SELECT * from Loanstatusdetails b where b.branch_Id = :id and b.year=:curYear and b.qtr=:qtr",nativeQuery = true)
	List<Loanstatusdetails> getAllRec(@Param("id") String branchId, @Param("curYear") int curYear,@Param("qtr") int qtr);
	 @Query("select count(*) from Loanstatusdetails b where b.sms_Sent=:id or b.mail_Sent=:id1")
	 int getAllContacted(@Param("id") boolean val,@Param("id1") boolean  val1);
	 @Query("select count(*) from Loanstatusdetails")
	 int getAllGenerated();
	 @Query("select count(*) from Loanstatusdetails b where b.generated=true")
	int totConvertedToLoan();
	 @Query("select count(*) from Loanstatusdetails b where b.notInterested=:id")
	int getTotNotInterested(@Param("id") boolean val);
	 @Query("select count(*) from Loanstatusdetails b where b.interested=:id")
	int getAllInterested(@Param("id") boolean val);
}
