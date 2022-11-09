package jdbc_project1;

import java.util.Scanner;

public class MediaDriver {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("============Welcome===========");
		boolean b=true;
		while(b)
		{
			System.out.println("Enter the operation to perform\n1:Signup \n2:Login \n3:Exit");
			int choice=scanner.nextInt();
			
			switch(choice)
			{
				case 1:{
					System.out.println("===========Welcome to SignUp Page=============");
					System.out.println("Enter the email id");
					String email=scanner.next();
					System.out.println("Enter the User First Name :");
					String fname=scanner.next();
					System.out.println("Enter the User Last Name :");
					String lname=scanner.next();
					System.out.println("Enter the Password :");
					String password= scanner.next();
					System.out.println("Enter the Mobile number :");
					long mobile=scanner.nextLong();
					System.out.println("Enter the Gender :");
					String gender=scanner.next();
					System.out.println("Enter the Date of Birth yyyy-mm-dd :");
					String DOB=scanner.next();
					
					User user=new User();
					user.setEmail(email);
					user.setFirstname(fname);
					user.setLast1name(lname);
					user.setPassword(password);
					user.setMobile(mobile);
					user.setGender(gender);
					user.setDOB(DOB);
					SocialMedia socialmedia= new SocialMedia();
					try {
						socialmedia.signUp(user);
						System.out.println("====================================");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				break;
				case 2:{
					System.out.println("============Welcome to LogIn Page===========");
					System.out.println("Enter you email");
					String email= scanner.next();
					System.out.println("Enter your Password");
					String password= scanner.next();
					
					User user = new User();
					user.setEmail(email);
					user.setPassword(password);
					SocialMedia socialmedia= new SocialMedia();
					try {
						socialmedia.logIn(email, password, user);
						System.out.println("=========================================");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				break;
				case 3:
				{
					b=false;
					System.out.println("=============Thanks for using the app============");
				}
			}
		}
	}


	}


