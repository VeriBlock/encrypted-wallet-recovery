package org.veriblock.core.utilities;

public class Utility {
    public static String bytesToBase64(byte[] bytes) { return java.util.Base64.getEncoder().encodeToString(bytes); }
}
