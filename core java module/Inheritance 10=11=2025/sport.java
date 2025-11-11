class Sport
{
	int jerseyno;
	String pname;
	int age;
	static int count=0;
	Sport()
	{
		System.out.println(" default constructor is called");
		this.jerseyno=02;
		this.pname="Sarvesh";
		this.age=10000;
		count++;
		
	}
	Sport(int i,String s,int p)
	{
		System.out.println(" parameterized constructor is called");

		this.jerseyno=i;
		this.pname=s;
		this.age=p;
		count++;
		
	}


	void setJerseyno(int i)
	{
		this.jerseyno=i;
	}
	void setPname(String str)
	{
		this.pname=str;
	}
	void setAge(int d)
	{
		this.age=d;
	}
	int getJerseyno()
	{
		return this.jerseyno;
	}
	String getName()
	{
		return this.pname;
	}
	int getAge()
	{
		return this.age;
	}
	static int getCount()
	{
		 return count;
	}

	
	void display()
    {
    	System.out.println("Jersey No is"+this.jerseyno);
	System.out.println("Player Name is"+this.pname);
	System.out.println("Age is"+this.age);
	
     }

}
class Cricket extends Sport
{
	String Ptype;
	int position;
	Cricket()
	{
		
		super();
		this.Ptype="Batsman";
		this.position=2;
		System.out.println(" default constructor is called");
		
	}
	Cricket(int i,String s,int p,String d,int v)
	{
		super(i,s,p);
		this.Ptype=d;
		this.position=v;
		System.out.println(" parameterized constructor is called");

	}

	void setPtype(String c)
	{
		this.Ptype=c;
	}
	void setposition(int e)
	{
		this.position=e;
	}
	String getPtype()
	{
		return this.Ptype;
	}
	int getPosition()
	{
		return this.position;
	}
	void display()
	{
		super.display();
		System.out.println("Player type is"+this.Ptype);
		System.out.println("Position  is"+this.position);
	}
		


}
class Test
{

	public static void main(String [] args)
	{
		Sport e1=new Sport();
		System.out.println("Sport Count is: "+Sport.getCount());
		

		Cricket h1=new Cricket();
		System.out.println("Sport Count is: "+Sport.getCount());
		Cricket h2=new Cricket(07,"Mahendrasing Dhoni",44,"Batsman",6);
		System.out.println("Sport Count is: "+Sport.getCount());
		h2.display();

	}
}












