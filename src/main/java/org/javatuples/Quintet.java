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

public final class Quintet<A,B,C,D,E> extends Tuple {

    private static final long serialVersionUID = -1579008485383872628L;

    private static final int SIZE = 5;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    
    
    
    public static <A,B,C,D,E> Quintet<A,B,C,D,E> with(final A value0, final B value1, final C value2, final D value3, final E value4) {
        return new Quintet<A,B,C,D,E>(value0,value1,value2,value3,value4);
    }
    
    
    public Quintet(
            final A value0,
            final B value1,
            final C value2,
            final D value3,
            final E value4) {
        super(SIZE, value0, value1, value2, value3, value4);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
        this.val4 = value4;
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


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    

    
    
    
    public <X0> Sextet<X0,A,B,C,D,E> addAtPos0(final X0 value0) {
        return new Sextet<X0,A,B,C,D,E>(
                value0, this.val0, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0> Sextet<A,X0,B,C,D,E> addAtPos1(final X0 value0) {
        return new Sextet<A,X0,B,C,D,E>(
                this.val0, value0, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0> Sextet<A,B,X0,C,D,E> addAtPos2(final X0 value0) {
        return new Sextet<A,B,X0,C,D,E>(
                this.val0, this.val1, value0, this.val2, this.val3, this.val4);
    }
    
    public <X0> Sextet<A,B,C,X0,D,E> addAtPos3(final X0 value0) {
        return new Sextet<A,B,C,X0,D,E>(
                this.val0, this.val1, this.val2, value0, this.val3, this.val4);
    }
    
    public <X0> Sextet<A,B,C,D,X0,E> addAtPos4(final X0 value0) {
        return new Sextet<A,B,C,D,X0,E>(
                this.val0, this.val1, this.val2, this.val3, value0, this.val4);
    }
    
    public <X0> Sextet<A,B,C,D,E,X0> addAtPos5(final X0 value0) {
        return new Sextet<A,B,C,D,E,X0>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0);
    }

    
    
    
    
    public <X0,X1> Septet<X0,X1,A,B,C,D,E> addAtPos0(final X0 value0, final X1 value1) {
        return new Septet<X0,X1,A,B,C,D,E>(
                value0, value1, this.val0, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1> Septet<A,X0,X1,B,C,D,E> addAtPos1(final X0 value0, final X1 value1) {
        return new Septet<A,X0,X1,B,C,D,E>(
                this.val0, value0, value1, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1> Septet<A,B,X0,X1,C,D,E> addAtPos2(final X0 value0, final X1 value1) {
        return new Septet<A,B,X0,X1,C,D,E>(
                this.val0, this.val1, value0, value1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1> Septet<A,B,C,X0,X1,D,E> addAtPos3(final X0 value0, final X1 value1) {
        return new Septet<A,B,C,X0,X1,D,E>(
                this.val0, this.val1, this.val2, value0, value1, this.val3, this.val4);
    }
    
    public <X0,X1> Septet<A,B,C,D,X0,X1,E> addAtPos4(final X0 value0, final X1 value1) {
        return new Septet<A,B,C,D,X0,X1,E>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, this.val4);
    }
    
    public <X0,X1> Septet<A,B,C,D,E,X0,X1> addAtPos5(final X0 value0, final X1 value1) {
        return new Septet<A,B,C,D,E,X0,X1>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1);
    }
    


    
    
    
    
    public <X0,X1,X2> Octet<X0,X1,X2,A,B,C,D,E> addAtPos0(final X0 value0, final X1 value1, final X2 value2) {
        return new Octet<X0,X1,X2,A,B,C,D,E>(
                value0, value1, value2, this.val0, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2> Octet<A,X0,X1,X2,B,C,D,E> addAtPos1(final X0 value0, final X1 value1, final X2 value2) {
        return new Octet<A,X0,X1,X2,B,C,D,E>(
                this.val0, value0, value1, value2, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2> Octet<A,B,X0,X1,X2,C,D,E> addAtPos2(final X0 value0, final X1 value1, final X2 value2) {
        return new Octet<A,B,X0,X1,X2,C,D,E>(
                this.val0, this.val1, value0, value1, value2, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2> Octet<A,B,C,X0,X1,X2,D,E> addAtPos3(final X0 value0, final X1 value1, final X2 value2) {
        return new Octet<A,B,C,X0,X1,X2,D,E>(
                this.val0, this.val1, this.val2, value0, value1, value2, this.val3, this.val4);
    }
    
    public <X0,X1,X2> Octet<A,B,C,D,X0,X1,X2,E> addAtPos4(final X0 value0, final X1 value1, final X2 value2) {
        return new Octet<A,B,C,D,X0,X1,X2,E>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, this.val4);
    }
    
    public <X0,X1,X2> Octet<A,B,C,D,E,X0,X1,X2> addAtPos5(final X0 value0, final X1 value1, final X2 value2) {
        return new Octet<A,B,C,D,E,X0,X1,X2>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, value2);
    }
    


    
    
    
    
    public <X0,X1,X2,X3> Ennead<X0,X1,X2,X3,A,B,C,D,E> addAtPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Ennead<X0,X1,X2,X3,A,B,C,D,E>(
                value0, value1, value2, value3, this.val0, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2,X3> Ennead<A,X0,X1,X2,X3,B,C,D,E> addAtPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Ennead<A,X0,X1,X2,X3,B,C,D,E>(
                this.val0, value0, value1, value2, value3, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2,X3> Ennead<A,B,X0,X1,X2,X3,C,D,E> addAtPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Ennead<A,B,X0,X1,X2,X3,C,D,E>(
                this.val0, this.val1, value0, value1, value2, value3, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2,X3> Ennead<A,B,C,X0,X1,X2,X3,D,E> addAtPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Ennead<A,B,C,X0,X1,X2,X3,D,E>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, this.val3, this.val4);
    }
    
    public <X0,X1,X2,X3> Ennead<A,B,C,D,X0,X1,X2,X3,E> addAtPos4(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Ennead<A,B,C,D,X0,X1,X2,X3,E>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, value3, this.val4);
    }
    
    public <X0,X1,X2,X3> Ennead<A,B,C,D,E,X0,X1,X2,X3> addAtPos5(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Ennead<A,B,C,D,E,X0,X1,X2,X3>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, value2, value3);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4> Decade<X0,X1,X2,X3,X4,A,B,C,D,E> addAtPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Decade<X0,X1,X2,X3,X4,A,B,C,D,E>(
                value0, value1, value2, value3, value4, this.val0, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,X0,X1,X2,X3,X4,B,C,D,E> addAtPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Decade<A,X0,X1,X2,X3,X4,B,C,D,E>(
                this.val0, value0, value1, value2, value3, value4, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,B,X0,X1,X2,X3,X4,C,D,E> addAtPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Decade<A,B,X0,X1,X2,X3,X4,C,D,E>(
                this.val0, this.val1, value0, value1, value2, value3, value4, this.val2, this.val3, this.val4);
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,B,C,X0,X1,X2,X3,X4,D,E> addAtPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Decade<A,B,C,X0,X1,X2,X3,X4,D,E>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, value4, this.val3, this.val4);
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,B,C,D,X0,X1,X2,X3,X4,E> addAtPos4(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Decade<A,B,C,D,X0,X1,X2,X3,X4,E>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, value3, value4, this.val4);
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,B,C,D,E,X0,X1,X2,X3,X4> addAtPos5(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Decade<A,B,C,D,E,X0,X1,X2,X3,X4>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, value2, value3, value4);
    }

    
    
    
    
    
    
    public <X0> Sextet<X0,A,B,C,D,E> addAtPos0(final Unit<X0> tuple) {
        return addAtPos0(tuple.getValue0());
    }
    
    public <X0> Sextet<A,X0,B,C,D,E> addAtPos1(final Unit<X0> tuple) {
        return addAtPos1(tuple.getValue0());
    }
    
    public <X0> Sextet<A,B,X0,C,D,E> addAtPos2(final Unit<X0> tuple) {
        return addAtPos2(tuple.getValue0());
    }
    
    public <X0> Sextet<A,B,C,X0,D,E> addAtPos3(final Unit<X0> tuple) {
        return addAtPos3(tuple.getValue0());
    }
    
    public <X0> Sextet<A,B,C,D,X0,E> addAtPos4(final Unit<X0> tuple) {
        return addAtPos4(tuple.getValue0());
    }
    
    public <X0> Sextet<A,B,C,D,E,X0> addAtPos5(final Unit<X0> tuple) {
        return addAtPos5(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Septet<X0,X1,A,B,C,D,E> addAtPos0(final Pair<X0,X1> tuple) {
        return addAtPos0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Septet<A,X0,X1,B,C,D,E> addAtPos1(final Pair<X0,X1> tuple) {
        return addAtPos1(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Septet<A,B,X0,X1,C,D,E> addAtPos2(final Pair<X0,X1> tuple) {
        return addAtPos2(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Septet<A,B,C,X0,X1,D,E> addAtPos3(final Pair<X0,X1> tuple) {
        return addAtPos3(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Septet<A,B,C,D,X0,X1,E> addAtPos4(final Pair<X0,X1> tuple) {
        return addAtPos4(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Septet<A,B,C,D,E,X0,X1> addAtPos5(final Pair<X0,X1> tuple) {
        return addAtPos5(tuple.getValue0(),tuple.getValue1());
    }

    
    

    
    
    
    
    public <X0,X1,X2> Octet<X0,X1,X2,A,B,C,D,E> addAtPos0(final Triplet<X0,X1,X2> tuple) {
        return addAtPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Octet<A,X0,X1,X2,B,C,D,E> addAtPos1(final Triplet<X0,X1,X2> tuple) {
        return addAtPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Octet<A,B,X0,X1,X2,C,D,E> addAtPos2(final Triplet<X0,X1,X2> tuple) {
        return addAtPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Octet<A,B,C,X0,X1,X2,D,E> addAtPos3(final Triplet<X0,X1,X2> tuple) {
        return addAtPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Octet<A,B,C,D,X0,X1,X2,E> addAtPos4(final Triplet<X0,X1,X2> tuple) {
        return addAtPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Octet<A,B,C,D,E,X0,X1,X2> addAtPos5(final Triplet<X0,X1,X2> tuple) {
        return addAtPos5(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    
    


    
    
    
    
    public <X0,X1,X2,X3> Ennead<X0,X1,X2,X3,A,B,C,D,E> addAtPos0(final Quartet<X0,X1,X2,X3> tuple) {
        return addAtPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Ennead<A,X0,X1,X2,X3,B,C,D,E> addAtPos1(final Quartet<X0,X1,X2,X3> tuple) {
        return addAtPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Ennead<A,B,X0,X1,X2,X3,C,D,E> addAtPos2(final Quartet<X0,X1,X2,X3> tuple) {
        return addAtPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Ennead<A,B,C,X0,X1,X2,X3,D,E> addAtPos3(final Quartet<X0,X1,X2,X3> tuple) {
        return addAtPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Ennead<A,B,C,D,X0,X1,X2,X3,E> addAtPos4(final Quartet<X0,X1,X2,X3> tuple) {
        return addAtPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Ennead<A,B,C,D,E,X0,X1,X2,X3> addAtPos5(final Quartet<X0,X1,X2,X3> tuple) {
        return addAtPos5(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4> Decade<X0,X1,X2,X3,X4,A,B,C,D,E> addAtPos0(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return addAtPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,X0,X1,X2,X3,X4,B,C,D,E> addAtPos1(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return addAtPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,B,X0,X1,X2,X3,X4,C,D,E> addAtPos2(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return addAtPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,B,C,X0,X1,X2,X3,X4,D,E> addAtPos3(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return addAtPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,B,C,D,X0,X1,X2,X3,X4,E> addAtPos4(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return addAtPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Decade<A,B,C,D,E,X0,X1,X2,X3,X4> addAtPos5(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return addAtPos5(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }

    
    
    
    
    
    public <X0> Sextet<A,B,C,D,E,X0> append(final X0 value0) {
        return addAtPos5(value0);
    }
    
    
    public <X0> Sextet<A,B,C,D,E,X0> append(final Unit<X0> tuple) {
        return addAtPos5(tuple);
    }
    
    
    
    
    public <X0,X1> Septet<A,B,C,D,E,X0,X1> append(final X0 value0, final X1 value1) {
        return addAtPos5(value0, value1);
    }
    
    
    public <X0,X1> Septet<A,B,C,D,E,X0,X1> append(final Pair<X0,X1> tuple) {
        return addAtPos5(tuple);
    }
    
    
    
    
    public <X0,X1,X2> Octet<A,B,C,D,E,X0,X1,X2> append(final X0 value0, final X1 value1, final X2 value2) {
        return addAtPos5(value0, value1, value2);
    }
    
    
    public <X0,X1,X2> Octet<A,B,C,D,E,X0,X1,X2> append(final Triplet<X0,X1,X2> tuple) {
        return addAtPos5(tuple);
    }
    
    
    
    
    public <X0,X1,X2,X3> Ennead<A,B,C,D,E,X0,X1,X2,X3> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return addAtPos5(value0, value1, value2, value3);
    }
    
    
    public <X0,X1,X2,X3> Ennead<A,B,C,D,E,X0,X1,X2,X3> append(final Quartet<X0,X1,X2,X3> tuple) {
        return addAtPos5(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4> Decade<A,B,C,D,E,X0,X1,X2,X3,X4> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return addAtPos5(value0, value1, value2, value3, value4);
    }
    
    
    public <X0,X1,X2,X3,X4> Decade<A,B,C,D,E,X0,X1,X2,X3,X4> append(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return addAtPos5(tuple);
    }
    
    
    
    
    
    
    public <X> Quintet<X,B,C,D,E> setAtPos0(final X value) {
        return new Quintet<X,B,C,D,E>(
                value, this.val1, this.val2, this.val3, this.val4);
    }
    
    public <X> Quintet<A,X,C,D,E> setAtPos1(final X value) {
        return new Quintet<A,X,C,D,E>(
                this.val0, value, this.val2, this.val3, this.val4);
    }
    
    public <X> Quintet<A,B,X,D,E> setAtPos2(final X value) {
        return new Quintet<A,B,X,D,E>(
                this.val0, this.val1, value, this.val3, this.val4);
    }
    
    public <X> Quintet<A,B,C,X,E> setAtPos3(final X value) {
        return new Quintet<A,B,C,X,E>(
                this.val0, this.val1, this.val2, value, this.val4);
    }
    
    public <X> Quintet<A,B,C,D,X> setAtPos4(final X value) {
        return new Quintet<A,B,C,D,X>(
                this.val0, this.val1, this.val2, this.val3, value);
    }
    
    
}
