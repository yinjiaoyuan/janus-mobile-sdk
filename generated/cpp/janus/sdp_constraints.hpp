// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

#pragma once

#include <utility>

namespace Janus {

struct SdpConstraints final {
    bool send_audio;
    bool send_video;
    bool receive_audio;
    bool receive_video;
    bool datachannel;

    SdpConstraints(bool send_audio_,
                   bool send_video_,
                   bool receive_audio_,
                   bool receive_video_,
                   bool datachannel_)
    : send_audio(std::move(send_audio_))
    , send_video(std::move(send_video_))
    , receive_audio(std::move(receive_audio_))
    , receive_video(std::move(receive_video_))
    , datachannel(std::move(datachannel_))
    {}
};

}  // namespace Janus
