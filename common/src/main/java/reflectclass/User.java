package reflectclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Author:   tyx
 * Date:     2020/12/1 16:19
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public String name;
    private int age;
    private Map<String,Object> map;
    public void testmethodnoargs(){}
    public void testmethodhasargs(String s, int i){}
}
 
