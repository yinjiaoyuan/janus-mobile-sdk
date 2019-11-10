// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

package com.github.helloiampau.janus.generated;

public final class SdpConstraints {


    /*package*/ final boolean sendAudio;

    /*package*/ final boolean sendVideo;

    /*package*/ final boolean receiveAudio;

    /*package*/ final boolean receiveVideo;

    /*package*/ final boolean datachannel;

    public SdpConstraints(
            boolean sendAudio,
            boolean sendVideo,
            boolean receiveAudio,
            boolean receiveVideo,
            boolean datachannel) {
        this.sendAudio = sendAudio;
        this.sendVideo = sendVideo;
        this.receiveAudio = receiveAudio;
        this.receiveVideo = receiveVideo;
        this.datachannel = datachannel;
    }

    public boolean getSendAudio() {
        return sendAudio;
    }

    public boolean getSendVideo() {
        return sendVideo;
    }

    public boolean getReceiveAudio() {
        return receiveAudio;
    }

    public boolean getReceiveVideo() {
        return receiveVideo;
    }

    public boolean getDatachannel() {
        return datachannel;
    }

    @Override
    public String toString() {
        return "SdpConstraints{" +
                "sendAudio=" + sendAudio +
                "," + "sendVideo=" + sendVideo +
                "," + "receiveAudio=" + receiveAudio +
                "," + "receiveVideo=" + receiveVideo +
                "," + "datachannel=" + datachannel +
        "}";
    }

}
