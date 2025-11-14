class Device
{
    String name;
    double price;
    static int count = 0;

    Device()
    {
        System.out.println("Default constructor of Device called");
        this.name = "Generic Device";
        this.price = 5000;
        count++;
    }

    Device(String n, double p)
    {
        System.out.println("Parameterized constructor of Device called");
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

    double calcPrice()
    {
        return price;
    }

    void display()
    {
        System.out.println("Device Name: " + this.name);
        System.out.println("Price: " + this.price);
    }
}


class Mobile extends Device
{
    private int storage;

    Mobile()
    {
        super();
        this.storage = 64;
        System.out.println("Default constructor of Mobile called");
    }

    Mobile(String n, double p, int s)
    {
        super(n, p);
        this.storage = s;
        System.out.println("Parameterized constructor of Mobile called");
    }

    double calcPrice()
    {
        return getPrice() + 1500; // accessories cost
    }

    void setStorage(int s) 
    { 
	this.storage = s; 
    }
    int getStorage() 
    { 
	return this.storage; 
    }

    void display()
    {
        super.display();
        System.out.println("Storage: " + this.storage + " GB");
    }
}


class Laptop extends Device
{
    private String processor;

    Laptop()
    {
        super();
        this.processor = "i3";
        System.out.println("Default constructor of Laptop called");
    }

    Laptop(String n, double p, String proc)
    {
        super(n, p);
        this.processor = proc;
        System.out.println("Parameterized constructor of Laptop called");
    }

    double calcPrice()
    {
        return getPrice() + 5000; // software + service
    }

    void setProcessor(String p) 
    { 
	this.processor = p; 
    }
    String getProcessor() 
    { 
	return this.processor; 
    }

    void display()
    {
        super.display();
        System.out.println("Processor: " + this.processor);
    }
}



class Test
{
    public static void main(String[] args) {

        Device d;

        d = new Device();
        System.out.println("\nDevice Count: " + Device.getCount());
        d.display();
        System.out.println("Calculated Price: " + d.calcPrice());

        d = new Mobile("Samsung Galaxy", 18000, 128);
        System.out.println("\nDevice Count: " + Device.getCount());
        d.display();
        System.out.println("Calculated Price: " + d.calcPrice());

        d = new Laptop("HP Pavilion", 55000, "i5");
        System.out.println("\nDevice Count: " + Device.getCount());
        d.display();
        System.out.println("Calculated Price: " + d.calcPrice());

        }
}

