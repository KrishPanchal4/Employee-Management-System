import java.util.*;
class Employee
{
	Scanner sc = new Scanner(System.in);
	String name;
	String id;
	int age;
	int salary;
	String department;
	String mobileNumber;
	void addEmployee()    // FOR ADDING NEW EMPLOYEES
	{
		System.out.print("Employee Name : ");
		name = sc.nextLine();
		
		System.out.print("Employee ID : ");
		id = sc.nextLine();
		
		System.out.print("Employee Age : ");
		while(true)
		{
            age = sc.nextInt();
            if(age >= 18 && age <= 60)
			{
                break;
            }
			else
			{
                System.out.println("Invalid age! Age should be between 18 and 60. Please try again.");
                System.out.print("Enter Employee Age (between 18 and 60): ");
            }
        }
		
		System.out.print("Employee Salary : ");
		while(true)
		{
            salary = sc.nextInt();
            if(salary >= 25000 && salary <= 50000)
			{
                break;
            }
			else
			{
                System.out.println("Invalid Monthly Salary");
                System.out.print("Employee Salary (between 25000 and 50000): ");
            }
        }
		
		System.out.print("Employee Mobile Number: ");
		sc.nextLine();
		while(true)
		{
			mobileNumber = sc.nextLine();
            if(mobileNumber.length() != 10)
			{
                System.out.println("Invalid Mobile Number! Please enter 10 digit mobile number.");
                System.out.print("Employee Mobile Number: ");
            } 
			else
			{
                break;
            } 
        }
		
		System.out.print("Employee Department : ");
		while(true)
		{
            department = sc.nextLine();
            if(department.equalsIgnoreCase("Finance") || department.equalsIgnoreCase("Marketing") || department.equalsIgnoreCase("IT") || department.equalsIgnoreCase("Production"))
			{
                break;
            }
			else
			{
                System.out.println("Invalid department! Department should be either Finance, Marketing, IT, or Production.");
                System.out.print("Employee Department: ");
            }
        }
		System.out.println();
		System.out.println("EMPLOYEE SUCCESSFULLY ADDED");
	}
	
	void viewAll()   //FOR PRINTING EMPLOYEE DETAILS
	{
		System.out.println("Name of Employee : "+name+" ,"+" Id : "+id+" ,"+" Age : "+age+" ,"+" Monthly Salary : "+salary+" ,"+" Department : "+department+" ,"+" Mobile Number : "+mobileNumber);
	}
	
	void searchId(Employee E1[] , int employeeCount)   //SEARCHING EMPLOYEE DETAILS USING ID
	{
		System.out.println();	
		System.out.print("Enter The Employee Id you want to search for : ");
 	    String Sid = sc.nextLine();
		for(int i = 0 ; i < employeeCount ; i++)
		{
		    if(Sid.equalsIgnoreCase(E1[i].id))
		    {
				System.out.println("Details of Searched Employee");
				System.out.println();						
				E1[i].viewAll();
		    }
	    }
    }
	
	void generateSalary(Employee E6[] ,int employeeCount)  //GENERATE EMPLOEYEE SALARY USING ID
	{
		System.out.print("Enter Employee ID to calculate salary : ");
		String id3 = sc.nextLine();
        int basicSalary = 0;
        int hra = 0;
        int da = 0;
        int pf = 0;
        int netSalary = 0;
		for(int i = 0 ; i < employeeCount ; i++)
		{
			if(id3.equalsIgnoreCase(E6[i].id))
			{
				basicSalary = E6[i].salary;
				hra = (int)(0.2 * basicSalary);
                da = (int)(0.1 * basicSalary);
                pf = (int)(0.05 * basicSalary);
                netSalary = basicSalary + hra + da - pf;
			}
		}
		System.out.println();
		System.out.println("The Net Salary of Employee is : "+netSalary);
	}
	
	void removeEmployee(int index , Employee E4[] ,int employeeCount)  //REMOVE EMPLOYEE USING INDEX
	{
		for(int i =  index ; i < employeeCount-1 ; i++)
		{
			E4[i] = E4[i+1];
		}
		E4[employeeCount-1] = null;
    }
	
	void searchName(Employee E3[] , int employeeCount)   //SEARCHING EMPLOYEE DETAILS USING NAME
	{
	    System.out.println();
		System.out.print("Enter The Employee Name You Want to search for : ");
		String Sname = sc.nextLine();
		for(int i = 0 ; i < employeeCount ; i++)
		{
			if(Sname.equalsIgnoreCase(E3[i].name))
			{
				System.out.println("Details of Searched Employee");
			    System.out.println();						
				E3[i].viewAll();
			}
		}
	}
	
	void viewByDepartment(Employee E5[] , String Department[] , int employeeCount)  //VIEW EMPLOYEES DEPARTMENT WISE
	{
		String SDepartment;
		System.out.print("Enter The Department to see all Employees in it : ");
		while(true)
		{
		SDepartment = sc.nextLine();
		if(SDepartment.equalsIgnoreCase("Finance") || SDepartment.equalsIgnoreCase("Marketing") || SDepartment.equalsIgnoreCase("IT") || SDepartment.equalsIgnoreCase("Production"))
			{
                break;
            }
			else
			{
                System.out.println("Invalid department! Department should be either Finance, Marketing, IT, or Production.");
                System.out.print("Employee Department: ");
            }
		}
		System.out.println("");		
		System.out.println("The Employees in Serached Department are");		
		for(int i = 0 ; i < employeeCount ; i++)
		{
			if(E5[i].department.equalsIgnoreCase(SDepartment))
			{
				E5[i].viewAll();
				System.out.println();
			}
		}
	}
	
	
	void modify(String id1 , Employee E2[] , int employeeCount)  //MODFIY EMPLOYEE DETALILS USING ID
	{
		for(int i = 0 ; i < employeeCount ; i++)
		{
			if(id1.equalsIgnoreCase(E2[i].id))
			{
				System.out.print("Enter The Name of Employee : ");
				E2[i].name = sc.nextLine();
				
				System.out.print("Enter The Id of Employee : ");
                E2[i].id = sc.nextLine();
				
				System.out.print("Enter The Age of Employee : ");
				while(true)
		        {
                    E2[i].age = sc.nextInt();
                    if(E2[i].age >= 18 && E2[i].age <= 60)
			        {
                        break;
                    }
			        else
			        {
                        System.out.println("Invalid age! Age should be between 18 and 60. Please try again.");
                        System.out.print("Enter Employee Age (between 18 and 60): ");
                    }
                }
				
				System.out.print("Enter The Salary of Employee : ");
		        while(true)
		        {
                    E2[i].salary = sc.nextInt();
                    if(E2[i].salary >= 25000 && E2[i].salary <= 50000)
		 	        {
                        break;
                    }
			        else
			        {
                        System.out.println("Invalid Monthly Salary");
                        System.out.print("Enter Employee Age (between 25000 and 50000): ");
                    }
                }
				
                System.out.print("Enter Employee Mobile Number: ");
		        sc.nextLine();
		        while(true)
		        {
			        mobileNumber = sc.nextLine();
                    if(mobileNumber.length() != 10)
			        {
                        System.out.println("Invalid Mobile Number! Please enter 10 digit mobile number.");
                        System.out.print("Enter Employee Mobile Number: ");
                    } 
			        else
		 	        {
                        break;
                    } 
                }
				
				System.out.print("Enter  Employee Department : ");
		        while(true)
		        {
                    E2[i].department = sc.nextLine();
                    if(E2[i].department.equalsIgnoreCase("Finance") || E2[i].department.equalsIgnoreCase("Marketing") || E2[i].department.equalsIgnoreCase("IT") || E2[i].department.equalsIgnoreCase("Production"))
					{
                        break;
                    }
			        else
			        {
                        System.out.println("Invalid department! Department should be either Finance, Marketing, IT, or Production.");
                        System.out.print("Enter Employee Department: ");
				  	    System.out.println();			
                    }
                }				
                System.out.println("Employee Details Successfully Modified");				
			}
		}
	}
}
	
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("-------EMPLOYEE MANAGEMENT SYSTEM-------");
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("Enter Number of Employees in Your Organization");
	    final int max_employees = sc.nextInt();
		Employee E[] = new Employee[max_employees];
		String[] Department = {"Finance" , "Marketing" , "IT" , "Production"};
		int employeeCount = 0;
		while(true)
		{
			System.out.println();
			System.out.println("PLEASE CHOOSE ONE OPTION TO PROCEED");
			System.out.println("1) Add Employee Details");
		    System.out.println("2) View All Employee Details");
			System.out.println("3) Remove Employee Details");
			System.out.println("4) Modify Employee Details");
			System.out.println("5) Search Employee using Id");
			System.out.println("6) Search Employee using Name");
			System.out.println("7) View Employees in a Particular Department");
			System.out.println("8) Generate Salary of an Employee");
			System.out.println("9) Exit");
            int option = sc.nextInt();
			switch(option)
			{
				case 1:
				if(employeeCount < max_employees)
				{
                    E[employeeCount] = new Employee();
                    System.out.println();
                    System.out.println("Enter Details of Employee "+(employeeCount+1));
                    System.out.println();
                    E[employeeCount].addEmployee();
                    employeeCount++;
                }           
	            else
				{
                    System.out.println("Employee database is full , cannot add more employees.");
                }
				break;
				case 2:
				for(int i = 0 ; i < employeeCount ; i++)
				{
					System.out.println("");
					System.out.println("Details of Employee "+(i+1));
					E[i].viewAll();
				}
				break;
				
				case 3:
				Employee E4 = new Employee();
				System.out.print("Enter The index of Employee You want to remove : ");
                int index = sc.nextInt();
                E4.removeEmployee(index , E , employeeCount);				
				break;
				
				case 4:
				Employee E2 = new Employee();
				System.out.print("Enter The id of Employee You want to modify details of : ");
				sc.nextLine();
				String id1 = sc.nextLine();
				E2.modify(id1 , E , employeeCount);
				break;
				
				case 5:
				Employee E1 = new Employee();
				E1.searchId(E , employeeCount);
				break;
				
				case 6:
				Employee E3 = new Employee();
				E3.searchName(E , employeeCount);
				break;
				
				case 7:
				Employee E5 = new Employee();
				E5.viewByDepartment(E , Department , employeeCount);
				break;
				
				case 8:
				Employee E6 = new Employee();
				E6.generateSalary(E , employeeCount);
				break;
				
				case 9:
				System.out.println("EXITING PROGRAM....");
				System.exit(0);
				break;
				
				default:
				System.out.println("Enter Vaild Choice");
			    break;
			}
			
	    }

	}
}