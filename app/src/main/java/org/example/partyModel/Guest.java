package org.example.partyModel;

public class Guest {
  /*
   * Declare instance variables for first name, last name as String-objects,
   * and age as an int and address as an Address-object.
   */
  private String firstName;
  private String lastName;
  private int age;
  private Address address;

  /*
   * Write a default constructor (no parameters) that gives default values for
   * instance variables and creates the Address-object using
   * the default constructor for class Address.
   * Use default values for first name, last name and age of your choice
   * that will inform a user that this value isn't really set
   * and that will work for calculating statistics.
   *
   * You can handle this in this constructor or call
   * the constructor below with null for all values and handle that there.
   */
  public Guest() {
    this("FakeFirstName", "FakeLastName", -1, null);
  }

  /*
   * Write a constructor with parameters for all instance variables
   * given above where the address is a reference to an Address-object
   * and first name and last name are of type String adn age an int.
   *
   * Check that the values for the parameters for first name and last name
   * isn't empty strings or null before assigning the values to the
   * corresponding instance variables. If any value is empty or null assign a
   * default value of your choice that will inform a user that this value isn't
   * really set.
   *
   * Check the value of the prameter for age so that this innt null or a value
   * less than 0 (negative age is not allowed). If age is a value less than 0
   * or null set the value of age to 0.
   *
   * If the parameter for the Address-object is null create an Address-object
   * by using the default constructor for class Address.
   */
  public Guest(String firstName, String lastName, int age, Address address) {

    if ((firstName == null) || (firstName.isEmpty())) {

      this.firstName = "FakeFirstName because null or empty";

    } else {
      this.firstName = firstName;
    }

    if ((lastName == null) || (lastName.isEmpty())) {

      this.lastName = "FakeLastName because null or empty";

    } else {
      this.lastName = lastName;
    }

    if ((age < 0) || (Integer) age == null) {

      this.age = 0;

    } else {
      this.age = age;
    }

    if (address == null) {
      this.address = new Address();
    }
  }

  /*
   * Write a constructor with parameters for all instance variables
   * given above and all instance variables for the address.
   * Create the Address-object with the values given in the parameters.
   * Let the Address class take care of assigning default values if any
   * parameters for this object is an empty string or null.
   */
  public Guest(
      String firstName,
      String lastName,
      int age,
      Address address,
      String street,
      String city,
      String zipCode,
      Countries country) {

    if ((firstName == null) || (firstName.isEmpty())) {

      this.firstName = "FakeFirstName because null or empty";

    } else {
      this.firstName = firstName;
    }

    if ((lastName == null) || (lastName.isEmpty())) {

      this.lastName = "FakeLastName because null or empty";

    } else {
      this.lastName = lastName;
    }

    if ((age < 0) || (Integer) age == null) {

      this.age = 0;

    } else {
      this.age = age;
    }

    if (address == null) {
      this.address = new Address();
    } else {
      this.address = new Address(street, city, zipCode, country);
    }
  }

  /*
   * Implement get- and set-methods for all instance variables,
   * including variables matching the instance variables of
   * the Address-object (those call getters and setters in the Address-object).
   *
   * Remember to check parameters in set-methods with the same
   * rules as in the constructor above.
   */
  // TODO: Fix the setters
  public int getAge() {
    return age;
  }

  public Address getAddress() {
    return address;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /*
   * Write a toString method to return a String made of first name,
   * last name adn age and the address (by calling the toString method of the
   * Address-object)
   * formatted in one line (this will be shown in the window under
   * "Guest Register" ).
   */

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
}
