package service;

import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;

public class ApplicationException extends RuntimeException implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = -7560876915301869895L;

    private final String uuid;
    private final ErrorCode errorCode;

    private final transient Serializable[] params;

    /**
     * constructor of Application exception containing a root cause (Throwable).
     * Unique exception uuid is generated.
     *
     * @param cause
     * @param errorCode
     * @param params
     */
    public ApplicationException(final Throwable cause, final ErrorCode errorCode, final Serializable... params) {
        super(cause);
        this.errorCode = errorCode;
        this.params = Arrays.copyOf(params, params.length);
        this.uuid = Long.toString(Math.abs(UUID.randomUUID().getMostSignificantBits()), Character.MAX_RADIX)
                .substring(4);
    }

    /**
     * Unique exception uuid is generated.
     *
     * @param errorCode
     * @param params
     */
    public ApplicationException(final ErrorCode errorCode, final Serializable... params) {
        this.errorCode = errorCode;
        this.params = Arrays.copyOf(params, params.length);
        this.uuid = Long.toString(Math.abs(UUID.randomUUID().getMostSignificantBits()), Character.MAX_RADIX)
                .substring(4);
    }

    /**
     * @return the uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return the params
     */
    public Serializable[] getParams() {
        return Arrays.copyOf(this.params, this.params.length);

    }

    /**
     * @return the errorCode
     */
    public ErrorCode getErrorCode() {
        return this.errorCode;
    }


}
