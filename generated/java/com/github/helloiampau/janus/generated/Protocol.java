// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

package com.github.helloiampau.janus.generated;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Protocol {
    public abstract String name();

    public abstract void init(JanusConf conf, Platform platform, ProtocolDelegate delegate);

    public abstract void dispatch(String command, Bundle payload);

    public abstract void hangup();

    public abstract void close();

    public abstract void onOffer(String sdp, Bundle context);

    public abstract void onAnswer(String sdp, Bundle context);

    public abstract void onIceCandidate(String mid, int index, String sdp, Bundle context);

    public abstract void onIceCompleted(Bundle context);

    private static final class CppProxy extends Protocol
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
        public String name()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_name(this.nativeRef);
        }
        private native String native_name(long _nativeRef);

        @Override
        public void init(JanusConf conf, Platform platform, ProtocolDelegate delegate)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_init(this.nativeRef, conf, platform, delegate);
        }
        private native void native_init(long _nativeRef, JanusConf conf, Platform platform, ProtocolDelegate delegate);

        @Override
        public void dispatch(String command, Bundle payload)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_dispatch(this.nativeRef, command, payload);
        }
        private native void native_dispatch(long _nativeRef, String command, Bundle payload);

        @Override
        public void hangup()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_hangup(this.nativeRef);
        }
        private native void native_hangup(long _nativeRef);

        @Override
        public void close()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_close(this.nativeRef);
        }
        private native void native_close(long _nativeRef);

        @Override
        public void onOffer(String sdp, Bundle context)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_onOffer(this.nativeRef, sdp, context);
        }
        private native void native_onOffer(long _nativeRef, String sdp, Bundle context);

        @Override
        public void onAnswer(String sdp, Bundle context)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_onAnswer(this.nativeRef, sdp, context);
        }
        private native void native_onAnswer(long _nativeRef, String sdp, Bundle context);

        @Override
        public void onIceCandidate(String mid, int index, String sdp, Bundle context)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_onIceCandidate(this.nativeRef, mid, index, sdp, context);
        }
        private native void native_onIceCandidate(long _nativeRef, String mid, int index, String sdp, Bundle context);

        @Override
        public void onIceCompleted(Bundle context)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_onIceCompleted(this.nativeRef, context);
        }
        private native void native_onIceCompleted(long _nativeRef, Bundle context);
    }
}
