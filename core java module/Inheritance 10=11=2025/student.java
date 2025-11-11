class Student
{
	int FBID;
	String name;
	int distance;
	static int count=0;
	Student()
	{
		System.out.println(" default constructor is called");
		this.FBID=02;
		this.name="Sarvesh";
		this.distance=10000;
		count++;
		
	}
	Student(int i,String s,int p)
	{
		System.out.println(" parameterized constructor is called");

		this.FBID=i;
		this.name=s;
		this.distance=p;
		count++;
		
	}	

	void setFBID(int i)
	{
		this.FBID=i;
	}
	void setName(String str)
	{
		this.name=str;
	}
	void setDistance(int d)
	{
		this.distance=d;
	}

	int getFBID()
	{
		return this.FBID;
	}
	String getName()
	{
		return this.name;
	}
	int getDistance()
	{
		return this.distance;
	}
	static int getCount()
	{
		 return count;
	}
	void display()
	{
		System.out.println("FBID is"+this.FBID);
		System.out.println("Name is"+this.name);
		System.out.println("Distace is"+this.distance);
		
	}
}
class PlacedStudent extends Student
{
		
		String companyname;
		PlacedStudent()
		{
			super();
			this.companyname="Infosys";
			System.out.println(" default constructor is called");
		}
		PlacedStudent(int i,String s,int p,String c)
		{
			super(i,s,p);
			this.companyname=c;
			System.out.println(" parameterized constructor is called");
		}
		void setCompanyName(String s)
		{
			this.companyname=s;
		}

		String getCompanyName()
		{
			return this.companyname;
		}
		void display()
		{
		super.display();	
		System.out.println("Company Name is"+this.companyname);

		
		}
	}

class Test
{
	public static void main(String [] args)
	{
		Student s1=new Student();
		System.out.println("Student Count is: "+Student.getCount());
		Student s2=new Student();
		System.out.println("Student Count is: "+Student.getCount());


						

		PlacedStudent p1=new PlacedStudent();
		System.out.println("Student Count is: "+Student.getCount());

		PlacedStudent p2=new PlacedStudent(102,"swastik",10,"Infosys");
		System.out.println("Student Count is " + Student.getCount());
		PlacedStudent p3=new PlacedStudent(102,"swastik",10,"Infosys");
		System.out.println("Student Count is: "+Student.getCount());

		
		
		
				
	}
}



 


