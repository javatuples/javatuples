package org.javatuples;

public final class Octet<A,B,C,D,E,F,G,H> extends Tuple {

    private static final long serialVersionUID = -1187955276020306879L;

    private static final int SIZE = 8;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    private final H val7;
    
    
    
    public static <A,B,C,D,E,F,G,H> Octet<A,B,C,D,E,F,G,H> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6, final H value7) {
        return new Octet<A,B,C,D,E,F,G,H>(value0,value1,value2,value3,value4,value5,value6,value7);
    }
    
    
    public Octet(
            final A value0,
            final B value1,
            final C value2,
            final D value3,
            final E value4,
            final F value5,
            final G value6,
            final H value7) {
        super(SIZE, value0, value1, value2, value3, value4, value5, value6, value7);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
        this.val4 = value4;
        this.val5 = value5;
        this.val6 = value6;
        this.val7 = value7;
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


    @Override
    public int getSize() {
        return SIZE;
    }
    
    

    
    
    
    public <X0> Ennead<X0,A,B,C,D,E,F,G,H> insertInPos0(final X0 value0) {
        return new Ennead<X0,A,B,C,D,E,F,G,H>(
                value0, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0> Ennead<A,X0,B,C,D,E,F,G,H> insertInPos1(final X0 value0) {
        return new Ennead<A,X0,B,C,D,E,F,G,H>(
                this.val0, value0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0> Ennead<A,B,X0,C,D,E,F,G,H> insertInPos2(final X0 value0) {
        return new Ennead<A,B,X0,C,D,E,F,G,H>(
                this.val0, this.val1, value0, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0> Ennead<A,B,C,X0,D,E,F,G,H> insertInPos3(final X0 value0) {
        return new Ennead<A,B,C,X0,D,E,F,G,H>(
                this.val0, this.val1, this.val2, value0, this.val3, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0> Ennead<A,B,C,D,X0,E,F,G,H> insertInPos4(final X0 value0) {
        return new Ennead<A,B,C,D,X0,E,F,G,H>(
                this.val0, this.val1, this.val2, this.val3, value0, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0> Ennead<A,B,C,D,E,X0,F,G,H> insertInPos5(final X0 value0) {
        return new Ennead<A,B,C,D,E,X0,F,G,H>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0> Ennead<A,B,C,D,E,F,X0,G,H> insertInPos6(final X0 value0) {
        return new Ennead<A,B,C,D,E,F,X0,G,H>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, 
                this.val6, this.val7);
    }
    
    public <X0> Ennead<A,B,C,D,E,F,G,X0,H> insertInPos7(final X0 value0) {
        return new Ennead<A,B,C,D,E,F,G,X0,H>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                value0, this.val7);
    }
    
    public <X0> Ennead<A,B,C,D,E,F,G,H,X0> insertInPos8(final X0 value0) {
        return new Ennead<A,B,C,D,E,F,G,H,X0>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                this.val7, value0);
    }

    
    
    
    
    public <X0,X1> Decade<X0,X1,A,B,C,D,E,F,G,H> insertInPos0(final X0 value0, final X1 value1) {
        return new Decade<X0,X1,A,B,C,D,E,F,G,H>(
                value0, value1, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0,X1> Decade<A,X0,X1,B,C,D,E,F,G,H> insertInPos1(final X0 value0, final X1 value1) {
        return new Decade<A,X0,X1,B,C,D,E,F,G,H>(
                this.val0, value0, value1, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0,X1> Decade<A,B,X0,X1,C,D,E,F,G,H> insertInPos2(final X0 value0, final X1 value1) {
        return new Decade<A,B,X0,X1,C,D,E,F,G,H>(
                this.val0, this.val1, value0, value1, this.val2, this.val3, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0,X1> Decade<A,B,C,X0,X1,D,E,F,G,H> insertInPos3(final X0 value0, final X1 value1) {
        return new Decade<A,B,C,X0,X1,D,E,F,G,H>(
                this.val0, this.val1, this.val2, value0, value1, this.val3, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0,X1> Decade<A,B,C,D,X0,X1,E,F,G,H> insertInPos4(final X0 value0, final X1 value1) {
        return new Decade<A,B,C,D,X0,X1,E,F,G,H>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, this.val4, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0,X1> Decade<A,B,C,D,E,X0,X1,F,G,H> insertInPos5(final X0 value0, final X1 value1) {
        return new Decade<A,B,C,D,E,X0,X1,F,G,H>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, this.val5, 
                this.val6, this.val7);
    }
    
    public <X0,X1> Decade<A,B,C,D,E,F,X0,X1,G,H> insertInPos6(final X0 value0, final X1 value1) {
        return new Decade<A,B,C,D,E,F,X0,X1,G,H>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1, 
                this.val6, this.val7);
    }
    
    public <X0,X1> Decade<A,B,C,D,E,F,G,X0,X1,H> insertInPos7(final X0 value0, final X1 value1) {
        return new Decade<A,B,C,D,E,F,G,X0,X1,H>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                value0, value1, this.val7);
    }
    
    public <X0,X1> Decade<A,B,C,D,E,F,G,H,X0,X1> insertInPos8(final X0 value0, final X1 value1) {
        return new Decade<A,B,C,D,E,F,G,H,X0,X1>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                this.val7, value0, value1);
    }
    
    
    
    
    public <X0> Ennead<X0,A,B,C,D,E,F,G,H> insertInPos0(final Unit<X0> tuple) {
        return insertInPos0(tuple.getValue0());
    }
    
    public <X0> Ennead<A,X0,B,C,D,E,F,G,H> insertInPos1(final Unit<X0> tuple) {
        return insertInPos1(tuple.getValue0());
    }
    
    public <X0> Ennead<A,B,X0,C,D,E,F,G,H> insertInPos2(final Unit<X0> tuple) {
        return insertInPos2(tuple.getValue0());
    }
    
    public <X0> Ennead<A,B,C,X0,D,E,F,G,H> insertInPos3(final Unit<X0> tuple) {
        return insertInPos3(tuple.getValue0());
    }
    
    public <X0> Ennead<A,B,C,D,X0,E,F,G,H> insertInPos4(final Unit<X0> tuple) {
        return insertInPos4(tuple.getValue0());
    }
    
    public <X0> Ennead<A,B,C,D,E,X0,F,G,H> insertInPos5(final Unit<X0> tuple) {
        return insertInPos5(tuple.getValue0());
    }
    
    public <X0> Ennead<A,B,C,D,E,F,X0,G,H> insertInPos6(final Unit<X0> tuple) {
        return insertInPos6(tuple.getValue0());
    }
    
    public <X0> Ennead<A,B,C,D,E,F,G,X0,H> insertInPos7(final Unit<X0> tuple) {
        return insertInPos7(tuple.getValue0());
    }
    
    public <X0> Ennead<A,B,C,D,E,F,G,H,X0> insertInPos8(final Unit<X0> tuple) {
        return insertInPos8(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Decade<X0,X1,A,B,C,D,E,F,G,H> insertInPos0(final Pair<X0,X1> tuple) {
        return insertInPos0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Decade<A,X0,X1,B,C,D,E,F,G,H> insertInPos1(final Pair<X0,X1> tuple) {
        return insertInPos1(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Decade<A,B,X0,X1,C,D,E,F,G,H> insertInPos2(final Pair<X0,X1> tuple) {
        return insertInPos2(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Decade<A,B,C,X0,X1,D,E,F,G,H> insertInPos3(final Pair<X0,X1> tuple) {
        return insertInPos3(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Decade<A,B,C,D,X0,X1,E,F,G,H> insertInPos4(final Pair<X0,X1> tuple) {
        return insertInPos4(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Decade<A,B,C,D,E,X0,X1,F,G,H> insertInPos5(final Pair<X0,X1> tuple) {
        return insertInPos5(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Decade<A,B,C,D,E,F,X0,X1,G,H> insertInPos6(final Pair<X0,X1> tuple) {
        return insertInPos6(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Decade<A,B,C,D,E,F,G,X0,X1,H> insertInPos7(final Pair<X0,X1> tuple) {
        return insertInPos7(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Decade<A,B,C,D,E,F,G,H,X0,X1> insertInPos8(final Pair<X0,X1> tuple) {
        return insertInPos8(tuple.getValue0(),tuple.getValue1());
    }

    
    
    
    
    
    
    public <X0> Ennead<A,B,C,D,E,F,G,H,X0> append(final X0 value0) {
        return insertInPos8(value0);
    }
    
    
    public <X0> Ennead<A,B,C,D,E,F,G,H,X0> append(final Unit<X0> tuple) {
        return insertInPos8(tuple);
    }
    
    
    
    
    public <X0,X1> Decade<A,B,C,D,E,F,G,H,X0,X1> append(final X0 value0, final X1 value1) {
        return insertInPos8(value0, value1);
    }
    
    
    public <X0,X1> Decade<A,B,C,D,E,F,G,H,X0,X1> append(final Pair<X0,X1> tuple) {
        return insertInPos8(tuple);
    }
    
    
}
