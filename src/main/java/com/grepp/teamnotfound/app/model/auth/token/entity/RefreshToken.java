package com.grepp.teamnotfound.app.model.auth.token.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class RefreshToken {
    private String id = UUID.randomUUID().toString();
    private String atId;
    private String token = UUID.randomUUID().toString();
    private Long ttl = 3600 * 24 * 7L;

    public RefreshToken(String atId) {
        this.atId = atId;
    }
}
