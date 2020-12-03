package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:   tyx
 * Date:     2020/12/3 8:46
 * Description:
 */
public class TestT {
    public static void main(String[] args) {
        //List 不指定类型。默认继承Object类型
        List alist=new ArrayList();
        alist.add("s");
        alist.add(1);
        alist.add(true);
        System.out.println(alist);
    }
}
 
