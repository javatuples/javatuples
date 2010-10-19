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

public final class Sextet<A,B,C,D,E,F> extends Tuple {

    private static final long serialVersionUID = -367678052827219823L;

    private static final int SIZE = 6;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    
    
    
    public static <A,B,C,D,E,F> Sextet<A,B,C,D,E,F> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5) {
        return new Sextet<A,B,C,D,E,F>(value0,value1,value2,value3,value4,value5);
    }
    
    
    public Sextet(
            final A value0,
            final B value1,
            final C value2,
            final D value3,
            final E value4,
            final F value5) {
        super(SIZE, value0, value1, value2, value3, value4, value5);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
        this.val4 = value4;
        this.val5 = value5;
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


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    

    
    
    
    public <X0> Septet<X0,A,B,C,D,E,F> insertInPos0(final X0 value0) {
        return new Septet<X0,A,B,C,D,E,F>(
                value0, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0> Septet<A,X0,B,C,D,E,F> insertInPos1(final X0 value0) {
        return new Septet<A,X0,B,C,D,E,F>(
                this.val0, value0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0> Septet<A,B,X0,C,D,E,F> insertInPos2(final X0 value0) {
        return new Septet<A,B,X0,C,D,E,F>(
                this.val0, this.val1, value0, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0> Septet<A,B,C,X0,D,E,F> insertInPos3(final X0 value0) {
        return new Septet<A,B,C,X0,D,E,F>(
                this.val0, this.val1, this.val2, value0, this.val3, this.val4, this.val5);
    }
    
    public <X0> Septet<A,B,C,D,X0,E,F> insertInPos4(final X0 value0) {
        return new Septet<A,B,C,D,X0,E,F>(
                this.val0, this.val1, this.val2, this.val3, value0, this.val4, this.val5);
    }
    
    public <X0> Septet<A,B,C,D,E,X0,F> insertInPos5(final X0 value0) {
        return new Septet<A,B,C,D,E,X0,F>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, this.val5);
    }
    
    public <X0> Septet<A,B,C,D,E,F,X0> insertInPos6(final X0 value0) {
        return new Septet<A,B,C,D,E,F,X0>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0);
    }

    
    
    
    
    public <X0,X1> Octet<X0,X1,A,B,C,D,E,F> insertInPos0(final X0 value0, final X1 value1) {
        return new Octet<X0,X1,A,B,C,D,E,F>(
                value0, value1, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1> Octet<A,X0,X1,B,C,D,E,F> insertInPos1(final X0 value0, final X1 value1) {
        return new Octet<A,X0,X1,B,C,D,E,F>(
                this.val0, value0, value1, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1> Octet<A,B,X0,X1,C,D,E,F> insertInPos2(final X0 value0, final X1 value1) {
        return new Octet<A,B,X0,X1,C,D,E,F>(
                this.val0, this.val1, value0, value1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1> Octet<A,B,C,X0,X1,D,E,F> insertInPos3(final X0 value0, final X1 value1) {
        return new Octet<A,B,C,X0,X1,D,E,F>(
                this.val0, this.val1, this.val2, value0, value1, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1> Octet<A,B,C,D,X0,X1,E,F> insertInPos4(final X0 value0, final X1 value1) {
        return new Octet<A,B,C,D,X0,X1,E,F>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, this.val4, this.val5);
    }
    
    public <X0,X1> Octet<A,B,C,D,E,X0,X1,F> insertInPos5(final X0 value0, final X1 value1) {
        return new Octet<A,B,C,D,E,X0,X1,F>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, this.val5);
    }
    
    public <X0,X1> Octet<A,B,C,D,E,F,X0,X1> insertInPos6(final X0 value0, final X1 value1) {
        return new Octet<A,B,C,D,E,F,X0,X1>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1);
    }
    


    
    
    
    
    public <X0,X1,X2> Ennead<X0,X1,X2,A,B,C,D,E,F> insertInPos0(final X0 value0, final X1 value1, final X2 value2) {
        return new Ennead<X0,X1,X2,A,B,C,D,E,F>(
                value0, value1, value2, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Ennead<A,X0,X1,X2,B,C,D,E,F> insertInPos1(final X0 value0, final X1 value1, final X2 value2) {
        return new Ennead<A,X0,X1,X2,B,C,D,E,F>(
                this.val0, value0, value1, value2, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Ennead<A,B,X0,X1,X2,C,D,E,F> insertInPos2(final X0 value0, final X1 value1, final X2 value2) {
        return new Ennead<A,B,X0,X1,X2,C,D,E,F>(
                this.val0, this.val1, value0, value1, value2, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Ennead<A,B,C,X0,X1,X2,D,E,F> insertInPos3(final X0 value0, final X1 value1, final X2 value2) {
        return new Ennead<A,B,C,X0,X1,X2,D,E,F>(
                this.val0, this.val1, this.val2, value0, value1, value2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Ennead<A,B,C,D,X0,X1,X2,E,F> insertInPos4(final X0 value0, final X1 value1, final X2 value2) {
        return new Ennead<A,B,C,D,X0,X1,X2,E,F>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Ennead<A,B,C,D,E,X0,X1,X2,F> insertInPos5(final X0 value0, final X1 value1, final X2 value2) {
        return new Ennead<A,B,C,D,E,X0,X1,X2,F>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, value2, this.val5);
    }
    
    public <X0,X1,X2> Ennead<A,B,C,D,E,F,X0,X1,X2> insertInPos6(final X0 value0, final X1 value1, final X2 value2) {
        return new Ennead<A,B,C,D,E,F,X0,X1,X2>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1, value2);
    }
    


    
    
    
    
    public <X0,X1,X2,X3> Decade<X0,X1,X2,X3,A,B,C,D,E,F> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Decade<X0,X1,X2,X3,A,B,C,D,E,F>(
                value0, value1, value2, value3, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Decade<A,X0,X1,X2,X3,B,C,D,E,F> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Decade<A,X0,X1,X2,X3,B,C,D,E,F>(
                this.val0, value0, value1, value2, value3, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Decade<A,B,X0,X1,X2,X3,C,D,E,F> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Decade<A,B,X0,X1,X2,X3,C,D,E,F>(
                this.val0, this.val1, value0, value1, value2, value3, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Decade<A,B,C,X0,X1,X2,X3,D,E,F> insertInPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Decade<A,B,C,X0,X1,X2,X3,D,E,F>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Decade<A,B,C,D,X0,X1,X2,X3,E,F> insertInPos4(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Decade<A,B,C,D,X0,X1,X2,X3,E,F>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, value3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Decade<A,B,C,D,E,X0,X1,X2,X3,F> insertInPos5(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Decade<A,B,C,D,E,X0,X1,X2,X3,F>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, value2, value3, this.val5);
    }
    
    public <X0,X1,X2,X3> Decade<A,B,C,D,E,F,X0,X1,X2,X3> insertInPos6(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Decade<A,B,C,D,E,F,X0,X1,X2,X3>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1, value2, value3);
    }

    
    
    
    
    public <X0> Septet<X0,A,B,C,D,E,F> insertInPos0(final Unit<X0> tuple) {
        return insertInPos0(tuple.getValue0());
    }
    
    public <X0> Septet<A,X0,B,C,D,E,F> insertInPos1(final Unit<X0> tuple) {
        return insertInPos1(tuple.getValue0());
    }
    
    public <X0> Septet<A,B,X0,C,D,E,F> insertInPos2(final Unit<X0> tuple) {
        return insertInPos2(tuple.getValue0());
    }
    
    public <X0> Septet<A,B,C,X0,D,E,F> insertInPos3(final Unit<X0> tuple) {
        return insertInPos3(tuple.getValue0());
    }
    
    public <X0> Septet<A,B,C,D,X0,E,F> insertInPos4(final Unit<X0> tuple) {
        return insertInPos4(tuple.getValue0());
    }
    
    public <X0> Septet<A,B,C,D,E,X0,F> insertInPos5(final Unit<X0> tuple) {
        return insertInPos5(tuple.getValue0());
    }
    
    public <X0> Septet<A,B,C,D,E,F,X0> insertInPos6(final Unit<X0> tuple) {
        return insertInPos6(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Octet<X0,X1,A,B,C,D,E,F> insertInPos0(final Pair<X0,X1> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Octet<A,X0,X1,B,C,D,E,F> insertInPos1(final Pair<X0,X1> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Octet<A,B,X0,X1,C,D,E,F> insertInPos2(final Pair<X0,X1> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Octet<A,B,C,X0,X1,D,E,F> insertInPos3(final Pair<X0,X1> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Octet<A,B,C,D,X0,X1,E,F> insertInPos4(final Pair<X0,X1> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Octet<A,B,C,D,E,X0,X1,F> insertInPos5(final Pair<X0,X1> tuple) {
        return insertInPos5(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Octet<A,B,C,D,E,F,X0,X1> insertInPos6(final Pair<X0,X1> tuple) {
        return insertInPos6(tuple.getValue0(),tuple.getValue1());
    }

    
    

    
    
    
    
    public <X0,X1,X2> Ennead<X0,X1,X2,A,B,C,D,E,F> insertInPos0(final Triplet<X0,X1,X2> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Ennead<A,X0,X1,X2,B,C,D,E,F> insertInPos1(final Triplet<X0,X1,X2> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Ennead<A,B,X0,X1,X2,C,D,E,F> insertInPos2(final Triplet<X0,X1,X2> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Ennead<A,B,C,X0,X1,X2,D,E,F> insertInPos3(final Triplet<X0,X1,X2> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Ennead<A,B,C,D,X0,X1,X2,E,F> insertInPos4(final Triplet<X0,X1,X2> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Ennead<A,B,C,D,E,X0,X1,X2,F> insertInPos5(final Triplet<X0,X1,X2> tuple) {
        return insertInPos5(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Ennead<A,B,C,D,E,F,X0,X1,X2> insertInPos6(final Triplet<X0,X1,X2> tuple) {
        return insertInPos6(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    
    


    
    
    
    
    public <X0,X1,X2,X3> Decade<X0,X1,X2,X3,A,B,C,D,E,F> insertInPos0(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Decade<A,X0,X1,X2,X3,B,C,D,E,F> insertInPos1(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Decade<A,B,X0,X1,X2,X3,C,D,E,F> insertInPos2(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Decade<A,B,C,X0,X1,X2,X3,D,E,F> insertInPos3(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Decade<A,B,C,D,X0,X1,X2,X3,E,F> insertInPos4(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Decade<A,B,C,D,E,X0,X1,X2,X3,F> insertInPos5(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos5(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Decade<A,B,C,D,E,F,X0,X1,X2,X3> insertInPos6(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos6(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }

    
    
    
    
    
    
    
    
    public <X0> Septet<A,B,C,D,E,F,X0> append(final X0 value0) {
        return insertInPos6(value0);
    }
    
    
    public <X0> Septet<A,B,C,D,E,F,X0> append(final Unit<X0> tuple) {
        return insertInPos6(tuple);
    }
    
    
    
    
    public <X0,X1> Octet<A,B,C,D,E,F,X0,X1> append(final X0 value0, final X1 value1) {
        return insertInPos6(value0, value1);
    }
    
    
    public <X0,X1> Octet<A,B,C,D,E,F,X0,X1> append(final Pair<X0,X1> tuple) {
        return insertInPos6(tuple);
    }
    
    
    
    
    public <X0,X1,X2> Ennead<A,B,C,D,E,F,X0,X1,X2> append(final X0 value0, final X1 value1, final X2 value2) {
        return insertInPos6(value0, value1, value2);
    }
    
    
    public <X0,X1,X2> Ennead<A,B,C,D,E,F,X0,X1,X2> append(final Triplet<X0,X1,X2> tuple) {
        return insertInPos6(tuple);
    }
    
    
    
    
    public <X0,X1,X2,X3> Decade<A,B,C,D,E,F,X0,X1,X2,X3> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return insertInPos6(value0, value1, value2, value3);
    }
    
    
    public <X0,X1,X2,X3> Decade<A,B,C,D,E,F,X0,X1,X2,X3> append(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos6(tuple);
    }
    
    

    
    
    
    
    
    public <X> Sextet<X,B,C,D,E,F> setInPos0(final X value) {
        return new Sextet<X,B,C,D,E,F>(
                value, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X> Sextet<A,X,C,D,E,F> setInPos1(final X value) {
        return new Sextet<A,X,C,D,E,F>(
                this.val0, value, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X> Sextet<A,B,X,D,E,F> setInPos2(final X value) {
        return new Sextet<A,B,X,D,E,F>(
                this.val0, this.val1, value, this.val3, this.val4, this.val5);
    }
    
    public <X> Sextet<A,B,C,X,E,F> setInPos3(final X value) {
        return new Sextet<A,B,C,X,E,F>(
                this.val0, this.val1, this.val2, value, this.val4, this.val5);
    }
    
    public <X> Sextet<A,B,C,D,X,F> setInPos4(final X value) {
        return new Sextet<A,B,C,D,X,F>(
                this.val0, this.val1, this.val2, this.val3, value, this.val5);
    }
    
    public <X> Sextet<A,B,C,D,E,X> setInPos5(final X value) {
        return new Sextet<A,B,C,D,E,X>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value);
    }
    
    
    
}
