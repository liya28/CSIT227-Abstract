abstract class HypotheticalAbstract1
{
    protected int a;
    protected int b;
    
    public HypotheticalAbstract1(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public abstract int getValue1();
    public abstract int getValue2();
}

abstract class HypotheticalAbstract2 extends HypotheticalAbstract1
{
    public HypotheticalAbstract2(int a, int b)
    {
        super(a, b);
    }
    
    public int getValue1()
    {
        return a + b;
    }
}

abstract class HypotheticalAbstract3 extends HypotheticalAbstract2
{
    public HypotheticalAbstract3(int a, int b)
    {
        super(a, b);
    }
    
    public int getValue2()
    {
        return a * b;
    }
}

final class HypotheticalNonAbstract extends HypotheticalAbstract3
{
    public HypotheticalNonAbstract(int a, int b)
    {
        super(a, b);
    }
}
