package dev.redio.memory;

import java.lang.invoke.VarHandle;
import java.util.function.Function;
import jdk.incubator.foreign.*;

public class Memory {

    public static <T extends NativeType> T allocateNative(Function<VarHandle[],T> generator, MemoryLayout layout) {
        var layoutHandles = layoutHandles(layout);
        var memory = allocate(layout);
        //class to hold memorySegment and Varhandles
        return generator.apply(instanceHandles(layoutHandles, memory));
    }

    private static VarHandle[] layoutHandles(MemoryLayout layout) {

    }

    private static MemorySegment allocate(MemoryLayout layout) {

    }

    private static VarHandle[] instanceHandles(VarHandle[] layoutHandles, MemorySegment memory) {

    }
}
