class A
{
    void show()
    {
        System.out.println("A");
    }
}

class B extends A
{
}

class C extends A
{
}

// Not Allowed in Java
class D extends B, C
{
}
/*
Hybrid Inheritance is a combination of two or more inheritance types. 
Java does not support Hybrid Inheritance through classes because it involves Multiple Inheritance, 
which can cause the Diamond Problem. However, Java supports Hybrid Inheritance through interfaces.
*/