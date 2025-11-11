class Employee
{
	int ID;
	String name;
	double salary;
	static int count=0;
	Employee()
	{
		System.out.println(" default constructor is called");
		this.ID=02;
		this.name="Sarvesh";
		this.salary=10000;
		count++;
		
	}
	Employee(int i,String s,double p)
	{
		System.out.println(" parameterized constructor is called");

		this.ID=i;
		this.name=s;
		this.salary=p;
		count++;
		
	}


	void setID(int i)
	{
		this.ID=i;
	}
	void setName(String str)
	{
		this.name=str;
	}
	void setSalary(double d)
	{
		this.salary=d;
	}
	int getID()
	{
		return this.ID;
	}
	String getName()
	{
		return this.name;
	}
	double getSalary()
	{
		return this.salary;
	}
	static int getCount()
	{
		 return count;
	}

	
	void display()
    {
    	System.out.println("Id is"+this.ID);
	System.out.println("Name is"+this.name);
	System.out.println("Salary is"+this.salary);
	
     }

}//class employee ends here


class Hr extends Employee
{
	double commission;
	Hr()
	{
		
		super();
		this.commission=1500;
		System.out.println(" default constructor is called");
	}
	Hr(int i,String s,double p,double c)
	{
		

		super(i,s,p);
		this.commission=c;
		System.out.println(" parameterized constructor is called");
	}

		

	void setCommission(double c)
	{
		this.commission=c;
	}
	
	double getCommission()
	{
		return this.commission;
	}
	void display()
	{
		super.display();
		System.out.println("Commission is"+this.commission);
	}





}


class SalesManager extends Employee

{
	
	
	double incentive;
	int target;
	SalesManager()
	{
		
		super();
		this.incentive=1500;
		this.target=10;
		System.out.println(" default constructor is called");
		
	}
	SalesManager(int i,String s,double p,double d,int v)
	{
		super(i,s,p);
		this.incentive=d;
		this.target=v;
		System.out.println(" parameterized constructor is called");

	}

	void setIncentive(double c)
	{
		this.incentive=c;
	}
	void setTarget(int e)
	{
		this.target=e;
	}
	double getIncentive()
	{
		return this.incentive;
	}
	int getTarget()
	{
		return this.target;
	}
	void display()
	{
		super.display();
		System.out.println("Incentive is"+this.incentive);
		System.out.println("target is"+this.target);
	}
		


}

class Admin extends Employee

{
	
	double allowence;
	Admin()
	{
		super();
		this.allowence=1500;
		System.out.println(" default constructor is called");
	}
	Admin(int i,String s,double p,double a)
	{
		
		super(i,s,p);
		this.allowence=a;
		System.out.println(" parameterized constructor is called");
		
	}

	void setAllowence(double c)
	{
		this.allowence=c;
	}
	double getAllowence()
	{
		 return this.allowence;
	}
	void display()
	{
		super.display();
		System.out.println("allowence is"+this.allowence);
	}




}
class Test
{

	public static void main(String [] args)
	{
		Employee e1=new Employee();
		System.out.println("Employee Count is: "+Employee.getCount());
		

		Hr h1=new Hr();
		System.out.println("Employee Count is: "+Employee.getCount());

		SalesManager s1=new SalesManager();
		System.out.println("Employee Count is: "+Employee.getCount());	

		Admin a1=new Admin(101,"pratya",100000,10);
		System.out.println("Employee Count is: "+Employee.getCount());
		a1.display();
	}//main ends here
}//class test ends here
