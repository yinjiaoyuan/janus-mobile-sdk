// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from janus-client.djinni

package com.github.helloiampau.janus.generated;

public final class JanusError {


    /*package*/ final long code;

    /*package*/ final String message;

    public JanusError(
            long code,
            String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "JanusError{" +
                "code=" + code +
                "," + "message=" + message +
        "}";
    }

}
