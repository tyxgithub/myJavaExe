package junitdemo01;

import org.junit.jupiter.api.*;

/**
 * Author:   tyx
 * Date:     2020/12/1 14:38
 * Description: junit5
 * url:https://blog.csdn.net/topdeveloperr/article/details/108884204
 * url:https://blog.csdn.net/qq_40448026/article/details/102636819?utm_medium=distribute.pc_relevant.none-task-blog-searchFromBaidu-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-searchFromBaidu-1.control
 */
public class JunitTest01 {
    //BeforeAll,AfterAll一定是static
    @BeforeAll
    static void BeforeAll(){
        System.out.println("测试类前置运行");
    }
    //BeforeEach,AfterEach一定不能为static
    @BeforeEach
    public void beforeEach(){
        System.out.println("每个test方法前置运行");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("每个test方法后置运行");
    }
    @Test
    public void test01(){
        System.out.println("这是测试方法01");
    }
    @Test
    public void test02(){
        System.out.println("这是测试方法02");
    }
    @AfterAll
    public static void AfterAll(){
        System.out.println("这是测试类后置方法");
    }
}
 
