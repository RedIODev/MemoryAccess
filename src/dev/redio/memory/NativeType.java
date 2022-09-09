package dev.redio.memory;

import java.lang.invoke.VarHandle;

public abstract class NativeType {
    
    protected final VarHandle[] fields;

    protected NativeType(VarHandle[] fields) {
        this.fields = fields;
    }
}
