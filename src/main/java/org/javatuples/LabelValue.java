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

import java.util.Collection;
import java.util.Iterator;

public final class LabelValue<A,B> extends Tuple {

    private static final long serialVersionUID = 5055574980300695706L;

    private static final int SIZE = 2;

    private final A label;
    private final B value;
    
    
    
    public static <A,B> LabelValue<A,B> with(final A label, final B value) {
        return new LabelValue<A,B>(label,value);
    }

    
    public static <X> LabelValue<X,X> fromArray(final X[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length != 2) {
            throw new IllegalArgumentException("Array must have exactly 2 elements in order to create a LabelValue. Size is " + array.length);
        }
        return new LabelValue<X,X>(array[0],array[1]);
    }

    
    public static <X> LabelValue<X,X> fromCollection(final Collection<X> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Collection cannot be null");
        }
        if (collection.size() != 2) {
            throw new IllegalArgumentException("Collection must have exactly 2 elements in order to create a LabelValue. Size is " + collection.size());
        }
        final Iterator<X> iter = collection.iterator();
        return new LabelValue<X,X>(iter.next(),iter.next());
    }
    
    
    
    
    public LabelValue(
            final A label, 
            final B value) {
        super(SIZE, label, value);
        this.label = label;
        this.value = value;
    }


    public A getLabel() {
        return this.label;
    }


    public B getValue() {
        return this.value;
    }


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    public <X> LabelValue<X,B> setLabel(final X label) {
        return new LabelValue<X,B>(label, this.value);
    }
    
    
    public <Y> LabelValue<A,Y> setValue(final Y value) {
        return new LabelValue<A,Y>(this.label, value);
    }
    
    
    
    
    
}
