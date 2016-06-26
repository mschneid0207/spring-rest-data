package de.allianz.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.allianz.entity.CustomerEntity;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends PagingAndSortingRepository<CustomerEntity, Integer> {

	List<CustomerEntity> findByLastName(@Param("name") String name);

}
