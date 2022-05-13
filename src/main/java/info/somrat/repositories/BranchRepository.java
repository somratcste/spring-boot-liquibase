package info.somrat.repositories;

import info.somrat.entities.Branch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Integer> {

}
