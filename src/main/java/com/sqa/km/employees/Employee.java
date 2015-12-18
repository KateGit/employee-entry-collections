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
public class Employee {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private String addresses;
	private String age;
	private String jobTitle;

	private String name;

	/**
	 * @param addresses
	 * @param age
	 * @param jobTitle
	 * @param name
	 */
	public Employee(String addresses, String age, String jobTitle, String name) {
		super();
		this.addresses = addresses;
		this.age = age;
		this.jobTitle = jobTitle;
		this.name = name;
	}

	/**
	 * @return the addresses
	 */
	public String getAddresses() {
		return this.addresses;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return this.age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [addresses=" + this.addresses + ", age=" + this.age
				+ ", jobTitle=" + this.jobTitle + ", name=" + this.name + "]";
	}

}
