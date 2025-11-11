class Farm
{
	int payment;
	static int count=0;
	Farm()
	{
		System.out.println(" default constructor is called");
		this.payment=5000;
		count++;
	}
	Farm(int i)
	{
		System.out.println(" parameterized constructor is called");

		this.payment=i;
		count++;
	}
	void setPayment(int i)
	{
		this.payment=i;
	}
	int getPayment()
	{
		return this.payment;
	}
	static int getCount()
	{
		return count;
	}
	void display()
	{
		System.out.println("Payment is "+this.payment);
	}
}
class Worker extends Farm
{
	int wid;
	String name;
	Worker()
	{
		
		super();
		this.wid=11;
		this.name="Shubham";
		System.out.println(" default constructor is called");
		
	}
	Worker(int i,int d,String v)
	{
		super(i);
		this.wid=d;
		this.name=v;
		System.out.println(" parameterized constructor is called");

	}

	void setwid(int c)
	{
		this.wid=c;
	}
	void setname(String e)
	{
		this.name=e;
	}
	int getwid()
	{
		return this.wid;
	}
	String getname()
	{
		return this.name;
	}
	void display()
	{
		super.display();
		System.out.println("Worker ID  is"+this.wid);
		System.out.println("Worker Name  is"+this.name);
	}
		


}
class Fertilizer extends Farm
{
	String Ftype;
	int weight;
	
	Fertilizer()
	{
		
		super();
		this.Ftype="Urea";
		this.weight=45;
		System.out.println(" default constructor is called");
		
	}
	Fertilizer(int i,String d,int v)
	{
		super(i);
		this.Ftype=d;
		this.weight=v;
		System.out.println(" parameterized constructor is called");

	}

	void setFtype(String c)
	{
		this.Ftype=c;
	}
	void setweight(int e)
	{
		this.weight=e;
	}
	String getFtype()
	{
		return this.Ftype;
	}
	int getweight()
	{
		return this.weight;
	}
	void display()
	{
		super.display();
		System.out.println("Fertilizer Type type is"+this.Ftype);
		System.out.println("Weight is"+this.weight);
	}
		
}
class Test
{

	public static void main(String [] args)
	{
		Farm e1=new Farm();
		System.out.println("Farm Count is: "+Farm.getCount());
		

		Worker h1=new Worker();
		System.out.println("Worker Count is: "+Farm.getCount());
		h1.display();

		Fertilizer s1=new Fertilizer();
		System.out.println("Fertilizer Bag Count is: "+Farm.getCount());	
	}
}






