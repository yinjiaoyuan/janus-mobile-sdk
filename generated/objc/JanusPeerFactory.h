// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

#import <Foundation/Foundation.h>
@protocol JanusPeer;
@protocol JanusProtocol;


@protocol JanusPeerFactory

- (nullable id<JanusPeer>)create:(int64_t)id
                           owner:(nullable id<JanusProtocol>)owner;

@end
