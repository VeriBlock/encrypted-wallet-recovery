package org.veriblock.core.wallet.serialization;

public class EncryptedInfo {
    public byte[] salt;
    public byte[] iv;
    public byte[] additionalData;
    public byte[] cipherText;
}