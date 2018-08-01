
package hello.world;


public class dog {
    
   //attributes
    
    String name;
    int age;
    String[] fetchedItem = {"bone", "stick", "ball"};
    private int fetchCounter = 0;
    
    public dog(String name, int age)
    {
        this.name = name;
        this.age = age;
        
    }
    
    //functions
    
    public void bark()
    {
        System.out.println("bark");
    }
    
    public int getDogYears()
    {
        return this.age * 7;
    }
}
