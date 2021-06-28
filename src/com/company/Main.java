package com.company;

public class Main {

    public static void main(String[] args) {
	Teachers T1 = new Teachers();
	T1.name = "Abu";
	T1.phone =1234564;
	T1.showaddress();

	Student S1 = new Student();
	S1.name ="Nishad";
	S1.phone = 9874556;
	S1.showaddress();

	Staff St1 = new Staff();
	St1.name = "Ancel";
	St1.phone = 546789;
	St1.showaddress();
    }
}
