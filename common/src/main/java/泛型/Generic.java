package 泛型;

/**
 * Author:   tyx
 * Date:     2020/12/3 8:52
 * Description: 泛型类
 */
public class Generic<T> {
    private T key;

    public Generic() {
    }

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public static void main(String[] args) {
        Generic<Integer> integerGeneric=new Generic<Integer>(123);
        System.out.println(integerGeneric.getKey());

        Generic<String> stringGeneric=new Generic<String>();
        stringGeneric.setKey("haha");
        System.out.println(stringGeneric.getKey());
        System.out.println(stringGeneric.getClass().toString());
    }
}
 
