package org.sci.repo;

import java.util.List;

import org.sci.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepo extends JpaRepository<Branch,Integer> {
	 @Query("SELECT b from Branch b where b.reg_id = :id") 
	    List<Branch> findBranchById(@Param("id") String reg_id);
	 
}
