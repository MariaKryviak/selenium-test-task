package com.rozetka.enums;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ENVS {

    DEV("dev"),
    TEST("test");

    final String desc;

    ENVS(String desc) {
        this.desc = desc;
    }

    public static boolean isEnvExist(String env) {
        return Stream.of(ENVS.values())
                .map(value -> value.desc)
                .collect(Collectors.toList())
                .contains(env);
    }
}
