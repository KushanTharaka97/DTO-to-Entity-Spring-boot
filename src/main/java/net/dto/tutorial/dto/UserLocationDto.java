package net.dto.tutorial.dto;

import lombok.Data;

@Data
public class UserLocationDto {
    private long UserId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
