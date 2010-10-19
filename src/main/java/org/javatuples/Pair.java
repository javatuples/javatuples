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

public final class Pair<A,B> extends Tuple {

    private static final long serialVersionUID = 2438099850625502138L;

    private static final int SIZE = 2;

    private final A val0;
    private final B val1;
    
    
    
    public static <A,B> Pair<A,B> with(final A value0, final B value1) {
        return new Pair<A,B>(value0,value1);
    }
    
    
    public Pair(
            final A value0, 
            final B value1) {
        super(SIZE, value0, value1);
        this.val0 = value0;
        this.val1 = value1;
    }


    public A getValue0() {
        return this.val0;
    }


    public B getValue1() {
        return this.val1;
    }


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    
    
    
    
    
    
    
    
    public <X0> Triplet<X0,A,B> insertInPos0(final X0 value0) {
        return new Triplet<X0,A,B>(
                value0, this.val0, this.val1);
    }
    
    public <X0> Triplet<A,X0,B> insertInPos1(final X0 value0) {
        return new Triplet<A,X0,B>(
                this.val0, value0, this.val1);
    }
    
    public <X0> Triplet<A,B,X0> insertInPos2(final X0 value0) {
        return new Triplet<A,B,X0>(
                this.val0, this.val1, value0);
    }

    
    
    
    
    public <X0,X1> Quartet<X0,X1,A,B> insertInPos0(final X0 value0, final X1 value1) {
        return new Quartet<X0,X1,A,B>(
                value0, value1, this.val0, this.val1);
    }
    
    public <X0,X1> Quartet<A,X0,X1,B> insertInPos1(final X0 value0, final X1 value1) {
        return new Quartet<A,X0,X1,B>(
                this.val0, value0, value1, this.val1);
    }
    
    public <X0,X1> Quartet<A,B,X0,X1> insertInPos2(final X0 value0, final X1 value1) {
        return new Quartet<A,B,X0,X1>(
                this.val0, this.val1, value0, value1);
    }
    


    
    
    
    
    public <X0,X1,X2> Quintet<X0,X1,X2,A,B> insertInPos0(final X0 value0, final X1 value1, final X2 value2) {
        return new Quintet<X0,X1,X2,A,B>(
                value0, value1, value2, this.val0, this.val1);
    }
    
    public <X0,X1,X2> Quintet<A,X0,X1,X2,B> insertInPos1(final X0 value0, final X1 value1, final X2 value2) {
        return new Quintet<A,X0,X1,X2,B>(
                this.val0, value0, value1, value2, this.val1);
    }
    
    public <X0,X1,X2> Quintet<A,B,X0,X1,X2> insertInPos2(final X0 value0, final X1 value1, final X2 value2) {
        return new Quintet<A,B,X0,X1,X2>(
                this.val0, this.val1, value0, value1, value2);
    }
    


    
    
    
    
    public <X0,X1,X2,X3> Sextet<X0,X1,X2,X3,A,B> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Sextet<X0,X1,X2,X3,A,B>(
                value0, value1, value2, value3, this.val0, this.val1);
    }
    
    public <X0,X1,X2,X3> Sextet<A,X0,X1,X2,X3,B> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Sextet<A,X0,X1,X2,X3,B>(
                this.val0, value0, value1, value2, value3, this.val1);
    }
    
    public <X0,X1,X2,X3> Sextet<A,B,X0,X1,X2,X3> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Sextet<A,B,X0,X1,X2,X3>(
                this.val0, this.val1, value0, value1, value2, value3);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4> Septet<X0,X1,X2,X3,X4,A,B> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Septet<X0,X1,X2,X3,X4,A,B>(
                value0, value1, value2, value3, value4, this.val0, this.val1);
    }
    
    public <X0,X1,X2,X3,X4> Septet<A,X0,X1,X2,X3,X4,B> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Septet<A,X0,X1,X2,X3,X4,B>(
                this.val0, value0, value1, value2, value3, value4, this.val1);
    }
    
    public <X0,X1,X2,X3,X4> Septet<A,B,X0,X1,X2,X3,X4> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Septet<A,B,X0,X1,X2,X3,X4>(
                this.val0, this.val1, value0, value1, value2, value3, value4);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Octet<X0,X1,X2,X3,X4,X5,A,B> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Octet<X0,X1,X2,X3,X4,X5,A,B>(
                value0, value1, value2, value3, value4, value5, this.val0, this.val1);
    }
    
    public <X0,X1,X2,X3,X4,X5> Octet<A,X0,X1,X2,X3,X4,X5,B> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Octet<A,X0,X1,X2,X3,X4,X5,B>(
                this.val0, value0, value1, value2, value3, value4, value5, this.val1);
    }
    
    public <X0,X1,X2,X3,X4,X5> Octet<A,B,X0,X1,X2,X3,X4,X5> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Octet<A,B,X0,X1,X2,X3,X4,X5>(
                this.val0, this.val1, value0, value1, value2, value3, value4, value5);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Ennead<X0,X1,X2,X3,X4,X5,X6,A,B> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Ennead<X0,X1,X2,X3,X4,X5,X6,A,B>(
                value0, value1, value2, value3, value4, value5, value6, this.val0, this.val1);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Ennead<A,X0,X1,X2,X3,X4,X5,X6,B> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Ennead<A,X0,X1,X2,X3,X4,X5,X6,B>(
                this.val0, value0, value1, value2, value3, value4, value5, value6, this.val1);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Ennead<A,B,X0,X1,X2,X3,X4,X5,X6> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Ennead<A,B,X0,X1,X2,X3,X4,X5,X6>(
                this.val0, this.val1, value0, value1, value2, value3, value4, value5, value6);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Decade<X0,X1,X2,X3,X4,X5,X6,X7,A,B> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7) {
        return new Decade<X0,X1,X2,X3,X4,X5,X6,X7,A,B>(
                value0, value1, value2, value3, value4, value5, value6, value7, this.val0, this.val1);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Decade<A,X0,X1,X2,X3,X4,X5,X6,X7,B> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7) {
        return new Decade<A,X0,X1,X2,X3,X4,X5,X6,X7,B>(
                this.val0, value0, value1, value2, value3, value4, value5, value6, value7, this.val1);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Decade<A,B,X0,X1,X2,X3,X4,X5,X6,X7> insertInPos2(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7) {
        return new Decade<A,B,X0,X1,X2,X3,X4,X5,X6,X7>(
                this.val0, this.val1, value0, value1, value2, value3, value4, value5, value6, value7);
    }

    
    
    
    
    
    
    
    public <X0> Triplet<X0,A,B> insertInPos0(final Unit<X0> tuple) {
        return insertInPos0(tuple.getValue0());
    }
    
    public <X0> Triplet<A,X0,B> insertInPos1(final Unit<X0> tuple) {
        return insertInPos1(tuple.getValue0());
    }
    
    public <X0> Triplet<A,B,X0> insertInPos2(final Unit<X0> tuple) {
        return insertInPos2(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Quartet<X0,X1,A,B> insertInPos0(final Pair<X0,X1> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Quartet<A,X0,X1,B> insertInPos1(final Pair<X0,X1> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Quartet<A,B,X0,X1> insertInPos2(final Pair<X0,X1> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1());
    }

    
    

    
    
    
    
    public <X0,X1,X2> Quintet<X0,X1,X2,A,B> insertInPos0(final Triplet<X0,X1,X2> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Quintet<A,X0,X1,X2,B> insertInPos1(final Triplet<X0,X1,X2> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Quintet<A,B,X0,X1,X2> insertInPos2(final Triplet<X0,X1,X2> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    
    


    
    
    
    
    public <X0,X1,X2,X3> Sextet<X0,X1,X2,X3,A,B> insertInPos0(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Sextet<A,X0,X1,X2,X3,B> insertInPos1(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Sextet<A,B,X0,X1,X2,X3> insertInPos2(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4> Septet<X0,X1,X2,X3,X4,A,B> insertInPos0(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Septet<A,X0,X1,X2,X3,X4,B> insertInPos1(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Septet<A,B,X0,X1,X2,X3,X4> insertInPos2(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Octet<X0,X1,X2,X3,X4,X5,A,B> insertInPos0(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Octet<A,X0,X1,X2,X3,X4,X5,B> insertInPos1(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Octet<A,B,X0,X1,X2,X3,X4,X5> insertInPos2(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Ennead<X0,X1,X2,X3,X4,X5,X6,A,B> insertInPos0(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Ennead<A,X0,X1,X2,X3,X4,X5,X6,B> insertInPos1(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Ennead<A,B,X0,X1,X2,X3,X4,X5,X6> insertInPos2(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Decade<X0,X1,X2,X3,X4,X5,X6,X7,A,B> insertInPos0(final Octet<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6(),tuple.getValue7());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Decade<A,X0,X1,X2,X3,X4,X5,X6,X7,B> insertInPos1(final Octet<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6(),tuple.getValue7());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Decade<A,B,X0,X1,X2,X3,X4,X5,X6,X7> insertInPos2(final Octet<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6(),tuple.getValue7());
    }

    
    
    
    
    
    
    
    
    public <X0> Triplet<A,B,X0> append(final X0 value0) {
        return insertInPos2(value0);
    }
    
    
    public <X0> Triplet<A,B,X0> append(final Unit<X0> tuple) {
        return insertInPos2(tuple);
    }
    
    
    
    
    public <X0,X1> Quartet<A,B,X0,X1> append(final X0 value0, final X1 value1) {
        return insertInPos2(value0, value1);
    }
    
    
    public <X0,X1> Quartet<A,B,X0,X1> append(final Pair<X0,X1> tuple) {
        return insertInPos2(tuple);
    }
    
    
    
    
    public <X0,X1,X2> Quintet<A,B,X0,X1,X2> append(final X0 value0, final X1 value1, final X2 value2) {
        return insertInPos2(value0, value1, value2);
    }
    
    
    public <X0,X1,X2> Quintet<A,B,X0,X1,X2> append(final Triplet<X0,X1,X2> tuple) {
        return insertInPos2(tuple);
    }
    
    
    
    
    public <X0,X1,X2,X3> Sextet<A,B,X0,X1,X2,X3> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return insertInPos2(value0, value1, value2, value3);
    }
    
    
    public <X0,X1,X2,X3> Sextet<A,B,X0,X1,X2,X3> append(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos2(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4> Septet<A,B,X0,X1,X2,X3,X4> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return insertInPos2(value0, value1, value2, value3, value4);
    }
    
    
    public <X0,X1,X2,X3,X4> Septet<A,B,X0,X1,X2,X3,X4> append(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos2(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Octet<A,B,X0,X1,X2,X3,X4,X5> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return insertInPos2(value0, value1, value2, value3, value4, value5);
    }
    
    
    public <X0,X1,X2,X3,X4,X5> Octet<A,B,X0,X1,X2,X3,X4,X5> append(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos2(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Ennead<A,B,X0,X1,X2,X3,X4,X5,X6> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return insertInPos2(value0, value1, value2, value3, value4, value5, value6);
    }
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Ennead<A,B,X0,X1,X2,X3,X4,X5,X6> append(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos2(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Decade<A,B,X0,X1,X2,X3,X4,X5,X6,X7> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7) {
        return insertInPos2(value0, value1, value2, value3, value4, value5, value6, value7);
    }
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Decade<A,B,X0,X1,X2,X3,X4,X5,X6,X7> append(final Octet<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertInPos2(tuple);
    }
    
    
    
}
