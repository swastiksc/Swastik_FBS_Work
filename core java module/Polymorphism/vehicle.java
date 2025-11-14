class Vehicle
{
	String colour;
	String model;
	String brand;
	int price;
	int feulcapacity;
	int breake;
	static int count=0;
	Vehicle()
	{
		this.colour="red";
		this.model="Top";
		this.brand="Tata";
		this.price=700000;
		this.feulcapacity=60;
		count++;
	}
	Vehicle(String s,String g,String b,int i,int p)
	{
		this.colour=s;
		this.model=g;
		this.brand=b;
		this.price=i;
		this.feulcapacity=p;
		count++;
	}
	void breake()
	{
		System.out.println("Break Applied");
	}
	void setColour(String s)
	{
		this.colour=s;
	}
	void setModel(String g)
	{
		this.model=g;
	}
	void setBrand(String b)
	{
		this.brand=b;
	}
	void setPrice(int i)
	{
		this.price=i;
	}
	void setFeulcapacity(int p)
	{
		this.feulcapacity=p;
	}
	String getColour()
	{
		return this.colour;
	}
	String getModel()
	{
		return this.model;
	}
	String getBrand()
	{
		return this.brand;
	}
	int getPrice()
	{
		return this.price;
	}	
	int getFeulcapacity()
	{
		return this.feulcapacity;
	}
	static int getCount()
	{
		return count;
	}
	void display()
	{
		System.out.println("Colour is"+this.colour);
		System.out.println("Model is"+this.model);
		System.out.println("Brand is"+this.brand);
		System.out.println("Price is"+this.price);
		System.out.println("Feulcapacity is"+this.feulcapacity);
	}
}
class Car extends Vehicle
{
	String airbag;
	String AC;
	Car()
	{
		super();
		this.airbag="yes";
		this.AC="no";

	}
	Car(String s,String g,String b,int i,int p,String a,String f)
	{
		super(s,g,b,i,p);
		this.airbag=a;
		this.AC=f;
	}
	void breake()
	{
		System.out.println("Drum Break Applied");
	}

	void setAirbag(String i)
	{
		this.airbag=i;
	}
	void setAC(String p)
	{
		this.AC=p;
	}
	String getAirbag()
	{
		return this.airbag;
	}
	String getAC()
	{
		return this.AC;
	}
	void display()
	{
		super.display();
		System.out.println("Airbag is"+this.airbag);
		System.out.println("AC is"+this.AC);
	}
}
class Tractor extends Vehicle
{
	int hp;
	int PTORPM;
	Tractor()
	{
		super();
		this.hp=65;
		this.PTORPM=550;

	}
	Tractor(String s,String g,String b,int i,int p,int h,int k)
	{
		super(s,g,b,i,p);
		this.hp=h;
		this.PTORPM=k;
	}
	void breake()
	{
		System.out.println("Oil Break Applied");
	}

	void setHp(int i)
	{
		this.hp=i;
	}
	void setPTORPM(int p)
	{
		this.PTORPM=p;
	}
	int getHp()
	{
		return this.hp;
	}
	int getPTORPM()
	{
		return this.PTORPM;
	}
	void display()
	{
		super.display();
		System.out.println("HP is"+this.hp);
		System.out.println("PTORPM is"+this.PTORPM);
	}
}
class Test
{

	public static void main(String [] args)
	{
		Vehicle e1=new Vehicle();
		System.out.println("Vehicle Count is: "+Vehicle.getCount());
		e1.breake();

		Car h1=new Car();
		System.out.println("Vehicle Count is: "+Vehicle.getCount());
		h1.breake();

		Tractor s1=new Tractor("Red","Top","Mahindra",780000,60,65,650);
		System.out.println("Vehicle Count is: "+Vehicle.getCount());
		s1.display();
		s1.breake();
	}
}





	