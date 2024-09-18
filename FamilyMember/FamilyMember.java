abstract class FamilyMember
{
    private String type;
    public FamilyMember(String type)
    {
        this.type = type;
    }
    
    abstract public void greet();
    
    public String toString()
    {
        String res = "Family Member [" + type + "]";
        return res;
    }
}

class Father extends FamilyMember
{
    public Father()
    {
        super("Father");
    }
    
    public void greet()
    {
        System.out.println("I am your father");
    }
}

class Mother extends FamilyMember
{
    public Mother()
    {
        super("Mother");
    }
    
    public void greet()
    {
        System.out.println("Mother knows best");
    }
}

class Son extends FamilyMember
{
    public Son()
    {
        super("Son");
    }
    
    public void greet()
    {
        System.out.println("My father and mother love me");
    }
}
