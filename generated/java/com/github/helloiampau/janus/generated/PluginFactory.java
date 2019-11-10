// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

package com.github.helloiampau.janus.generated;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PluginFactory {
    public abstract Plugin create(Protocol owner);

    private static final class CppProxy extends PluginFactory
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void _djinni_private_destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override
        public Plugin create(Protocol owner)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_create(this.nativeRef, owner);
        }
        private native Plugin native_create(long _nativeRef, Protocol owner);
    }
}
