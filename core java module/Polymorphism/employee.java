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
	double calsal()
	{
		return salary;
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
	double calsal()
	{
		return salary+commission;
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
	double calsal()
	{
		return salary+incentive;
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
class AreaSalesManager extends SalesManager
{
	String Areaname;
	AreaSalesManager()
	{
		
		super();
		this.Areaname="Warje";
	}
	AreaSalesManager(int i,String s,double p,double d,int v,String x)
	{
		super(i,s,p,d,v);
		this.Areaname=x;
	}
	void setAreaname(String e)
	{
		this.Areaname=e;
	}
	String getAreaname()
	{
		return this.Areaname;
	}
	void display()
	{
		super.display();
		System.out.println("Area Name is"+this.Areaname);
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
	double calsal()
	{
		return salary+allowence;
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

	public static void main1(String [] args)
	{
		Employee e1=new Employee();
		System.out.println("Employee Count is: "+Employee.getCount());
		e1.display();

		Hr h1=new Hr();
		System.out.println("Employee Count is: "+Employee.getCount());
		h1.display();
		
		SalesManager s1=new SalesManager();
		System.out.println("Employee Count is: "+Employee.getCount());
		

		AreaSalesManager a1=new AreaSalesManager();
		System.out.println("Employee Count is: "+Employee.getCount());	
	
		Admin x1=new Admin(101,"pratya",100000,10);
		System.out.println("Employee Count is: "+Employee.getCount());
		
		
	}//main ends here
	public static void main(String [] args)
	{
		Employee e1=new Employee();
		System.out.println("Employee Count is: "+Employee.getCount());
		e1.display();

		e1=new Hr(102,"shubham",1000,50);
		e1.display();

		e1=new SalesManager();
		System.out.println("Employee Count is: "+Employee.getCount());
		e1.display();

		e1=new AreaSalesManager();
		System.out.println("Employee Count is: "+Employee.getCount());	
		e1.display();

		e1=new Admin(101,"pratya",100000,10);
		System.out.println("Employee Count is: "+Employee.getCount());
		e1.display();
		
	}
	

}//class test ends here
