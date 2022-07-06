package com.sadra.show.exeption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RException extends Exception {
    private Integer status;
    private String Message;

    public RException(String message, Integer status) {
        super(message);
        this.status = status;
    }
}
