// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

#include "bundle.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class JanusBundle;

namespace djinni_generated {

class Bundle
{
public:
    using CppType = std::shared_ptr<::Janus::Bundle>;
    using CppOptType = std::shared_ptr<::Janus::Bundle>;
    using ObjcType = JanusBundle*;

    using Boxed = Bundle;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

