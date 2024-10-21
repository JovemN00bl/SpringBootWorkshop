package application.springbootworkshop.resources.Excepitons;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class StandardError  implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Instant timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError(){}

    public StandardError(Instant timeStamp, String path, String message, String error, Integer status) {
        super();
        this.timeStamp = timeStamp;
        this.path = path;
        this.message = message;
        this.error = error;
        this.status = status;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
