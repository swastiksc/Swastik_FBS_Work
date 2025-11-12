class Defence
{
	String nameofhead;
	int noofdept;
	String countryname;
	int manpowercount;
	int noofmissionperformed;
	static int count=0;
	Defence()
	{
		System.out.println(" default constructor is called");
		this.nameofhead="Rajendra";
		this.noofdept=3;
		this.countryname="India";
		this.manpowercount=20;
		this.noofmissionperformed=5;
		count++;
		
	}
	Defence(String i,int s,String p,int k,int l)
	{
		System.out.println(" parameterized constructor is called");
		this.nameofhead=i;
		this.noofdept=s;
		this.countryname=p;
		this.manpowercount=k;
		this.noofmissionperformed=l;
		count++;
	}
	void setnameofhead(String i)
	{
		this.nameofhead=i;
	}
	void setnoofdept(int str)
	{
		this.noofdept=str;
	}
	void setcountryname(String d)
	{
		this.countryname=d;
	}
	void setmanpowercount(int a)
	{
		this.manpowercount=a;
	}
	void noofmissionperformed(int t)
	{
		this.noofmissionperformed=t;
	}
	String getnameofhead()
	{
		return this.nameofhead;
	}
	int getnoofdept()
	{
		return this.noofdept;
	}
	String getcountryname()
	{
		return this.countryname;
	}
	int getmanpowercount()
	{
		return this.manpowercount;
	}
	int getnoofmissionperformed()
	{
		return this.noofmissionperformed;
	}
	static int getCount()
	{
		 return count;
	}
	void display()
	{
		System.out.println("nameofhead is"+this.nameofhead);
		System.out.println("noofdept is"+this.noofdept);
		System.out.println("countryname is"+this.countryname);
		System.out.println("manpowercount is"+this.manpowercount);
		System.out.println("noofmissionperformed is"+this.noofmissionperformed);
	}
}
class Army extends Defence
{
	int nooftank;
	int noofgun;
	int noofgranade;
	
	Army()
	{
		super();
		this.nooftank=5;
		this.noofgun=3;
		this.noofgranade=10;
		System.out.println(" default constructor is called");

		
	}
	Army(String i,int s,String p,int k,int l,int o,int m,int v)
	{
		super(i,s,p,k,l);
		this.nooftank=o;
		this.noofgun=m;
		this.noofgranade=v;
		System.out.println(" parameterized constructor is called");

	}
	void setnooftank(int i)
	{
		this.nooftank=i;
	}
	void setnoofgun(int str)
	{
		this.noofdept=str;
	}
	void setnoofgranade(int d)
	{
		this.noofgranade=d;
	}
	int getnooftank()
	{
		return this.nooftank;
	}
	int getnoofgun()
	{
		return this.noofgun;
	}
	int getnoofgranade()
	{
		return this.noofgranade;
	}
	void display()
	{
		super.display();
		System.out.println("nooftank is"+this.nooftank);
		System.out.println("noofgun is"+this.noofgun);
		System.out.println("noofgranade is"+this.noofgranade);
		
	}
}
class Navy extends Defence
{
	int noofship;
	int noofsubmariens;
	int nooftorpedoes;
	
	Navy()
	{
		super();
		this.noofship=5;
		this.noofsubmariens=3;
		this.nooftorpedoes=10;
		System.out.println(" default constructor is called");

		
	}
	Navy(String i,int s,String p,int k,int l,int o,int m,int v)
	{
		super(i,s,p,k,l);
		this.noofship=o;
		this.noofsubmariens=m;
		this.nooftorpedoes=v;
		System.out.println(" parameterized constructor is called");

	}
	void setnoofship(int i)
	{
		this.noofship=i;
	}
	void setnoofsubmariens(int str)
	{
		this.noofdept=str;
	}
	void setnooftorpedoes(int d)
	{
		this.nooftorpedoes=d;
	}
	int getnoofship()
	{
		return this.noofship;
	}
	int getnoofsubmariens()
	{
		return this.noofsubmariens;
	}
	int getnooftorpedoes()
	{
		return this.nooftorpedoes;
	}
	void display()
	{
		super.display();
		System.out.println("noofship is"+this.noofship);
		System.out.println("noofsubmariens is"+this.noofsubmariens);
		System.out.println("nooftorpedoes is"+this.nooftorpedoes);
		
	}
}
class Air extends Defence
{
	int noofmissile;
	int noofsquadron;
	
	
	Air()
	{
		super();
		this.noofmissile=5;
		this.noofsquadron=3;
		
		System.out.println(" default constructor is called");

		
	}
	Air(String i,int s,String p,int k,int l,int o,int z,int m)
	{
		super(i,s,p,k,l);
		this.noofmissile=z;
		this.noofsquadron=m;
		
		System.out.println(" parameterized constructor is called");

	}
	void setnoofmissile(int i)
	{
		this.noofmissile=i;
	}
	void setnoofsquadron(int str)
	{
		this.noofsquadron=str;
	}
	int getnoofmissile()
	{
		return this.noofmissile;
	}
	int getnoofsquadron()
	{
		return this.noofsquadron;
	}
	void display()
	{
		super.display();
		System.out.println("noofmissile is"+this.noofmissile);
		System.out.println("noofsquadron is"+this.noofsquadron);

		
	}
}

class Test
{

	public static void main(String [] args)
	{
		Defence e1=new Defence();
		System.out.println("Defence Count is: "+Defence.getCount());
		

		Army h1=new Army();
		System.out.println("Defence Count is: "+Defence.getCount());

		Navy s1=new Navy();
		System.out.println("Defence Count is: "+Defence.getCount());

		Air a1=new Air();
		System.out.println("Defence Count is: "+Defence.getCount());
		a1.display();
	}//main ends here
}//class test ends here










 