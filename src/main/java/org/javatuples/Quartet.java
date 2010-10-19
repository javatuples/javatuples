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

public final class Quartet<A,B,C,D> extends Tuple {

    private static final long serialVersionUID = 2445136048617019549L;

    private static final int SIZE = 4;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    
    
    
    public static <A,B,C,D> Quartet<A,B,C,D> with(final A value0, final B value1, final C value2, final D value3) {
        return new Quartet<A,B,C,D>(value0,value1,value2,value3);
    }
    
    
    public Quartet(
            final A value0,
            final B value1,
            final C value2,
            final D value3) {
        super(SIZE, value0, value1, value2, value3);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
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


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    
    
    
    
    public <X0> Quintet<X0,A,B,C,D> insertInPos0(final X0 value0) {
        return new Quintet<X0,A,B,C,D>(
                value0, this.val0, this.val1, this.val2, this.val3);
    }
    
    public <X0> Quintet<A,X0,B,C,D> insertInPos1(final X0 value0) {
        return new Quintet<A,X0,B,C,D>(
                this.val0, value0, this.val1, this.val2, this.val3);
    }
    
    public <X0> Quintet<A,B,X0,C,D> insertInPos2(final X0 value0) {
        return new Quintet<A,B,X0,C,D>(
                this.val0, this.val1, value0, this.val2, this.val3);
    }
    
    public <X0> Quintet<A,B,C,X0,D> insertInPos3(final X0 value0) {
        return new Quintet<A,B,C,X0,D>(
                this.val0, this.val1, this.val2, value0, this.val3);
    }
    
    public <X0> Quintet<A,B,C,D,X0> insertInPos4(final X0 value0) {
        return new Quintet<A,B,C,D,X0>(
                this.val0, this.val1, this.val2, this.val3, value0);
    }

    
    
    
    
    public <X0,X1> Sextet<X0,X1,A,B,C,D> insertInPos0(final X0 value0, final X1 value1) {
        return new Sextet<X0,X1,A,B,C,D>(
                value0, value1, this.val0, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1> Sextet<A,X0,X1,B,C,D> insertInPos1(final X0 value0, final X1 value1) {
        return new Sextet<A,X0,X1,B,C,D>(
                this.val0, value0, value1, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1> Sextet<A,B,X0,X1,C,D> insertInPos2(final X0 value0, final X1 value1) {
        return new Sextet<A,B,X0,X1,C,D>(
                this.val0, this.val1, value0, value1, this.val2, this.val3);
    }
    
    public <X0,X1> Sextet<A,B,C,X0,X1,D> insertInPos3(final X0 value0, final X1 value1) {
        return new Sextet<A,B,C,X0,X1,D>(
                this.val0, this.val1, this.val2, value0, value1, this.val3);
    }
    
    public <X0,X1> Sextet<A,B,C,D,X0,X1> insertInPos4(final X0 value0, final X1 value1) {
        return new Sextet<A,B,C,D,X0,X1>(
                this.val0, this.val1, this.val2, this.val3, value0, value1);
    }
    


    
    
    
    
    public <X0,X1,X2> Septet<X0,X1,X2,A,B,C,D> insertInPos0(final X0 value0, final X1 value1, final X2 value2) {
        return new Septet<X0,X1,X2,A,B,C,D>(
                value0, value1, value2, this.val0, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1,X2> Septet<A,X0,X1,X2,B,C,D> insertInPos1(final X0 value0, final X1 value1, final X2 value2) {
        return new Septet<A,X0,X1,X2,B,C,D>(
                this.val0, value0, value1, value2, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1,X2> Septet<A,B,X0,X1,X2,C,D> insertInPos2(final X0 value0, final X1 value1, final X2 value2) {
        return new Septet<A,B,X0,X1,X2,C,D>(
                this.val0, this.val1, value0, value1, value2, this.val2, this.val3);
    }
    
    public <X0,X1,X2> Septet<A,B,C,X0,X1,X2,D> insertInPos3(final X0 value0, final X1 value1, final X2 value2) {
        return new Septet<A,B,C,X0,X1,X2,D>(
                this.val0, this.val1, this.val2, value0, value1, value2, this.val3);
    }
    
    public <X0,X1,X2> Septet<A,B,C,D,X0,X1,X2> insertInPos4(final X0 value0, final X1 value1, final X2 value2) {
        return new Septet<A,B,C,D,X0,X1,X2>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2);
    }
    


    
    
    
    
    public <X0,X1,X2,X3> Octet<X0,X1,X2,X3,A,B,C,D> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Octet<X0,X1,X2,X3,A,B,C,D>(
                value0, value1, value2, value3, this.val0, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3> Octet<A,X0,X1,X2,X3,B,C,D> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Octet<A,X0,X1,X2,X3,B,C,D>(
                this.val0, value0, value1, value2, value3, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3> Octet<A,B,X0,X1,X2,X3,C,D> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Octet<A,B,X0,X1,X2,X3,C,D>(
                this.val0, this.val1, value0, value1, value2, value3, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3> Octet<A,B,C,X0,X1,X2,X3,D> insertInPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Octet<A,B,C,X0,X1,X2,X3,D>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, this.val3);
    }
    
    public <X0,X1,X2,X3> Octet<A,B,C,D,X0,X1,X2,X3> insertInPos4(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Octet<A,B,C,D,X0,X1,X2,X3>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, value3);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4> Ennead<X0,X1,X2,X3,X4,A,B,C,D> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Ennead<X0,X1,X2,X3,X4,A,B,C,D>(
                value0, value1, value2, value3, value4, this.val0, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3,X4> Ennead<A,X0,X1,X2,X3,X4,B,C,D> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Ennead<A,X0,X1,X2,X3,X4,B,C,D>(
                this.val0, value0, value1, value2, value3, value4, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3,X4> Ennead<A,B,X0,X1,X2,X3,X4,C,D> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Ennead<A,B,X0,X1,X2,X3,X4,C,D>(
                this.val0, this.val1, value0, value1, value2, value3, value4, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3,X4> Ennead<A,B,C,X0,X1,X2,X3,X4,D> insertInPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Ennead<A,B,C,X0,X1,X2,X3,X4,D>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, value4, this.val3);
    }
    
    public <X0,X1,X2,X3,X4> Ennead<A,B,C,D,X0,X1,X2,X3,X4> insertInPos4(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Ennead<A,B,C,D,X0,X1,X2,X3,X4>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, value3, value4);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Decade<X0,X1,X2,X3,X4,X5,A,B,C,D> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Decade<X0,X1,X2,X3,X4,X5,A,B,C,D>(
                value0, value1, value2, value3, value4, value5, this.val0, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,X0,X1,X2,X3,X4,X5,B,C,D> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Decade<A,X0,X1,X2,X3,X4,X5,B,C,D>(
                this.val0, value0, value1, value2, value3, value4, value5, this.val1, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,B,X0,X1,X2,X3,X4,X5,C,D> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Decade<A,B,X0,X1,X2,X3,X4,X5,C,D>(
                this.val0, this.val1, value0, value1, value2, value3, value4, value5, this.val2, this.val3);
    }
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,B,C,X0,X1,X2,X3,X4,X5,D> insertInPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Decade<A,B,C,X0,X1,X2,X3,X4,X5,D>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, value4, value5, this.val3);
    }
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,B,C,D,X0,X1,X2,X3,X4,X5> insertInPos4(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Decade<A,B,C,D,X0,X1,X2,X3,X4,X5>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, value3, value4, value5);
    }

    
    
    
    
    
    
    public <X0> Quintet<X0,A,B,C,D> insertInPos0(final Unit<X0> tuple) {
        return insertInPos0(tuple.getValue0());
    }
    
    public <X0> Quintet<A,X0,B,C,D> insertInPos1(final Unit<X0> tuple) {
        return insertInPos1(tuple.getValue0());
    }
    
    public <X0> Quintet<A,B,X0,C,D> insertInPos2(final Unit<X0> tuple) {
        return insertInPos2(tuple.getValue0());
    }
    
    public <X0> Quintet<A,B,C,X0,D> insertInPos3(final Unit<X0> tuple) {
        return insertInPos3(tuple.getValue0());
    }
    
    public <X0> Quintet<A,B,C,D,X0> insertInPos4(final Unit<X0> tuple) {
        return insertInPos4(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Sextet<X0,X1,A,B,C,D> insertInPos0(final Pair<X0,X1> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Sextet<A,X0,X1,B,C,D> insertInPos1(final Pair<X0,X1> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Sextet<A,B,X0,X1,C,D> insertInPos2(final Pair<X0,X1> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Sextet<A,B,C,X0,X1,D> insertInPos3(final Pair<X0,X1> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Sextet<A,B,C,D,X0,X1> insertInPos4(final Pair<X0,X1> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1());
    }

    
    

    
    
    
    
    public <X0,X1,X2> Septet<X0,X1,X2,A,B,C,D> insertInPos0(final Triplet<X0,X1,X2> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Septet<A,X0,X1,X2,B,C,D> insertInPos1(final Triplet<X0,X1,X2> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Septet<A,B,X0,X1,X2,C,D> insertInPos2(final Triplet<X0,X1,X2> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Septet<A,B,C,X0,X1,X2,D> insertInPos3(final Triplet<X0,X1,X2> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Septet<A,B,C,D,X0,X1,X2> insertInPos4(final Triplet<X0,X1,X2> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    
    


    
    
    
    
    public <X0,X1,X2,X3> Octet<X0,X1,X2,X3,A,B,C,D> insertInPos0(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Octet<A,X0,X1,X2,X3,B,C,D> insertInPos1(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Octet<A,B,X0,X1,X2,X3,C,D> insertInPos2(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Octet<A,B,C,X0,X1,X2,X3,D> insertInPos3(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Octet<A,B,C,D,X0,X1,X2,X3> insertInPos4(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4> Ennead<X0,X1,X2,X3,X4,A,B,C,D> insertInPos0(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Ennead<A,X0,X1,X2,X3,X4,B,C,D> insertInPos1(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Ennead<A,B,X0,X1,X2,X3,X4,C,D> insertInPos2(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Ennead<A,B,C,X0,X1,X2,X3,X4,D> insertInPos3(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Ennead<A,B,C,D,X0,X1,X2,X3,X4> insertInPos4(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Decade<X0,X1,X2,X3,X4,X5,A,B,C,D> insertInPos0(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,X0,X1,X2,X3,X4,X5,B,C,D> insertInPos1(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,B,X0,X1,X2,X3,X4,X5,C,D> insertInPos2(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,B,C,X0,X1,X2,X3,X4,X5,D> insertInPos3(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,B,C,D,X0,X1,X2,X3,X4,X5> insertInPos4(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }

    
    
    
    
    
    public <X0> Quintet<A,B,C,D,X0> append(final X0 value0) {
        return insertInPos4(value0);
    }
    
    
    public <X0> Quintet<A,B,C,D,X0> append(final Unit<X0> tuple) {
        return insertInPos4(tuple);
    }
    
    
    
    
    public <X0,X1> Sextet<A,B,C,D,X0,X1> append(final X0 value0, final X1 value1) {
        return insertInPos4(value0, value1);
    }
    
    
    public <X0,X1> Sextet<A,B,C,D,X0,X1> append(final Pair<X0,X1> tuple) {
        return insertInPos4(tuple);
    }
    
    
    
    
    public <X0,X1,X2> Septet<A,B,C,D,X0,X1,X2> append(final X0 value0, final X1 value1, final X2 value2) {
        return insertInPos4(value0, value1, value2);
    }
    
    
    public <X0,X1,X2> Septet<A,B,C,D,X0,X1,X2> append(final Triplet<X0,X1,X2> tuple) {
        return insertInPos4(tuple);
    }
    
    
    
    
    public <X0,X1,X2,X3> Octet<A,B,C,D,X0,X1,X2,X3> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return insertInPos4(value0, value1, value2, value3);
    }
    
    
    public <X0,X1,X2,X3> Octet<A,B,C,D,X0,X1,X2,X3> append(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos4(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4> Ennead<A,B,C,D,X0,X1,X2,X3,X4> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return insertInPos4(value0, value1, value2, value3, value4);
    }
    
    
    public <X0,X1,X2,X3,X4> Ennead<A,B,C,D,X0,X1,X2,X3,X4> append(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos4(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,B,C,D,X0,X1,X2,X3,X4,X5> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return insertInPos4(value0, value1, value2, value3, value4, value5);
    }
    
    
    public <X0,X1,X2,X3,X4,X5> Decade<A,B,C,D,X0,X1,X2,X3,X4,X5> append(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos4(tuple);
    }
    
    
    
    
}
