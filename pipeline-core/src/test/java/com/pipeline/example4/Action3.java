package com.pipeline.example4;

import com.pipeline.annotation.HandlerMethod;

/**
 * @author KonstantinTsykulenko
 * @since 1/2/13
 */
public class Action3 {
    @HandlerMethod
    public void process() {
        System.out.println("action3");
    }
}
