package com.oops.Encapsulation;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Student st = new Student();
//		
//		System.out.println("Student name: " +st.getFirstName());
//		System.out.println("Student name: " +st.getLastName());
//		System.out.println("Student name: " +st.getAge());
//		System.out.println("Student name: " +st.getCollege());
//		
	// we create this new class under oop encapsulation package
		// then we cerate st method then we can access private datas from student class.
		Account acc = new Account();
		acc.setFullName("Ashu Zeberga");
		acc.setAccountNumber(9869869869L);
		acc.setAddress("4901 seminary rd Alexandria va");
		acc.setTotalBalance(200000.80);
		acc.setdepositAmount(5000.10);
		acc.setEmail("ashenafi@gmail.com");
		
		System.out.println("Customer Name: "+ acc.getFullName());
		System.out.println("Customer account: "+ acc.getAccountNumber());
		System.out.println("Customer address: "+ acc.getAddress());
		System.out.println("Customer email: "+ acc.getEmail());
		System.out.println("Customer Deposit Amount: "+acc.getdepositAmount());
		System.out.println("Customer Total Balance: "+ acc.getTotalBalance());
		
	}

}
