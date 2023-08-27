package com.petapp.starter.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ivan.graciarena
 * @project spring-boot-starter
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Location {
    Double id;
    String latitude;
    String longitude;
}
