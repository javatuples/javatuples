package org.javatuples;

import java.net.Socket;

import junit.framework.TestCase;

public class Test extends TestCase {

    
    
    public void testMain() throws Exception {
        
        
        final Decade<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade =
            Decade.with(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10));

        for (final Object value : decade) {
            System.out.println(value);
        }
            
        assertTrue(true);

        
        final Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> ennead =
            Ennead.with(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9));

        System.out.println(ennead.insertInPos1("Pepito"));
        System.out.println(ennead.append(new Socket()));
     
        final Sextet<String,Integer,String,String,String,String> sextet =
            Tuple.with("1.0",Integer.valueOf(2),"3.0","4.0","5.0","6.0");
        
        System.out.println(sextet);
        System.out.println(sextet.insertInPos3("Perico"));
        
        System.out.println(Tuple.with("a").append(Integer.valueOf(2)).append(4.09));
        System.out.println(Tuple.with("a").append(Integer.valueOf(2)).append(4.09).contains(2));
    }
    
}
