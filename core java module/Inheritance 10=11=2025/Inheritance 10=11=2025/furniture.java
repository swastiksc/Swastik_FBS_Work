class Furniture 
{
	int furnitureId;
        String material;
        String color;
        double price;
        static int count = 0;
	Furniture() 
	{
        	System.out.println("Default constructor of Furniture called");
        	this.furnitureId = 1001;
        	this.material = "Wood";
        	this.color = "Brown";
        	this.price = 1500.0;
        	count++;
        }
    	Furniture(int furnitureId, String material, String color, double price) 
	{
        	System.out.println("Parameterized constructor of Furniture called");
        	this.furnitureId = furnitureId;
        	this.material = material;
        	this.color = color;
        	this.price = price;
        	count++;
        }
	void setFurnitureId(int id) 
	{ 
		this.furnitureId = id; 
        }
        void setMaterial(String material) 
        { 	
		this.material = material; 
        }
        void setColor(String color) 
	{ 
		this.color = color; 
	}
        void setPrice(double price) 
	{ 
		this.price = price; 
	}

    
      	int getFurnitureId() 
	{ 
		return this.furnitureId; 
	}
        String getMaterial() 
	{ 
		return this.material; 

	}
        String getColor() 
	{ 
		return this.color; 
	}
        double getPrice() 
	{ 
		return this.price; 
	}
	static int getCount() 
	{ 
		return count; 
	}

        void display() 
	{
        	System.out.println("Furniture ID: " + furnitureId);
        	System.out.println("Material: " + material);
        	System.out.println("Color: " + color);
        	System.out.println("Price: ₹" + price);
    	}
}


class Chair extends Furniture 
{
	int noOfLegs;
        boolean hasCushion;
        String chairType;
	Chair() 
	{
        	super();
        	this.noOfLegs = 4;
        	this.hasCushion = true;
        	this.chairType = "Dining Chair";
        	System.out.println("Default constructor of Chair called");
        }

        Chair(int furnitureId, String material, String color, double price, int noOfLegs, boolean hasCushion, String chairType) 
	{
        	super(furnitureId, material, color, price);
        	this.noOfLegs = noOfLegs;
        	this.hasCushion = hasCushion;
        	this.chairType = chairType;
        	System.out.println("Parameterized constructor of Chair called");
        }
	void setNoOfLegs(int n) 
	{ 
		this.noOfLegs = n; 
	}
        void setHasCushion(boolean b) 
	{ 
		this.hasCushion = b; 
	}
    	void setChairType(String s) 
	{ 
		this.chairType = s; 
	}

   	int getNoOfLegs() 
	{ 
		return this.noOfLegs; 
	}
   	boolean getHasCushion() 
	{ 
		return this.hasCushion; 
	}
 	String getChairType() 
	{ 
		return this.chairType; 
	}

    void display() {
        super.display();
        System.out.println("No. of Legs: " + noOfLegs);
        System.out.println("Has Cushion: " + hasCushion);
        System.out.println("Chair Type: " + chairType);
    }
}


// Derived Class 2: Table
class Table extends Furniture {
    int noOfDrawers;
    String shape;
    double height;

    Table() {
        super();
        this.noOfDrawers = 2;
        this.shape = "Rectangle";
        this.height = 3.0;
        System.out.println("Default constructor of Table called");
    }

    Table(int furnitureId, String material, String color, double price, int noOfDrawers, String shape, double height) {
        super(furnitureId, material, color, price);
        this.noOfDrawers = noOfDrawers;
        this.shape = shape;
        this.height = height;
        System.out.println("Parameterized constructor of Table called");
    }

    void setNoOfDrawers(int n) { this.noOfDrawers = n; }
    void setShape(String s) { this.shape = s; }
    void setHeight(double h) { this.height = h; }

    int getNoOfDrawers() { return this.noOfDrawers; }
    String getShape() { return this.shape; }
    double getHeight() { return this.height; }

    void display() {
        super.display();
        System.out.println("No. of Drawers: " + noOfDrawers);
        System.out.println("Shape: " + shape);
        System.out.println("Height: " + height + " feet");
    }
}


// Test Class
class Test {
    public static void main(String[] args) {
        Furniture f1 = new Furniture();
        System.out.println("Furniture Count: " + Furniture.getCount());

        Chair c1 = new Chair(2001, "Plastic", "White", 1200.0, 4, false, "Office Chair");
        System.out.println("Furniture Count: " + Furniture.getCount());
        c1.display();

        Table t1 = new Table(3001, "Wood", "Dark Brown", 3500.0, 3, "Square", 2.8);
        System.out.println("Furniture Count: " + Furniture.getCount());
        t1.display();
    }
}
