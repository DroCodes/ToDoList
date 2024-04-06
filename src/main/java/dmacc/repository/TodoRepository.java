/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Mar 31, 2024
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Todo;

/**
 * 
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
}
