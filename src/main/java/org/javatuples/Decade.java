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

public final class Decade<A,B,C,D,E,F,G,H,I,J> extends Tuple {

    private static final long serialVersionUID = -1607420937567707033L;

    private static final int SIZE = 10;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    private final H val7;
    private final I val8;
    private final J val9;
    
    
    public static <A,B,C,D,E,F,G,H,I,J> Decade<A,B,C,D,E,F,G,H,I,J> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6, final H value7, final I value8, final J value9) {
        return new Decade<A,B,C,D,E,F,G,H,I,J>(value0,value1,value2,value3,value4,value5,value6,value7,value8,value9);
    }
    
    
    public Decade(
            final A value0,
            final B value1,
            final C value2,
            final D value3,
            final E value4,
            final F value5,
            final G value6,
            final H value7,
            final I value8,
            final J value9) {
        super(SIZE, value0, value1, value2, value3, value4, value5, value6, value7, value8, value9);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
        this.val4 = value4;
        this.val5 = value5;
        this.val6 = value6;
        this.val7 = value7;
        this.val8 = value8;
        this.val9 = value9;
    }


    public A getValue0() {
        return this.val0;
    }


    public B getValue1() {
        return this.val1;
    }


    public C getValue2() {
        return this.val2;
    }


    public D getValue3() {
        return this.val3;
    }


    public E getValue4() {
        return this.val4;
    }


    public F getValue5() {
        return this.val5;
    }

    
    public G getValue6() {
        return this.val6;
    }


    public H getValue7() {
        return this.val7;
    }


    public I getValue8() {
        return this.val8;
    }


    public J getValue9() {
        return this.val9;
    }


    @Override
    public int getSize() {
        return SIZE;
    }
    
}
