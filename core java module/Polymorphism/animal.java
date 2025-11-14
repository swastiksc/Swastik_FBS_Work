class Animal
{
    String name;
    int age;
    static int count = 0;
    Animal()
    {
        System.out.println("Default constructor of Animal called");
        this.name = "Unknown Animal";
        this.age = 1;
        count++;
    }

    Animal(String n, int a)
    {
        System.out.println("Parameterized constructor of Animal called");
        this.name = n;
        this.age = a;
        count++;
    }
    void setName(String n)        
    { 
	this.name = n; 
    }
    void setAge(int a)            
    { 
	this.age = a; 
    }

    String getName()              
    { 
	return this.name; 
    }
    int getAge()                  
    { 
	return this.age; 
    }

    static int getCount()         
    {
	 return count; 
    }
    String sound()
    {
        return "Animal makes a sound";
    }

    void display()
    {
        System.out.println("Animal Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
class Dog extends Animal
{
    private String breed;

    Dog()
    {
        super();
        this.breed = "Mixed Breed";
        System.out.println("Default constructor of Dog called");
    }

    Dog(String n, int a, String b)
    {
        super(n, a);
        this.breed = b;
        System.out.println("Parameterized constructor of Dog called");
    }
    void setBreed(String b)    
    { 
	this.breed = b; 
    }
    String getBreed()          
    { 
	return this.breed; 
    }
    String sound()
    {
        return "Dog barks!";
    }

    void display()
    {
        super.display();
        System.out.println("Breed: " + this.breed);
    }
}

class Cat extends Animal
{
    private String color;

    Cat()
    {
        super();
        this.color = "White";
        System.out.println("Default constructor of Cat called");
    }

    Cat(String n, int a, String c)
    {
        super(n, a);
        this.color = c;
        System.out.println("Parameterized constructor of Cat called");
    }

    void setColor(String c)      
    { 
	this.color = c; 
    }
    String getColor()            
    { 
	return this.color; 
    }

    String sound()
    {
        return "Cat meows!";
    }

    void display()
    {
        super.display();
        System.out.println("Color: " + this.color);
    }
}

class Lion extends Animal
{
    private String area;

    Lion()
    {
        super();
        this.area = "Forest";
        System.out.println("Default constructor of Lion called");
    }

    Lion(String n, int a, String ar)
    {
        super(n, a);
        this.area = ar;
        System.out.println("Parameterized constructor of Lion called");
    }

    void setArea(String ar)     
    { 
	this.area = ar; 
    }
    String getArea()            
    { 
	return this.area; 
    }

    String sound()
    {
        return "Lion roars!";
    }

    void display()
    {
        super.display();
        System.out.println("Area: " + this.area);
    }
}
class Test
{
    public static void main(String[] args)
    {
        Animal a;

        a = new Animal();
        System.out.println("\nAnimal Count: " + Animal.getCount());
        a.display();
        System.out.println("Sound: " + a.sound());

        a = new Dog("Tommy", 5, "Labrador");
        System.out.println("\nAnimal Count: " + Animal.getCount());
        a.display();
        System.out.println("Sound: " + a.sound());

        a = new Cat("Kitty", 3, "Black");
        System.out.println("\nAnimal Count: " + Animal.getCount());
        a.display();
        System.out.println("Sound: " + a.sound());

        a = new Lion("Simba", 7, "Katraj Zoo");
        System.out.println("\nAnimal Count: " + Animal.getCount());
        a.display();
        System.out.println("Sound: " + a.sound());
    }
}
