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

    public String getDesc() {
        return desc;
    }

    public static boolean isEnvExist(String env) {
        return Stream.of(ENVS.values())
                .map(ENVS::getDesc)
                .collect(Collectors.toList())
                .contains(env);
    }
}
