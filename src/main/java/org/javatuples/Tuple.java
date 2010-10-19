package org.javatuples;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class Tuple implements Iterable<Object>, Serializable {

    private static final long serialVersionUID = 5431085632328343101L;
    
    private final List<Object> valueList;
    
    
    public static <A> Unit<A> with(final A value0) {
        return new Unit<A>(value0);
    }
    
    public static <A,B> Pair<A,B> with(final A value0, final B value1) {
        return new Pair<A,B>(value0,value1);
    }
    
    public static <A,B,C> Triplet<A,B,C> with(final A value0, final B value1, final C value2) {
        return new Triplet<A,B,C>(value0,value1,value2);
    }
    
    public static <A,B,C,D> Quartet<A,B,C,D> with(final A value0, final B value1, final C value2, final D value3) {
        return new Quartet<A,B,C,D>(value0,value1,value2,value3);
    }
    
    public static <A,B,C,D,E> Quintet<A,B,C,D,E> with(final A value0, final B value1, final C value2, final D value3, final E value4) {
        return new Quintet<A,B,C,D,E>(value0,value1,value2,value3,value4);
    }
    
    public static <A,B,C,D,E,F> Sextet<A,B,C,D,E,F> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5) {
        return new Sextet<A,B,C,D,E,F>(value0,value1,value2,value3,value4,value5);
    }
    
    public static <A,B,C,D,E,F,G> Septet<A,B,C,D,E,F,G> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6) {
        return new Septet<A,B,C,D,E,F,G>(value0,value1,value2,value3,value4,value5,value6);
    }
    
    public static <A,B,C,D,E,F,G,H> Octet<A,B,C,D,E,F,G,H> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6, final H value7) {
        return new Octet<A,B,C,D,E,F,G,H>(value0,value1,value2,value3,value4,value5,value6,value7);
    }
    
    public static <A,B,C,D,E,F,G,H,I> Ennead<A,B,C,D,E,F,G,H,I> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6, final H value7, final I value8) {
        return new Ennead<A,B,C,D,E,F,G,H,I>(value0,value1,value2,value3,value4,value5,value6,value7,value8);
    }
    
    public static <A,B,C,D,E,F,G,H,I,J> Decade<A,B,C,D,E,F,G,H,I,J> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6, final H value7, final I value8, final J value9) {
        return new Decade<A,B,C,D,E,F,G,H,I,J>(value0,value1,value2,value3,value4,value5,value6,value7,value8,value9);
    }
    
    
    public Tuple(final int size, final Object... values) {
        super();
        this.valueList = Arrays.asList(values);
    }
    
    
    public abstract int getSize();

    
    @Override
    public final Iterator<Object> iterator() {
        return this.valueList.iterator();
    }
    
    
    @Override
    public final String toString() {
        return this.valueList.toString();
    }
    
    
    public final boolean contains(final Object value) {
        for (final Object val : this.valueList) {
            if (val == null) {
                if (value == null) {
                    return true;
                }
            } else {
                if (val.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
