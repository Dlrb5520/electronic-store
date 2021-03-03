package com.yl.responseBean;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ResponseBean implements Serializable{

    private Integer code;

    private String message;

    private Object data;

    public ResponseBean(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseBean(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ResponseBean(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
