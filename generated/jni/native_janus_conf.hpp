// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

#pragma once

#include "djinni_support.hpp"
#include "janus_conf.hpp"

namespace djinni_generated {

class NativeJanusConf final : ::djinni::JniInterface<::Janus::JanusConf, NativeJanusConf> {
public:
    using CppType = std::shared_ptr<::Janus::JanusConf>;
    using CppOptType = std::shared_ptr<::Janus::JanusConf>;
    using JniType = jobject;

    using Boxed = NativeJanusConf;

    ~NativeJanusConf();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<NativeJanusConf>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<NativeJanusConf>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    NativeJanusConf();
    friend ::djinni::JniClass<NativeJanusConf>;
    friend ::djinni::JniInterface<::Janus::JanusConf, NativeJanusConf>;

    class JavaProxy final : ::djinni::JavaProxyHandle<JavaProxy>, public ::Janus::JanusConf
    {
    public:
        JavaProxy(JniType j);
        ~JavaProxy();

        std::string url() override;
        std::string plugin() override;

    private:
        friend ::djinni::JniInterface<::Janus::JanusConf, ::djinni_generated::NativeJanusConf>;
    };

    const ::djinni::GlobalRef<jclass> clazz { ::djinni::jniFindClass("com/github/helloiampau/janus/generated/JanusConf") };
    const jmethodID method_url { ::djinni::jniGetMethodID(clazz.get(), "url", "()Ljava/lang/String;") };
    const jmethodID method_plugin { ::djinni::jniGetMethodID(clazz.get(), "plugin", "()Ljava/lang/String;") };
};

}  // namespace djinni_generated