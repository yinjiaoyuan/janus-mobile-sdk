// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

#import "JanusProtocolDelegate+Private.h"
#import "JanusProtocolDelegate.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "DJIObjcWrapperCache+Private.h"
#import "JanusBundle+Private.h"
#import "JanusJanusError+Private.h"
#import "JanusJanusEvent+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface JanusProtocolDelegateCppProxy : NSObject<JanusProtocolDelegate>

- (id)initWithCpp:(const std::shared_ptr<::Janus::ProtocolDelegate>&)cppRef;

@end

@implementation JanusProtocolDelegateCppProxy {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::Janus::ProtocolDelegate>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::Janus::ProtocolDelegate>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

- (void)onReady {
    try {
        _cppRefHandle.get()->onReady();
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)onClose {
    try {
        _cppRefHandle.get()->onClose();
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)onError:(nonnull JanusJanusError *)error
        context:(nullable JanusBundle *)context {
    try {
        _cppRefHandle.get()->onError(::djinni_generated::JanusError::toCpp(error),
                                     ::djinni_generated::Bundle::toCpp(context));
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)onEvent:(nullable JanusJanusEvent *)event
        context:(nullable JanusBundle *)context {
    try {
        _cppRefHandle.get()->onEvent(::djinni_generated::JanusEvent::toCpp(event),
                                     ::djinni_generated::Bundle::toCpp(context));
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)onHangup:(nonnull NSString *)reason {
    try {
        _cppRefHandle.get()->onHangup(::djinni::String::toCpp(reason));
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

class ProtocolDelegate::ObjcProxy final
: public ::Janus::ProtocolDelegate
, private ::djinni::ObjcProxyBase<ObjcType>
{
    friend class ::djinni_generated::ProtocolDelegate;
public:
    using ObjcProxyBase::ObjcProxyBase;
    void onReady() override
    {
        @autoreleasepool {
            [djinni_private_get_proxied_objc_object() onReady];
        }
    }
    void onClose() override
    {
        @autoreleasepool {
            [djinni_private_get_proxied_objc_object() onClose];
        }
    }
    void onError(const ::Janus::JanusError & c_error, const std::shared_ptr<::Janus::Bundle> & c_context) override
    {
        @autoreleasepool {
            [djinni_private_get_proxied_objc_object() onError:(::djinni_generated::JanusError::fromCpp(c_error))
                                                      context:(::djinni_generated::Bundle::fromCpp(c_context))];
        }
    }
    void onEvent(const std::shared_ptr<::Janus::JanusEvent> & c_event, const std::shared_ptr<::Janus::Bundle> & c_context) override
    {
        @autoreleasepool {
            [djinni_private_get_proxied_objc_object() onEvent:(::djinni_generated::JanusEvent::fromCpp(c_event))
                                                      context:(::djinni_generated::Bundle::fromCpp(c_context))];
        }
    }
    void onHangup(const std::string & c_reason) override
    {
        @autoreleasepool {
            [djinni_private_get_proxied_objc_object() onHangup:(::djinni::String::fromCpp(c_reason))];
        }
    }
};

}  // namespace djinni_generated

namespace djinni_generated {

auto ProtocolDelegate::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    if ([(id)objc isKindOfClass:[JanusProtocolDelegateCppProxy class]]) {
        return ((JanusProtocolDelegateCppProxy*)objc)->_cppRefHandle.get();
    }
    return ::djinni::get_objc_proxy<ObjcProxy>(objc);
}

auto ProtocolDelegate::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    if (auto cppPtr = dynamic_cast<ObjcProxy*>(cpp.get())) {
        return cppPtr->djinni_private_get_proxied_objc_object();
    }
    return ::djinni::get_cpp_proxy<JanusProtocolDelegateCppProxy>(cpp);
}

}  // namespace djinni_generated

@end
