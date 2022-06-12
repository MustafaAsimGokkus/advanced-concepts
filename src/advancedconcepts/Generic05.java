package advancedconcepts;
/*
Type parameters have naming convention which are commonly used
T->Type
E->Element
K->Key
V->Value
N->Number
 */
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Generic05 {
    public static void main(String[] args) {

        Generic06<String,Integer> obj1 = new Generic06<>("Ali",12);
        obj1.display(true,'C');
        obj1.display(12,"Ahmet");
        obj1.display('Z',123);
        obj1.print("Ayse");
        obj1.print('A');

    }
}
class Generic06<K,V>{
    private K key;
    private V value;

    public Generic06(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Generic06{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }//u can extend 1 class then interfaces for N
    public <E,N  > void display(E element, N number){
        System.out.println("Element:"+element+" Number:"+number);
    }
    public<E>void print(E element){
        System.out.println("Element:"+element);
    }
}