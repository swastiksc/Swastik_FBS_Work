class HospitalStaff
{
    String name;
    double salary;
    static int count = 0;

    
    HospitalStaff()
    {
        System.out.println("Default constructor of HospitalStaff called");
        this.name = "Unknown Staff";
        this.salary = 20000;
        count++;
    }

    HospitalStaff(String n, double s)
    {
        System.out.println("Parameterized constructor of HospitalStaff called");
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
        System.out.println("Staff Name: " + this.name);
        System.out.println("Base Salary: " + this.salary);
    }
}



class Doctor extends HospitalStaff
{
    private String specialization;

    Doctor()
    {
        super();
        this.specialization = "General Physician";
        System.out.println("Default constructor of Doctor called");
    }

    Doctor(String n, double s, String sp)
    {
        super(n, s);
        this.specialization = sp;
        System.out.println("Parameterized constructor of Doctor called");
    }

    void setSpecialization(String sp)   
    { 
 	this.specialization = sp; 
    }
    String getSpecialization()          
    { 
	return this.specialization; 
    }

    double calcSalary()
    {
        return getSalary() + 15000;  // duty allowance
    }

    void display()
    {
        super.display();
        System.out.println("Specialization: " + this.specialization);
    }
}

class Nurse extends HospitalStaff
{
    private int shifts;

    Nurse()
    {
        super();
        this.shifts = 2;
        System.out.println("Default constructor of Nurse called");
    }

    Nurse(String n, double s, int sh)
    {
        super(n, s);
        this.shifts = sh;
        System.out.println("Parameterized constructor of Nurse called");
    }

    void setShifts(int sh)             
    { 
	this.shifts = sh; 
    }
    int getShifts()                    
    { 
	return this.shifts; 
    }

    double calcSalary()
    {
        return getSalary() + (shifts * 2000);  // shift allowance
    }

    void display()
    {
        super.display();
        System.out.println("Shifts per Week: " + this.shifts);
    }
}

class Technician extends HospitalStaff
{
    private String department;

    Technician()
    {
        super();
        this.department = "Lab";
        System.out.println("Default constructor of Technician called");
    }

    Technician(String n, double s, String d)
    {
        super(n, s);
        this.department = d;
        System.out.println("Parameterized constructor of Technician called");
    }

    void setDepartment(String d)       
    { 
	this.department = d; 
    }
    String getDepartment()             
    { 
	return this.department; 
    }

    double calcSalary()
    {
        return getSalary() + 5000;  // technical allowance
    }

    void display()
    {
        super.display();
        System.out.println("Department: " + this.department);
    }
}

class Test
{
    public static void main(String[] args)
    {
        HospitalStaff hs;

        hs = new HospitalStaff();
        System.out.println("\nStaff Count: " + HospitalStaff.getCount());
        hs.display();
        System.out.println("Total Salary: " + hs.calcSalary());


        hs = new Doctor("Dr.Rahul", 60000, "Cardiologist");
        System.out.println("\nStaff Count: " + HospitalStaff.getCount());
        hs.display();
        System.out.println("Total Salary: " + hs.calcSalary());


        hs = new Nurse("Amita", 30000, 4);
        System.out.println("\nStaff Count: " + HospitalStaff.getCount());
        hs.display();
        System.out.println("Total Salary: " + hs.calcSalary());


        hs = new Technician("Rohan", 25000, "X-Ray");
        System.out.println("\nStaff Count: " + HospitalStaff.getCount());
        hs.display();
        System.out.println("Total Salary: " + hs.calcSalary());
    }
}
