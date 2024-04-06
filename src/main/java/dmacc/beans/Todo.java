/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Mar 31, 2024
 */
package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.time.LocalDate;
import java.util.Date;

/**
 * 
 */
@Entity
@Data
@NoArgsConstructor
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	private String note;
}
