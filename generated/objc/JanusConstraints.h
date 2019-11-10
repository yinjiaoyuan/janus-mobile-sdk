// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

#import "JanusSdpConstraints.h"
#import "JanusVideoConstraints.h"
#import <Foundation/Foundation.h>

@interface JanusConstraints : NSObject
- (nonnull instancetype)initWithSdp:(nonnull JanusSdpConstraints *)sdp
                              video:(nonnull JanusVideoConstraints *)video;
+ (nonnull instancetype)constraintsWithSdp:(nonnull JanusSdpConstraints *)sdp
                                     video:(nonnull JanusVideoConstraints *)video;

@property (nonatomic, readonly, nonnull) JanusSdpConstraints * sdp;

@property (nonatomic, readonly, nonnull) JanusVideoConstraints * video;

@end
