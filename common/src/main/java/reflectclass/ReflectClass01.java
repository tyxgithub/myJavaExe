package reflectclass;

import java.lang.reflect.Field;

/**
 * Author:   tyx
 * Date:     2020/12/1 16:14
 * Description: 反射类demo
 */
public class ReflectClass01 {
    public static void main(String[] args) throws Exception {
//        getClassName();
        //获取类的无参构造函数，并实例化类
//        Constructor<User> constructor = User.class.getConstructor(null);
//        User user = constructor.newInstance();
        User user=new User();
        Class<? extends User> aClass = user.getClass();
        Field[] fields = aClass.getFields();
        System.out.println(fields);
        //这种方法只能获取类的非私有属性
        for (Field field : fields) {
            System.out.println(field.toString());
        }
        //获取私有属性的方法
        Field age = User.class.getDeclaredField("age");
        System.out.println("age:"+age);
        //这行代码必须有，不然私有属性无法设置
        age.setAccessible(true);
        age.set(user,26);
        System.out.println("getAge:"+user.getAge());
    }

    private static void getClassName() throws ClassNotFoundException {
        //反射获取有三种方式
        //1根据类名
        Class<User> userClass = User.class;
        System.out.println(userClass);
        //2根据对象实例的getClass()方法
        Class<? extends User> aClass = (new User()).getClass();
        System.out.println(aClass);
        //3根据全限定类名
        Class<?> user = Class.forName("reflectclass.User");
        System.out.println(user);
    }
}
 
