/*
 * Decompiled with CFR 0.152.
 */
package com.ea.sdk;

public class SDKMIDlet
extends z {
    public static SDKMIDlet a;

    public SDKMIDlet() {
        a = this;
    }

    public static void a() {
        ae.a();
    }

    public static String a(String string) {
        if ((string = ae.a(string)).equals("NULL")) {
            string = null;
        }
        return string;
    }
}

