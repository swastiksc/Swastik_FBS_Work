class Farmer
{
	int farmerid;
	String farmername;
	String city;
	int annualincome;
	int insuranceamt;
	static int count=0;
	Farmer()
	{
		System.out.println(" default constructor is called");
		this.farmerid=2213;
		this.farmername="Swastik";
		this.city="Shirpur";
		this.annualincome=2500000;
		this.insuranceamt=100000;
		count++;
		
	}
	Farmer(int i,String s,String p,int k,int l)
	{
		System.out.println(" parameterized constructor is called");
		this.farmerid=i;
		this.farmername=s;
		this.city=p;
		this.annualincome=k;
		this.insuranceamt=l;
		count++;
	}
	void calsubsidy()
	{
		System.out.println("subsidy taken");
	}
	void setfarmerid(int i)
	{
		this.farmerid=i;
	}
	void setfarmername(String str)
	{
		this.farmername=str;
	}
	void setcity(String d)
	{
		this.city=d;
	}
	void setannualincome(int a)
	{
		this.annualincome=a;
	}
	void setinsuranceamt(int t)
	{
		this.insuranceamt=t;
	}
	int getfarmerid()
	{
		return this.farmerid;
	}
	String getfarmername()
	{
		return this.farmername;
	}
	String getcity()
	{
		return this.city;
	}
	int getinsuranceamt()
	{
		return this.insuranceamt;
	}
	int getannualincome()
	{
		return this.annualincome;
	}
	static int getCount()
	{
		 return count;
	}
	void display()
	{
		System.out.println("farmerid is"+this.farmerid);
		System.out.println("farmername is"+this.farmername);
		System.out.println("city is"+this.city);
		System.out.println("insuranceamt is"+this.insuranceamt);
		System.out.println("annualincome is"+this.annualincome);
	}
}
class DairyFarmer extends Farmer
{
	int noofcattels;
	int milkproperday;
	int dairylicenceno;
	
	DairyFarmer()
	{
		super();
		this.noofcattels=5;
		this.milkproperday=3;
		this.dairylicenceno=10;
		System.out.println(" default constructor is called");

		
	}
	DairyFarmer(int i,String s,String p,int k,int l,int o,int m,int v)
	{
		super(i,s,p,k,l);
		this.noofcattels=o;
		this.milkproperday=m;
		this.dairylicenceno=v;
		System.out.println(" parameterized constructor is called");

	}
	void calsubsidy()
	{
		System.out.println("DairyFarmer subsidy taken");
	}
	
	void setnoofcattels(int i)
	{
		this.noofcattels=i;
	}
	void setmilkproperday(int str)
	{
		this.milkproperday=str;
	}
	void setdairylicenceno(int d)
	{
		this.dairylicenceno=d;
	}
	int getnoofcattels()
	{
		return this.noofcattels;
	}
	int getmilkproperday()
	{
		return this.milkproperday;
	}
	int getdairylicenceno()
	{
		return this.dairylicenceno;
	}
	void display()
	{
		super.display();
		System.out.println("noofcattels is"+this.noofcattels);
		System.out.println("milkproperday is"+this.milkproperday);
		System.out.println("dairylicenceno is"+this.dairylicenceno);
		
	}
}
class PoultryFarmer extends Farmer
{
	int noofchickens;
	int noofshades;
	int eagproducedency;
	
	PoultryFarmer()
	{
		super();
		this.noofchickens=5;
		this.noofshades=3;
		this.eagproducedency=10;
		System.out.println(" default constructor is called");

		
	}
	PoultryFarmer(int i,String s,String p,int k,int l,int o,int m,int v)
	{
		super(i,s,p,k,l);
		this.noofchickens=o;
		this.noofshades=m;
		this.eagproducedency=v;
		System.out.println(" parameterized constructor is called");

	}
	void calsubsidy()
	{
		System.out.println("PoultryFarmer subsidy taken");
	}
	

	void setnoofchickens(int i)
	{
		this.noofchickens=i;
	}
	void setnoofshades(int str)
	{
		this.noofshades=str;
	}
	void seteagproducedency(int d)
	{
		this.eagproducedency=d;
	}
	int getnoofchickens()
	{
		return this.noofchickens;
	}
	int getnoofshades()
	{
		return this.noofshades;
	}
	int geteagproducedency()
	{
		return this.eagproducedency;
	}
	void display()
	{
		super.display();
		System.out.println("noofchickens is"+this.noofchickens);
		System.out.println("noofshades is"+this.noofshades);
		System.out.println("eagproducedency is"+this.eagproducedency);
		
	}
}
class Test
{

	public static void main(String [] args)
	{
		Farmer e1=new Farmer();
		System.out.println("Farmer Count is: "+Farmer.getCount());
		e1.calsubsidy();

		e1=new DairyFarmer();
		System.out.println("Farmer Count is: "+Farmer.getCount());
		e1.display();
		e1.calsubsidy();

		e1=new PoultryFarmer();
		System.out.println("Farmer Count is: "+Farmer.getCount());
		se1.calsubsidy();

		}//main ends here
}//class test ends here

	








 