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

public final class Ennead<A,B,C,D,E,F,G,H,I> extends Tuple {

    private static final long serialVersionUID = -4782141390960730966L;

    private static final int SIZE = 9;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    private final H val7;
    private final I val8;
    
    
    
    public static <A,B,C,D,E,F,G,H,I> Ennead<A,B,C,D,E,F,G,H,I> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6, final H value7, final I value8) {
        return new Ennead<A,B,C,D,E,F,G,H,I>(value0,value1,value2,value3,value4,value5,value6,value7,value8);
    }
    
    
    public Ennead(
            final A value0,
            final B value1,
            final C value2,
            final D value3,
            final E value4,
            final F value5,
            final G value6,
            final H value7,
            final I value8) {
        super(SIZE, value0, value1, value2, value3, value4, value5, value6, value7, value8);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
        this.val4 = value4;
        this.val5 = value5;
        this.val6 = value6;
        this.val7 = value7;
        this.val8 = value8;
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


    @Override
    public int getSize() {
        return SIZE;
    }

    
    
    
    public <X0> Decade<X0,A,B,C,D,E,F,G,H,I> addAt0(final X0 value0) {
        return new Decade<X0,A,B,C,D,E,F,G,H,I>(
                value0, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7, this.val8);
    }
    
    public <X0> Decade<A,X0,B,C,D,E,F,G,H,I> addAt1(final X0 value0) {
        return new Decade<A,X0,B,C,D,E,F,G,H,I>(
                this.val0, value0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7, this.val8);
    }
    
    public <X0> Decade<A,B,X0,C,D,E,F,G,H,I> addAt2(final X0 value0) {
        return new Decade<A,B,X0,C,D,E,F,G,H,I>(
                this.val0, this.val1, value0, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7, this.val8);
    }
    
    public <X0> Decade<A,B,C,X0,D,E,F,G,H,I> addAt3(final X0 value0) {
        return new Decade<A,B,C,X0,D,E,F,G,H,I>(
                this.val0, this.val1, this.val2, value0, this.val3, this.val4, this.val5, 
                this.val6, this.val7, this.val8);
    }
    
    public <X0> Decade<A,B,C,D,X0,E,F,G,H,I> addAt4(final X0 value0) {
        return new Decade<A,B,C,D,X0,E,F,G,H,I>(
                this.val0, this.val1, this.val2, this.val3, value0, this.val4, this.val5, 
                this.val6, this.val7, this.val8);
    }
    
    public <X0> Decade<A,B,C,D,E,X0,F,G,H,I> addAt5(final X0 value0) {
        return new Decade<A,B,C,D,E,X0,F,G,H,I>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, this.val5, 
                this.val6, this.val7, this.val8);
    }
    
    public <X0> Decade<A,B,C,D,E,F,X0,G,H,I> addAt6(final X0 value0) {
        return new Decade<A,B,C,D,E,F,X0,G,H,I>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, 
                this.val6, this.val7, this.val8);
    }
    
    public <X0> Decade<A,B,C,D,E,F,G,X0,H,I> addAt7(final X0 value0) {
        return new Decade<A,B,C,D,E,F,G,X0,H,I>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                value0, this.val7, this.val8);
    }
    
    public <X0> Decade<A,B,C,D,E,F,G,H,X0,I> addAt8(final X0 value0) {
        return new Decade<A,B,C,D,E,F,G,H,X0,I>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                this.val7, value0, this.val8);
    }
    
    public <X0> Decade<A,B,C,D,E,F,G,H,I,X0> addAt9(final X0 value0) {
        return new Decade<A,B,C,D,E,F,G,H,I,X0>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                this.val7, this.val8, value0);
    }

    
    
    public <X0> Decade<X0,A,B,C,D,E,F,G,H,I> addAt0(final Unit<X0> tuple) {
        return addAt0(tuple.getValue0());
    }
    
    public <X0> Decade<A,X0,B,C,D,E,F,G,H,I> addAt1(final Unit<X0> tuple) {
        return addAt1(tuple.getValue0());
    }
    
    public <X0> Decade<A,B,X0,C,D,E,F,G,H,I> addAt2(final Unit<X0> tuple) {
        return addAt2(tuple.getValue0());
    }
    
    public <X0> Decade<A,B,C,X0,D,E,F,G,H,I> addAt3(final Unit<X0> tuple) {
        return addAt3(tuple.getValue0());
    }
    
    public <X0> Decade<A,B,C,D,X0,E,F,G,H,I> addAt4(final Unit<X0> tuple) {
        return addAt4(tuple.getValue0());
    }
    
    public <X0> Decade<A,B,C,D,E,X0,F,G,H,I> addAt5(final Unit<X0> tuple) {
        return addAt5(tuple.getValue0());
    }
    
    public <X0> Decade<A,B,C,D,E,F,X0,G,H,I> addAt6(final Unit<X0> tuple) {
        return addAt6(tuple.getValue0());
    }
    
    public <X0> Decade<A,B,C,D,E,F,G,X0,H,I> addAt7(final Unit<X0> tuple) {
        return addAt7(tuple.getValue0());
    }
    
    public <X0> Decade<A,B,C,D,E,F,G,H,X0,I> addAt8(final Unit<X0> tuple) {
        return addAt8(tuple.getValue0());
    }
    
    public <X0> Decade<A,B,C,D,E,F,G,H,I,X0> addAt9(final Unit<X0> tuple) {
        return addAt9(tuple.getValue0());
    }
    

    
    
    public <X0> Decade<A,B,C,D,E,F,G,H,I,X0> add(final X0 value0) {
        return addAt9(value0);
    }
    
    
    public <X0> Decade<A,B,C,D,E,F,G,H,I,X0> add(final Unit<X0> tuple) {
        return addAt9(tuple);
    }
    
    
    
    
    
    public <X> Ennead<X,B,C,D,E,F,G,H,I> setAt0(final X value) {
        return new Ennead<X,B,C,D,E,F,G,H,I>(
                value, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8);
    }
    
    public <X> Ennead<A,X,C,D,E,F,G,H,I> setAt1(final X value) {
        return new Ennead<A,X,C,D,E,F,G,H,I>(
                this.val0, value, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8);
    }
    
    public <X> Ennead<A,B,X,D,E,F,G,H,I> setAt2(final X value) {
        return new Ennead<A,B,X,D,E,F,G,H,I>(
                this.val0, this.val1, value, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8);
    }
    
    public <X> Ennead<A,B,C,X,E,F,G,H,I> setAt3(final X value) {
        return new Ennead<A,B,C,X,E,F,G,H,I>(
                this.val0, this.val1, this.val2, value, this.val4, this.val5, this.val6, this.val7, this.val8);
    }
    
    public <X> Ennead<A,B,C,D,X,F,G,H,I> setAt4(final X value) {
        return new Ennead<A,B,C,D,X,F,G,H,I>(
                this.val0, this.val1, this.val2, this.val3, value, this.val5, this.val6, this.val7, this.val8);
    }
    
    public <X> Ennead<A,B,C,D,E,X,G,H,I> setAt5(final X value) {
        return new Ennead<A,B,C,D,E,X,G,H,I>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value, this.val6, this.val7, this.val8);
    }
    
    public <X> Ennead<A,B,C,D,E,F,X,H,I> setAt6(final X value) {
        return new Ennead<A,B,C,D,E,F,X,H,I>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value, this.val7, this.val8);
    }
    
    public <X> Ennead<A,B,C,D,E,F,G,X,I> setAt7(final X value) {
        return new Ennead<A,B,C,D,E,F,G,X,I>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, value, this.val8);
    }
    
    public <X> Ennead<A,B,C,D,E,F,G,H,X> setAt8(final X value) {
        return new Ennead<A,B,C,D,E,F,G,H,X>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, value);
    }
    
    
}
