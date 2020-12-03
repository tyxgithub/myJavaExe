package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author:   tyx
 * Date:     2020/12/3 15:53
 * Description:
 */
public class Collections工具类 {
    public static void main(String[] args) {
        List myList=new ArrayList();
        myList.add(2);
        myList.add("tyx");
        myList.add(true);
        //void reverse(List list)：反转
        Collections.reverse(myList);
        System.out.println(myList);
        //void shuffle(List list),随机排序
        Collections.shuffle(myList);
        System.out.println(myList);
    }
}
 
