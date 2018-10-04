package Java2;

class IsSingleton
{

    private static IsSingleton var=null;

    public String s;

    private IsSingleton()
    {

        s="This is singleton class";
    }

    public static IsSingleton getObject()
    {


        if(var==null)
        {
            var=new IsSingleton();
        }
        return var;
    }
}

public class Java2_4 {

    public static void main(String[] args) {

        IsSingleton obj1 = IsSingleton.getObject();

        IsSingleton obj2 =IsSingleton.getObject();

        IsSingleton obj3 =IsSingleton.getObject();

        obj1.s=(obj1.s).toUpperCase();

        System.out.println("obj 1 :" + obj1.s);

        System.out.println("obj 2 :" + obj2.s);

        System.out.println("obj 3 :" + obj3.s);

    }
}

