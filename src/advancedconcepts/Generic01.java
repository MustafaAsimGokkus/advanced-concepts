package advancedconcepts;

import java.util.ArrayList;
/*
1. we have to type explicit narrowint code
2. java needs to do explicit narrowing operation everytime
3. when u use generic concept you will get CTE which is good
  otherwise u ll get RTE which takes much time to fix
 */
public class Generic01 {
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Character> list3 = new ArrayList<>();

        NonGeneric01 obj1 = new NonGeneric01("String without using generics");
        System.out.println(obj1);
        String objValue =(String) obj1.getObj();//Explicit Narrowing --cast to String
        System.out.println(objValue);

        NonGeneric01 obj2 = new NonGeneric01(55);
        Integer obj2Value = (Integer)obj2.getObj();
        System.out.println(obj2Value);

        NonGeneric01 obj3 = new NonGeneric01('A');
        Character obj3Value = (Character) obj3.getObj();
        System.out.println(obj3Value);

        Generic02<String> obj4 = new Generic02("Asim");
        String obj4Value = obj4.getObj();
        System.out.println(obj4Value);

        Generic02<Integer> obj5 = new Generic02(54685);
        Integer obj5Value = obj5.getObj();
        System.out.println(obj5Value);

        Generic02<Boolean> obj6 = new Generic02(true);
        Boolean obj6Value = obj6.getObj();
        System.out.println(obj6Value);

        Generic03<Float> obj7 = new Generic03<>(1.75F);
        Float obj7Value = obj7.getObj();
        System.out.println(obj7Value);

    }
}

class NonGeneric01{
    private Object obj;

    public NonGeneric01(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "NonGeneric01{" +
                "obj=" + obj +
                '}';
    }
}
//objects can be created in every data type
class Generic02<T>{
  private T obj;

    public Generic02(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Generic02{" +
                "obj=" + obj +
                '}';
    }
}
//create a class which is able to create in every number data types but not in other data types
class Generic03< T extends Number>{
   private T obj;

    public Generic03(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Generic03{" +
                "obj=" + obj +
                '}';
    }
}