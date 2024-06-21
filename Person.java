import java.util.Scanner;

public class Person {

private String name;
private int age;
private String email;
private String phone_number;
private String sex;
private String address;

Scanner scanner = new Scanner(System.in);

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPhone_number() {
    return phone_number;
}
public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
}
public String getSex() {
    return sex;
}
public void setSex(String sex) {
    this.sex = sex;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}

public Person() { }

public Person(String name, int age, String email, String phone_number, String sex, String address) {
    this.name = name;
    this.age = age;
    this.email = email;
    this.phone_number = phone_number;
    this.sex = sex;
    this.address = address;
}

public void print() {
System.out.println(" Name : " + name);
System.out.println(" Age : " + age);
System.out.println(" Phone Number : " + phone_number);
System.out.println(" Gender : " + sex);
System.out.println(" Email : " + email);
System.out.println(" Adress : " + address);
}

public void input() 
{
    System.out.println(" Enter the Name : ");
    name = scanner.nextLine();
    System.out.println(" Enter the Age : ");
    age = scanner.nextInt();
    System.out.println(" Enter Phone Number : ");
    phone_number = scanner.nextLine();
    System.out.println(" Enter Gender : ");
    sex = scanner.nextLine();
    System.out.println(" Enter Email : " );
    email = scanner.nextLine();
    System.out.println(" Enter Adress : ");
    address = scanner.nextLine();
}



}