/*
 * System
 */

import java.util.*;
class SystemDemo{
    public static void main(String[] args)
    {
        Properties prop = System.getProperties();
        //集合 字符串
        for(Object obj : prop.keySet()){
            String value = (String)prop.get(obj);

            System.out.println(obj+"::"+value);

        }
    }
}
