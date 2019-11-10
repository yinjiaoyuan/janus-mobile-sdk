// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

#pragma once

#include "constraints_builder.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class NativeConstraintsBuilder final : ::djinni::JniInterface<::Janus::ConstraintsBuilder, NativeConstraintsBuilder> {
public:
    using CppType = std::shared_ptr<::Janus::ConstraintsBuilder>;
    using CppOptType = std::shared_ptr<::Janus::ConstraintsBuilder>;
    using JniType = jobject;

    using Boxed = NativeConstraintsBuilder;

    ~NativeConstraintsBuilder();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<NativeConstraintsBuilder>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<NativeConstraintsBuilder>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    NativeConstraintsBuilder();
    friend ::djinni::JniClass<NativeConstraintsBuilder>;
    friend ::djinni::JniInterface<::Janus::ConstraintsBuilder, NativeConstraintsBuilder>;

};

}  // namespace djinni_generated
