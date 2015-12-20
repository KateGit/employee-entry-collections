/**
 *   File Name: Employee.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Nov 30, 2015
 *
 */

package com.sqa.km.employees;

/**
 * Employee //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Employee extends AbstractPerson {

	public Employee(String name, String address, int age) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.setAge(age);
	}

	@Override
	public String toString() {
		return super.toString() + " They also work for a living.";
	}

	/**
	 * @param address
	 */
	private void setAddress(String address) {
		// TODO Auto-generated method stub

	}

}
