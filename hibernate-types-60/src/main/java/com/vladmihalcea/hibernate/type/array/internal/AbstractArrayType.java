package com.vladmihalcea.hibernate.type.array.internal;

import com.vladmihalcea.hibernate.type.MutableDynamicParameterizedType;
import com.vladmihalcea.hibernate.type.util.Configuration;

/**
 * Base class for all ARRAY types.
 *
 * @author Vlad Mihalcea
 */
public abstract class AbstractArrayType<T>
    extends MutableDynamicParameterizedType<T, ArraySqlTypeDescriptor, AbstractArrayTypeDescriptor<T>> {

    public static final String SQL_ARRAY_TYPE = "sql_array_type";

    public AbstractArrayType(AbstractArrayTypeDescriptor<T> arrayTypeDescriptor) {
        super(
            arrayTypeDescriptor.getJavaTypeClass(),
            ArraySqlTypeDescriptor.INSTANCE,
            arrayTypeDescriptor
        );
    }

    public AbstractArrayType(AbstractArrayTypeDescriptor<T> arrayTypeDescriptor, Configuration configuration) {
        super(
            arrayTypeDescriptor.getJavaTypeClass(),
            ArraySqlTypeDescriptor.INSTANCE,
            arrayTypeDescriptor,
            configuration
        );
    }
}