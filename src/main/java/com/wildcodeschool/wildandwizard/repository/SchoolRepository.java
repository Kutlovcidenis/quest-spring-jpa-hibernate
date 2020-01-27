package com.wildcodeschool.wildandwizard.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.wildandwizard.entity.School;  // adapt as needed

@Repository 																		// @ Repository tells Spring that this interface is the link between our application
public interface SchoolRepository extends JpaRepository<School, Long> {             //  and the database (to find out more, read Spring Bean Annotations in the resources section)
}																				    // he parameters <Wizard, Long> indicate that our interface will be responsible
//																					// for managing our entity Wizard and that the unique identifier of Wizard (its id) has the type Long.
// 																					// Behind the scenes, JpaRepository inherits from PagingAndSortingRepository 
// 																					// which is in turn a child of CrudRepository. Therefore, our WizardRepository 
// 																					// interface inherits all the method declarations of these base interfaces