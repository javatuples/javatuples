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

public final class Unit<A> extends Tuple {

    private static final long serialVersionUID = -9113114724069537096L;

    private static final int SIZE = 1;
    
    private final A val0;
    
    
    public static <A> Unit<A> with(final A value0) {
        return new Unit<A>(value0);
    }

    
    public Unit(final A value0) {
        super(SIZE, value0);
        this.val0 = value0;
    }
    
    
    public A getValue0() {
        return this.val0;
    }


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    
    
    
    
    
    
    
    
    public <X0> Pair<X0,A> insertInPos0(final X0 value0) {
        return new Pair<X0,A>(
                value0, this.val0);
    }
    
    public <X0> Pair<A,X0> insertInPos1(final X0 value0) {
        return new Pair<A,X0>(
                this.val0, value0);
    }

    
    
    
    
    public <X0,X1> Triplet<X0,X1,A> insertInPos0(final X0 value0, final X1 value1) {
        return new Triplet<X0,X1,A>(
                value0, value1, this.val0);
    }
    
    public <X0,X1> Triplet<A,X0,X1> insertInPos1(final X0 value0, final X1 value1) {
        return new Triplet<A,X0,X1>(
                this.val0, value0, value1);
    }
    


    
    
    
    
    public <X0,X1,X2> Quartet<X0,X1,X2,A> insertInPos0(final X0 value0, final X1 value1, final X2 value2) {
        return new Quartet<X0,X1,X2,A>(
                value0, value1, value2, this.val0);
    }
    
    public <X0,X1,X2> Quartet<A,X0,X1,X2> insertInPos1(final X0 value0, final X1 value1, final X2 value2) {
        return new Quartet<A,X0,X1,X2>(
                this.val0, value0, value1, value2);
    }
    


    
    
    
    
    public <X0,X1,X2,X3> Quintet<X0,X1,X2,X3,A> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Quintet<X0,X1,X2,X3,A>(
                value0, value1, value2, value3, this.val0);
    }
    
    public <X0,X1,X2,X3> Quintet<A,X0,X1,X2,X3> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Quintet<A,X0,X1,X2,X3>(
                this.val0, value0, value1, value2, value3);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4> Sextet<X0,X1,X2,X3,X4,A> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Sextet<X0,X1,X2,X3,X4,A>(
                value0, value1, value2, value3, value4, this.val0);
    }
    
    public <X0,X1,X2,X3,X4> Sextet<A,X0,X1,X2,X3,X4> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return new Sextet<A,X0,X1,X2,X3,X4>(
                this.val0, value0, value1, value2, value3, value4);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Septet<X0,X1,X2,X3,X4,X5,A> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Septet<X0,X1,X2,X3,X4,X5,A>(
                value0, value1, value2, value3, value4, value5, this.val0);
    }
    
    public <X0,X1,X2,X3,X4,X5> Septet<A,X0,X1,X2,X3,X4,X5> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return new Septet<A,X0,X1,X2,X3,X4,X5>(
                this.val0, value0, value1, value2, value3, value4, value5);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Octet<X0,X1,X2,X3,X4,X5,X6,A> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Octet<X0,X1,X2,X3,X4,X5,X6,A>(
                value0, value1, value2, value3, value4, value5, value6, this.val0);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Octet<A,X0,X1,X2,X3,X4,X5,X6> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return new Octet<A,X0,X1,X2,X3,X4,X5,X6>(
                this.val0, value0, value1, value2, value3, value4, value5, value6);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Ennead<X0,X1,X2,X3,X4,X5,X6,X7,A> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7) {
        return new Ennead<X0,X1,X2,X3,X4,X5,X6,X7,A>(
                value0, value1, value2, value3, value4, value5, value6, value7, this.val0);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Ennead<A,X0,X1,X2,X3,X4,X5,X6,X7> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7) {
        return new Ennead<A,X0,X1,X2,X3,X4,X5,X6,X7>(
                this.val0, value0, value1, value2, value3, value4, value5, value6, value7);
    }


    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Decade<X0,X1,X2,X3,X4,X5,X6,X7,X8,A> insertInPos0(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7, final X8 value8) {
        return new Decade<X0,X1,X2,X3,X4,X5,X6,X7,X8,A>(
                value0, value1, value2, value3, value4, value5, value6, value7, value8, this.val0);
    }
    
    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Decade<A,X0,X1,X2,X3,X4,X5,X6,X7,X8> insertInPos1(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7, final X8 value8) {
        return new Decade<A,X0,X1,X2,X3,X4,X5,X6,X7,X8>(
                this.val0, value0, value1, value2, value3, value4, value5, value6, value7, value8);
    }

    
    
    
    
    
    
    
    public <X0> Pair<X0,A> insertInPos0(final Unit<X0> tuple) {
        return insertInPos0(tuple.getValue0());
    }
    
    public <X0> Pair<A,X0> insertInPos1(final Unit<X0> tuple) {
        return insertInPos1(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Triplet<X0,X1,A> insertInPos0(final Pair<X0,X1> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Triplet<A,X0,X1> insertInPos1(final Pair<X0,X1> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1());
    }

    
    

    
    
    
    
    public <X0,X1,X2> Quartet<X0,X1,X2,A> insertInPos0(final Triplet<X0,X1,X2> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Quartet<A,X0,X1,X2> insertInPos1(final Triplet<X0,X1,X2> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    
    


    
    
    
    
    public <X0,X1,X2,X3> Quintet<X0,X1,X2,X3,A> insertInPos0(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Quintet<A,X0,X1,X2,X3> insertInPos1(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4> Sextet<X0,X1,X2,X3,X4,A> insertInPos0(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }
    
    public <X0,X1,X2,X3,X4> Sextet<A,X0,X1,X2,X3,X4> insertInPos1(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Septet<X0,X1,X2,X3,X4,X5,A> insertInPos0(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    public <X0,X1,X2,X3,X4,X5> Septet<A,X0,X1,X2,X3,X4,X5> insertInPos1(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5());
    }
    
    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Octet<X0,X1,X2,X3,X4,X5,X6,A> insertInPos0(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6> Octet<A,X0,X1,X2,X3,X4,X5,X6> insertInPos1(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Ennead<X0,X1,X2,X3,X4,X5,X6,X7,A> insertInPos0(final Octet<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6(),tuple.getValue7());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Ennead<A,X0,X1,X2,X3,X4,X5,X6,X7> insertInPos1(final Octet<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6(),tuple.getValue7());
    }

    
    

    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Decade<X0,X1,X2,X3,X4,X5,X6,X7,X8,A> insertInPos0(final Ennead<X0,X1,X2,X3,X4,X5,X6,X7,X8> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6(),tuple.getValue7(),tuple.getValue8());
    }
    
    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Decade<A,X0,X1,X2,X3,X4,X5,X6,X7,X8> insertInPos1(final Ennead<X0,X1,X2,X3,X4,X5,X6,X7,X8> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3(),tuple.getValue4(),tuple.getValue5(),tuple.getValue6(),tuple.getValue7(),tuple.getValue8());
    }

    
    
    
    
    
    
    
    
    public <X0> Pair<A,X0> append(final X0 value0) {
        return insertInPos1(value0);
    }
    
    
    public <X0> Pair<A,X0> append(final Unit<X0> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    public <X0,X1> Triplet<A,X0,X1> append(final X0 value0, final X1 value1) {
        return insertInPos1(value0, value1);
    }
    
    
    public <X0,X1> Triplet<A,X0,X1> append(final Pair<X0,X1> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    public <X0,X1,X2> Quartet<A,X0,X1,X2> append(final X0 value0, final X1 value1, final X2 value2) {
        return insertInPos1(value0, value1, value2);
    }
    
    
    public <X0,X1,X2> Quartet<A,X0,X1,X2> append(final Triplet<X0,X1,X2> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    public <X0,X1,X2,X3> Quintet<A,X0,X1,X2,X3> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return insertInPos1(value0, value1, value2, value3);
    }
    
    
    public <X0,X1,X2,X3> Quintet<A,X0,X1,X2,X3> append(final Quartet<X0,X1,X2,X3> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4> Sextet<A,X0,X1,X2,X3,X4> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4) {
        return insertInPos1(value0, value1, value2, value3, value4);
    }
    
    
    public <X0,X1,X2,X3,X4> Sextet<A,X0,X1,X2,X3,X4> append(final Quintet<X0,X1,X2,X3,X4> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5> Septet<A,X0,X1,X2,X3,X4,X5> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5) {
        return insertInPos1(value0, value1, value2, value3, value4, value5);
    }
    
    
    public <X0,X1,X2,X3,X4,X5> Septet<A,X0,X1,X2,X3,X4,X5> append(final Sextet<X0,X1,X2,X3,X4,X5> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Octet<A,X0,X1,X2,X3,X4,X5,X6> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6) {
        return insertInPos1(value0, value1, value2, value3, value4, value5, value6);
    }
    
    
    public <X0,X1,X2,X3,X4,X5,X6> Octet<A,X0,X1,X2,X3,X4,X5,X6> append(final Septet<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Ennead<A,X0,X1,X2,X3,X4,X5,X6,X7> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7) {
        return insertInPos1(value0, value1, value2, value3, value4, value5, value6, value7);
    }
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7> Ennead<A,X0,X1,X2,X3,X4,X5,X6,X7> append(final Octet<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Decade<A,X0,X1,X2,X3,X4,X5,X6,X7,X8> append(final X0 value0, final X1 value1, final X2 value2, final X3 value3, final X4 value4, final X5 value5, final X6 value6, final X7 value7, final X8 value8) {
        return insertInPos1(value0, value1, value2, value3, value4, value5, value6, value7, value8);
    }
    
    
    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Decade<A,X0,X1,X2,X3,X4,X5,X6,X7,X8> append(final Ennead<X0,X1,X2,X3,X4,X5,X6,X7,X8> tuple) {
        return insertInPos1(tuple);
    }
    
    
    
    
    
    
    
    
    
    
    public <X> Unit<X> setInPos0(final X value) {
        return new Unit<X>(
                value);
    }
    
    
    
}
