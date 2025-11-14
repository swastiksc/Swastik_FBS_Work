class Artist
{
    String name;
    double earnings;
    static int count = 0;

    Artist()
    {
        System.out.println("Default constructor of Artist called");
        this.name = "Unknown Artist";
        this.earnings = 1000;
        count++;
    }

    Artist(String n, double e)
    {
        System.out.println("Parameterized constructor of Artist called");
        this.name = n;
        this.earnings = e;
        count++;
    }

    void setName(String n)         
    { 
	this.name = n; 
    }
    void setEarnings(double e)     
    { 
	this.earnings = e; 
    }

    String getName()               
    { 
	return this.name; 
    }
    double getEarnings()           
    { 
	return this.earnings; 
    }

    static int getCount()          
    { 
	return count; 
    }

    double calcEarnings()          
    {
        return earnings;
    }

    void display()
    {
        System.out.println("Artist Name: " + this.name);
        System.out.println("Base Earnings: " + this.earnings);
    }
}
class Singer extends Artist
{
    private String genre;

    Singer()
    {
        super();
        this.genre = "Pop";
        System.out.println("Default constructor of Singer called");
    }

    Singer(String n, double e, String g)
    {
        super(n, e);
        this.genre = g;
        System.out.println("Parameterized constructor of Singer called");
    }

    void setGenre(String g)        
    { 
	this.genre = g; 
    }
    String getGenre()              
    { 
	return this.genre; 
    }

    double calcEarnings()
    {
        return getEarnings() + 2000;
    }

    void display()
    {
        super.display();
        System.out.println("Genre: " + this.genre);
    }
}
class Painter extends Artist
{
    private int paintingsSold;

    Painter()
    {
        super();
        this.paintingsSold = 5;
        System.out.println("Default constructor of Painter called");
    }

    Painter(String n, double e, int p)
    {
        super(n, e);
        this.paintingsSold = p;
        System.out.println("Parameterized constructor of Painter called");
    }

    void setPaintingsSold(int p)   
    { 
	this.paintingsSold = p; 
    }
    int getPaintingsSold()         
    { 
	return this.paintingsSold; 
    }

    double calcEarnings()
    {
        return getEarnings() + (paintingsSold * 1000);
    }

    void display()
    {
        super.display();
        System.out.println("Paintings Sold: " + this.paintingsSold);
    }
}

class Actor extends Artist
{
    private int movies;

    Actor()
    {
        super();
        this.movies = 1;
        System.out.println("Default constructor of Actor called");
    }

    Actor(String n, double e, int m)
    {
        super(n, e);
        this.movies = m;
        System.out.println("Parameterized constructor of Actor called");
    }

    void setMovies(int m)          
    { 
	this.movies = m; 
    }
    int getMovies()                
    { 
	return this.movies; 
    }

    double calcEarnings()
    {
        return getEarnings() + (movies * 50000);
    }

    void display()
    {
        super.display();
        System.out.println("Movies Acted: " + this.movies);
    }
}

class Test
{
    public static void main(String[] args) {

        Artist a;

        a = new Artist();
        System.out.println("\nArtist Count: " + Artist.getCount());
        a.display();
        System.out.println("Calculated Earnings: " + a.calcEarnings());

        a = new Singer("Arijit Singh", 500000, "Melody");
        System.out.println("\nArtist Count: " + Artist.getCount());
        a.display();
        System.out.println("Calculated Earnings: " + a.calcEarnings());

        a = new Painter("Raju", 200000, 10);
        System.out.println("\nArtist Count: " + Artist.getCount());
        a.display();
        System.out.println("Calculated Earnings: " + a.calcEarnings());

        a = new Actor("Sushant Rajput", 2000000, 80);
        System.out.println("\nArtist Count: " + Artist.getCount());
        a.display();
        System.out.println("Calculated Earnings: " + a.calcEarnings());
    }
}
