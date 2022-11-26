package com.tobias.couponservice.inner.domain.standardType;

public enum Type {
    PERCENTAG("백분율"), // 백분율 할인
    AMOUNT("현금");  // 금액 할인

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
