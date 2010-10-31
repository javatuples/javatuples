/*
 * =============================================================================
 * 
 *   Copyright (c) 2010, The JAVATUPLES team (http://www.javatuples.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.javatuples;

import java.net.Socket;
import java.util.Arrays;

import junit.framework.TestCase;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SerializationUtils;

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

        System.out.println(ennead.addAt1("Pepito"));
        System.out.println(ennead.add(new Socket()));
     
        final Sextet<String,Integer,String,String,String,String> sextet =
            Sextet.with("1.0",Integer.valueOf(2),"3.0","4.0","5.0","6.0");
        
        System.out.println(sextet);
        System.out.println(sextet.addAt3("Perico"));
        
        Pair<String,Object> pair = Pair.with("a", null);
        
        final Object o = null;
        assertTrue(pair.contains("a"));
        assertTrue(pair.contains(null));
        assertTrue(pair.containsAll(o));
        assertTrue(pair.containsAll(null,"a"));
        assertTrue(!pair.containsAll(null,"b"));
        
        final byte[] serSextet = SerializationUtils.serialize(sextet);
        System.out.println(Arrays.asList(ArrayUtils.toObject(serSextet)));
        final Sextet<String,Integer,String,String,String,String> sextetUnSer =
            (Sextet<String,Integer,String,String,String,String>) SerializationUtils.deserialize(serSextet);
        System.out.println(sextetUnSer);
        
        
    }
    
}
