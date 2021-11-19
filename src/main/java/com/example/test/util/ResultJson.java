package com.example.test.util;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResultJson {
    private List<?> items;
    private Object data;
    private long total;
    private boolean success;
}
