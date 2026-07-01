class Example20
{
    public static void main(String[] args)
    {
        Building.Flat obj = new A();
        obj.rooms();
    }
}

interface Building
{
    interface Flat
    {
        void rooms();
    }
}

class A implements Building.Flat
{
    public void rooms()
    {
        System.out.println("In A room");
    }
}