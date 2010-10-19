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

public final class Triplet<A,B,C> extends Tuple {

    private static final long serialVersionUID = -1877265551599483740L;

    private static final int SIZE = 3;

    private final A val0;
    private final B val1;
    private final C val2;
    
    
    
    public static <A,B,C> Triplet<A,B,C> with(final A value0, final B value1, final C value2) {
        return new Triplet<A,B,C>(value0,value1,value2);
    }

    
    
    public Triplet(
            final A value0,
            final B value1,
            final C value2) {
        super(SIZE, value0, value1, value2);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
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


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    
    
    
    
    
    
    public <X0> Quartet<X0,A,B,C> insertInPos0(final X0 value0) {
        return new Quartet<X0,A,B,C>(
                value0, this.val0, this.val1, this.val2);
    }
    
    public <X0> Quartet<A,X0,B,C> insertInPos1(final X0 value0) {
        return new Quartet<A,X0,B,C>(
                this.val0, value0, this.val1, this.val2);
    }
    
    public <X0> Quartet<A,B,X0,C> insertInPos2(final X0 value0) {
        return new Quartet<A,B,X0,C>(
                this.val0, this.val1, value0, this.val2);
    }
    
    public <X0> Quartet<A,B,C,X0> insertInPos3(final X0 value0) {
        return new Quartet<A,B,C,X0>(
                this.val0, this.val1, this.val2, value0);
    }

    
    
    
    
    public <X0,X1> Quintet<X0,X1,A,B,C> insertInPos0(final X0 value0, final X1 value1) {
        return new Quintet<X0,X1,A,B,C>(
                value0, value1, this.val0, this.val1, this.val2);
    }
    
    public <X0,X1> Quintet<A,X0,X1,B,C> insertInPos1(final X0 value0, final X1 value1) {
        return new Quintet<A,X0,X1,B,C>(
                this.val0, value0, value1, this.val1, this.val2);
    }
    
    public <X0,X1> Quintet<A,B,X0,X1,C> insertInPos2(final X0 value0, final X1 value1) {
        return new Quintet<A,B,X0,X1,C>(
                this.val0, this.val1, value0, value1, this.val2);
    }
    
    public <X0,X1> Quintet<A,B,C,X0,X1> insertInPos3(final X0 value0, final X1 value1) {
        return new Quintet<A,B,C,X0,X1>(
                this.val0, this.val1, this.val2, value0, value1);
    }
    


    
    
    
    
    public <X0,X1,X2> Sextet<X0,X1,X2,A,B,C> insertInPos0(final X0 value0, final X1 value1, final X2 value2) {
        return new Sextet<X0,X1,X2,A,B,C>(
                value0, value1, value2, this.val0, this.val1, this.val2);
    }
    
    public <X0,X1,X2> Sextet<A,X0,X1,X2,B,C> insertInPos1(final X0 value0, final X1 value1, final X2 value2) {
        return new Sextet<A,X0,X1,X2,B,C>(
                this.val0, value0, value1, value2, this.val1, this.val2);
    }
    
    public <X0,X1,X2> Sextet<A,B,X0,X1,X2,C> insertInPos2(final X0 value0, final X1 value1, final X2 value2) {
        return new Sextet<A,B,X0,X1,X2,C>(
                this.val0, this.val1, value0, value1, value2, this.val2);
    }
    
    public <X0,X1,X2> Sextet<A,B,C,X0,X1,X2> insertInPos3(final X0 value0, final X1 value1, final X2 value2) {
        return new Sextet<A,B,C,X0,X1,X2>(
                this.val0, this.val1, this.val2, value0, value1, value2);
    }
    


    
    
    
    
    public <X0,X1,X2,X3> Septet<X0,X1,X2,X3,A,B,C> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Septet<X0,X1,X2,X3,A,B,C>(
                value0, value1, value2, value3, this.val0, this.val1, this.val2);
    }
    
    public <X0,X1,X2,X3> Septet<A,X0,X1,X2,X3,B,C> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Septet<A,X0,X1,X2,X3,B,C>(
                this.val0, value0, value1, value2, value3, this.val1, this.val2);
    }
    
    public <X0,X1,X2,X3> Septet<A,B,X0,X1,X2,X3,C> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Septet<A,B,X0,X1,X2,X3,C>(
                this.val0, this.val1, value0, value1, value2, value3, this.val2);
    }
    
    public <X0,X1,X2,X3> Septet<A,B,C,X0,X1,X2,X3> insertInPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Septet<A,B,C,X0,X1,X2,X3>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4> Octet<X0,X1,X2,X3,X4,A,B,C> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Octet<X0,X1,X2,X3,X4,A,B,C>(
                value0, value1, value2, value3, value4, this.val0, this.val1, this.val2);
    }
    
    public <X0,X1,X2,X3,X4> Octet<A,X0,X1,X2,X3,X4,B,C> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Octet<A,X0,X1,X2,X3,X4,B,C>(
                this.val0, value0, value1, value2, value3, value4, this.val1, this.val2);
    }
    
    public <X0,X1,X2,X3,X4> Octet<A,B,X0,X1,X2,X3,X4,C> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Octet<A,B,X0,X1,X2,X3,X4,C>(
                this.val0, this.val1, value0, value1, value2, value3, value4, this.val2);
    }
    
    public <X0,X1,X2,X3,X4> Octet<A,B,C,X0,X1,X2,X3,X4> insertInPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Octet<A,B,C,X0,X1,X2,X3,X4>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, value4);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Ennead<X0,X1,X2,X3,X4,X5,A,B,C> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Ennead<X0,X1,X2,X3,X4,X5,A,B,C>(
                value0, value1, value2, value3, value4, value5, this.val0, this.val1, this.val2);
    }
    
    public <X0,X1,X2,X3,X4,X5> Ennead<A,X0,X1,X2,X3,X4,X5,B,C> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Ennead<A,X0,X1,X2,X3,X4,X5,B,C>(
                this.val0, value0, value1, value2, value3, value4, value5, this.val1, this.val2);
    }
    
    public <X0,X1,X2,X3,X4,X5> Ennead<A,B,X0,X1,X2,X3,X4,X5,C> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Ennead<A,B,X0,X1,X2,X3,X4,X5,C>(
                this.val0, this.val1, value0, value1, value2, value3, value4, value5, this.val2);
    }
    
    public <X0,X1,X2,X3,X4,X5> Ennead<A,B,C,X0,X1,X2,X3,X4,X5> insertInPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Ennead<A,B,C,X0,X1,X2,X3,X4,X5>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, value4, value5);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<X0,X1,X2,X3,X4,X5,X6,A,B,C> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Decade<X0,X1,X2,X3,X4,X5,X6,A,B,C>(
                value0, value1, value2, value3, value4, value5, value6, this.val0, this.val1, this.val2);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<A,X0,X1,X2,X3,X4,X5,X6,B,C> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Decade<A,X0,X1,X2,X3,X4,X5,X6,B,C>(
                this.val0, value0, value1, value2, value3, value4, value5, value6, this.val1, this.val2);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<A,B,X0,X1,X2,X3,X4,X5,X6,C> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Decade<A,B,X0,X1,X2,X3,X4,X5,X6,C>(
                this.val0, this.val1, value0, value1, value2, value3, value4, value5, value6, this.val2);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<A,B,C,X0,X1,X2,X3,X4,X5,X6> insertInPos3(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Decade<A,B,C,X0,X1,X2,X3,X4,X5,X6>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, value4, value5, value6);
    }

    
    
    
    
    
    
    public <X0> Quartet<X0,A,B,C> insertInPos0(final Unit<X0> tuple) {
        return insertInPos0(tuple.getValue0());
    }
    
    public <X0> Quartet<A,X0,B,C> insertInPos1(final Unit<X0> tuple) {
        return insertInPos1(tuple.getValue0());
    }
    
    public <X0> Quartet<A,B,X0,C> insertInPos2(final Unit<X0> tuple) {
        return insertInPos2(tuple.getValue0());
    }
    
    public <X0> Quartet<A,B,C,X0> insertInPos3(final Unit<X0> tuple) {
        return insertInPos3(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Quintet<X0,X1,A,B,C> insertInPos0(final Pair<X0,X1> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Quintet<A,X0,X1,B,C> insertInPos1(final Pair<X0,X1> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Quintet<A,B,X0,X1,C> insertInPos2(final Pair<X0,X1> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Quintet<A,B,C,X0,X1> insertInPos3(final Pair<X0,X1> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1());
    }

    
    

    
    
    
    
    public <X0,X1,X2> Sextet<X0,X1,X2,A,B,C> insertInPos0(final Triplet<X0,X1,X2> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Sextet<A,X0,X1,X2,B,C> insertInPos1(final Triplet<X0,X1,X2> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Sextet<A,B,X0,X1,X2,C> insertInPos2(final Triplet<X0,X1,X2> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Sextet<A,B,C,X0,X1,X2> insertInPos3(final Triplet<X0,X1,X2> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    
    


    
    
    
    
    public <X0,X1,X2,X3> Septet<X0,X1,X2,X3,A,B,C> insertInPos0(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Septet<A,X0,X1,X2,X3,B,C> insertInPos1(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Septet<A,B,X0,X1,X2,X3,C> insertInPos2(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Septet<A,B,C,X0,X1,X2,X3> insertInPos3(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4> Octet<X0,X1,X2,X3,X4,A,B,C> insertInPos0(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Octet<A,X0,X1,X2,X3,X4,B,C> insertInPos1(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Octet<A,B,X0,X1,X2,X3,X4,C> insertInPos2(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Octet<A,B,C,X0,X1,X2,X3,X4> insertInPos3(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Ennead<X0,X1,X2,X3,X4,X5,A,B,C> insertInPos0(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Ennead<A,X0,X1,X2,X3,X4,X5,B,C> insertInPos1(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Ennead<A,B,X0,X1,X2,X3,X4,X5,C> insertInPos2(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Ennead<A,B,C,X0,X1,X2,X3,X4,X5> insertInPos3(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<X0,X1,X2,X3,X4,X5,X6,A,B,C> insertInPos0(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<A,X0,X1,X2,X3,X4,X5,X6,B,C> insertInPos1(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<A,B,X0,X1,X2,X3,X4,X5,X6,C> insertInPos2(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<A,B,C,X0,X1,X2,X3,X4,X5,X6> insertInPos3(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }

    
    
    
    
    
    public <X0> Quartet<A,B,C,X0> append(final X0 value0) {
        return insertInPos3(value0);
    }
    
    
    public <X0> Quartet<A,B,C,X0> append(final Unit<X0> tuple) {
        return insertInPos3(tuple);
    }
    
    
    
    
    public <X0,X1> Quintet<A,B,C,X0,X1> append(final X0 value0, final X1 value1) {
        return insertInPos3(value0, value1);
    }
    
    
    public <X0,X1> Quintet<A,B,C,X0,X1> append(final Pair<X0,X1> tuple) {
        return insertInPos3(tuple);
    }
    
    
    
    
    public <X0,X1,X2> Sextet<A,B,C,X0,X1,X2> append(final X0 value0, final X1 value1, final X2 value2) {
        return insertInPos3(value0, value1, value2);
    }
    
    
    public <X0,X1,X2> Sextet<A,B,C,X0,X1,X2> append(final Triplet<X0,X1,X2> tuple) {
        return insertInPos3(tuple);
    }
    
    
    
    
    public <X0,X1,X2,X3> Septet<A,B,C,X0,X1,X2,X3> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return insertInPos3(value0, value1, value2, value3);
    }
    
    
    public <X0,X1,X2,X3> Septet<A,B,C,X0,X1,X2,X3> append(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos3(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4> Octet<A,B,C,X0,X1,X2,X3,X4> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return insertInPos3(value0, value1, value2, value3, value4);
    }
    
    
    public <X0,X1,X2,X3,X4> Octet<A,B,C,X0,X1,X2,X3,X4> append(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos3(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Ennead<A,B,C,X0,X1,X2,X3,X4,X5> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return insertInPos3(value0, value1, value2, value3, value4, value5);
    }
    
    
    public <X0,X1,X2,X3,X4,X5> Ennead<A,B,C,X0,X1,X2,X3,X4,X5> append(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos3(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<A,B,C,X0,X1,X2,X3,X4,X5,X6> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return insertInPos3(value0, value1, value2, value3, value4, value5, value6);
    }
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Decade<A,B,C,X0,X1,X2,X3,X4,X5,X6> append(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos3(tuple);
    }

    
    
}
