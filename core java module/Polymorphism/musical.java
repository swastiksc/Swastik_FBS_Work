class MusicalInstrument
{
	String name;
        double price;
        static int count = 0;

        MusicalInstrument() 
	{
        	System.out.println("Default constructor of MusicalInstrument called");
        	this.name = "Generic Instrument";
        	this.price = 1000;
        	count++;
   	}

   
    	MusicalInstrument(String n, double p) 
	{
        	System.out.println("Parameterized constructor of MusicalInstrument called");
        	this.name = n;
        	this.price = p;
        	count++;
        }
	void setName(String n) 
	{ 
		this.name = n; 
	}
        void setPrice(double p) 
	{ 
		this.price = p; 
	}
   	String getName() 
	{ 
		return this.name; 
	}
        double getPrice() 
	{ 
		return this.price; 
	}

        static int getCount() 
	{
        	return count;
        }

    // Method to calculate price 
   	double calcPrice() 
	{
        	return price;
        }

   
        void display() 
	{
        	System.out.println("Instrument Name: " + this.name);
        	System.out.println("Price: " + this.price);
    	}
}

class Guitar extends MusicalInstrument
{
	private int numberOfStrings;

    	Guitar() 
	{
        	super();
        	this.numberOfStrings = 6;
        	System.out.println("Default constructor of Guitar called");
    	}

    	Guitar(String n, double p, int s) 
	{
        	super(n, p);
        	this.numberOfStrings = s;
        	System.out.println("Parameterized constructor of Guitar called");
    	}

        double calcPrice() 
	{
        	return getPrice() + 500; // extra tuning cost
    	}

        void setNumberOfStrings(int s) 
	{ 	
		this.numberOfStrings = s; 
	}
    	int getNumberOfStrings() 
	{ 
		return this.numberOfStrings; 
	}

    	void display() 
	{
        	super.display();
        	System.out.println("Number of Strings: " + this.numberOfStrings);
   	}
}

class Piano extends MusicalInstrument
{
	private int keys;

    	Piano() 
	{
        	super();
        	this.keys = 88;
        	System.out.println("Default constructor of Piano called");
    	}

   	Piano(String n, double p, int k) 
	{
        	super(n, p);
        	this.keys = k;
        	System.out.println("Parameterized constructor of Piano called");
    	}

    	double calcPrice() 
	{
        	return getPrice() + 2000; // tuning and maintenance cost
    	}

    	void setKeys(int k) 
	{ 
		this.keys = k; 
	}
    	int getKeys() 
	{ 
		return this.keys; 
	}

    	void display() 
	{
        	super.display();
        	System.out.println("Keys: " + this.keys);
    	}
}

class Drum extends MusicalInstrument
{
	private String type;

   	Drum() 
	{
        	super();
        	this.type = "Acoustic";
        	System.out.println("Default constructor of Drum called");
    	}

    	Drum(String n, double p, String t) 
	{
        	super(n, p);
        	this.type = t;
        	System.out.println("Parameterized constructor of Drum called");
    	}

    	double calcPrice() 
	{
        	return getPrice() + 800; // accessories cost
    	}

    	void setType(String t) 
	{ 
		this.type = t; 
	}
    	String getType() 
	{ 
		return this.type; 
	}

    	void display() 
	{
        	super.display();
        	System.out.println("Type: " + this.type);
    	}
}

class Test
{
    public static void main(String[] args) {
        
        MusicalInstrument mi;

        mi = new MusicalInstrument();
        System.out.println("\nInstrument Count: " + MusicalInstrument.getCount());
        mi.display();
        System.out.println("Calculated Price: " + mi.calcPrice());
        

        mi = new Guitar("Fender Stratocaster", 50000, 6);
        System.out.println("\nInstrument Count: " + MusicalInstrument.getCount());
        mi.display();
        System.out.println("Calculated Price: " + mi.calcPrice());
        

        mi = new Piano("Yamaha Grand", 200000, 88);
        System.out.println("\nInstrument Count: " + MusicalInstrument.getCount());
        mi.display();
        System.out.println("Calculated Price: " + mi.calcPrice());

        mi = new Drum("Tama Drum Set", 75000, "Acoustic");
        System.out.println("\nInstrument Count: " + MusicalInstrument.getCount());
        mi.display();
        System.out.println("Calculated Price: " + mi.calcPrice());
        

       }
}
