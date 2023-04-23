package com.fsck.k9.mail.ssl;

/**
 * @author yukdawn@gmail.com 2023/4/23 1:33
 */
/**
 * Thrown on problems accessing the {@link KeyChain}.
 */
public class KeyChainException extends Exception {

    /**
     * Constructs a new {@code KeyChainException} that includes the
     * current stack trace.
     */
    public KeyChainException() {
    }

    /**
     * Constructs a new {@code KeyChainException} with the current stack
     * trace and the specified detail message.
     *
     * @param detailMessage
     *            the detail message for this exception.
     */
    public KeyChainException(String detailMessage) {
        super(detailMessage);
    }

    /**
     * Constructs a new {@code KeyChainException} with the current stack
     * trace, the specified detail message and the specified cause.
     *
     * @param message
     *            the detail message for this exception.
     * @param cause
     *            the cause of this exception, may be {@code null}.
     */
    public KeyChainException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new {@code KeyChainException} with the current stack
     * trace and the specified cause.
     *
     * @param cause
     *            the cause of this exception, may be {@code null}.
     */
    public KeyChainException(Throwable cause) {
        super((cause == null ? null : cause.toString()), cause);
    }
}