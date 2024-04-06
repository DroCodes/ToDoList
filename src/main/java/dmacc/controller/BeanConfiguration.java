/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Mar 31, 2024
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Todo;

/**
 * 
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Todo todo() {
		Todo bean = new Todo();
		
		return bean;
	}
}
