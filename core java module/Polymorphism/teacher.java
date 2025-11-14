class Teacher
{
    String name;
    double salary;
    static int count = 0;

    Teacher()
    {
        System.out.println("Default constructor of Teacher called");
        this.name = "Unknown Teacher";
        this.salary = 20000;
        count++;
    }

    Teacher(String n, double s)
    {
        System.out.println("Parameterized constructor of Teacher called");
        this.name = n;
        this.salary = s;
        count++;
    }

    void setName(String n)          
    { 
	this.name = n; 
    }
    void setSalary(double s)        
    { 
  	this.salary = s; 
    }

    String getName()                
    { 
	return this.name; 
    }
    double getSalary()              
    { 
	return this.salary; 
    }

    static int getCount()           
    { 
	return count; 
    }
    double calcSalary()
    {
        return salary;
    }

    void display()
    {
        System.out.println("Teacher Name: " + this.name);
        System.out.println("Base Salary: " + this.salary);
    }
}

class MathTeacher extends Teacher
{
    private int expYears;

    MathTeacher()
    {
        super();
        this.expYears = 1;
        System.out.println("Default constructor of MathTeacher called");
    }

    MathTeacher(String n, double s, int e)
    {
        super(n, s);
        this.expYears = e;
        System.out.println("Parameterized constructor of MathTeacher called");
    }
    void setExpYears(int e)       
    { 
	this.expYears = e; 
    }
    int getExpYears()             
    { 
	return this.expYears; 
    }
    double calcSalary()
    {
        return getSalary() + (expYears * 1000);  // experience bonus
    }

    void display()
    {
        super.display();
        System.out.println("Experience Years: " + this.expYears);
    }
}

class ScienceTeacher extends Teacher
{
    private boolean labIncharge;

    ScienceTeacher()
    {
        super();
        this.labIncharge = false;
        System.out.println("Default constructor of ScienceTeacher called");
    }

    ScienceTeacher(String n, double s, boolean l)
    {
        super(n, s);
        this.labIncharge = l;
        System.out.println("Parameterized constructor of ScienceTeacher called");
    }

    void setLabIncharge(boolean l)     
    { 
	this.labIncharge = l; 
    }
    boolean getLabIncharge()           
    { 
	return this.labIncharge; 
    }

    double calcSalary()
    {
        return getSalary() + (labIncharge ? 3000 : 0);
    }

    void display()
    {
        super.display();
        System.out.println("Lab Incharge: " + (labIncharge ? "Yes" : "No"));
    }
}

class EnglishTeacher extends Teacher
{
    private int grammarLevel;

    EnglishTeacher()
    {
        super();
        this.grammarLevel = 1;
        System.out.println("Default constructor of EnglishTeacher called");
    }

    EnglishTeacher(String n, double s, int g)
    {
        super(n, s);
        this.grammarLevel = g;
        System.out.println("Parameterized constructor of EnglishTeacher called");
    }

    void setGrammarLevel(int g)      
    { 
	this.grammarLevel = g; 
    }
    int getGrammarLevel()             
    { 
	return this.grammarLevel; 
    }

    double calcSalary()
    {
        return getSalary() + (grammarLevel * 1500);
    }

    void display()
    {
        super.display();
        System.out.println("Grammar Skill Level: " + this.grammarLevel);
    }
}

class Test
{
    public static void main(String[] args)
    {
        Teacher t;

        t = new Teacher();
        System.out.println("\nTeacher Count: " + Teacher.getCount());
        t.display();
        System.out.println("Total Salary: " + t.calcSalary());

        t = new MathTeacher("Mr.Chaudhari", 35000, 5);
        System.out.println("\nTeacher Count: " + Teacher.getCount());
        t.display();
        System.out.println("Total Salary: " + t.calcSalary());

        t = new ScienceTeacher("Mrs.Patil", 40000, true);
        System.out.println("\nTeacher Count: " + Teacher.getCount());
        t.display();
        System.out.println("Total Salary: " + t.calcSalary());

        t = new EnglishTeacher("Ms. Riya", 30000, 3);
        System.out.println("\nTeacher Count: " + Teacher.getCount());
        t.display();
        System.out.println("Total Salary: " + t.calcSalary());
    }
}
