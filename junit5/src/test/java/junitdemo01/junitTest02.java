package junitdemo01;


import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

/**
 * Author:   tyx
 * Date:     2020/12/1 15:00
 * Description: 参数化demo
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class junitTest02 {
    //ValueSource单一参数测试
    //可以指定ints，strings，bytes等各种基本类型参数
    //只支持单一参数的方法
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    public void testParam(int i){
        System.out.println("第："+i+"次测试");
    }
    //支持多个不同类型参数
    @ParameterizedTest
    @CsvSource({"a,3","n,2"})
    public void testCsv(String s,int a){
        System.out.println(s.getClass().toString());
        System.out.println(a);
    }
    //要求在测试类上注@TestInstance(TestInstance.Lifecycle.PER_CLASS)
    //@MethodSource要传入方法名作参数
    @ParameterizedTest
    @MethodSource("methodSource")
    public void testMethod(String s, int i){
        System.out.println(s.getClass().toString());
        System.out.println(i);
    }
    Stream<Arguments> methodSource(){
        return Stream.of(Arguments.of("aa",1),Arguments.of("bb",2));
    }
    //CsvFileSource文件参数测试
    //以行为单位，每一行就是一个测试数据
    @ParameterizedTest
    @CsvFileSource(resources  = "/test.csv")
    public void testCsvFile(String s ,int i){
        System.out.println(s.getClass().toString());
        System.out.println(i);
    }
}
 
