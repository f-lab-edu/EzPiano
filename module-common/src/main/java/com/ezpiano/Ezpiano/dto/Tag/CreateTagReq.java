package com.ezpiano.Ezpiano.dto.Tag;

import com.ezpiano.Ezpiano.entity.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateTagReq {
    private String title;
    private String color;

    public Tag toEntity(){
        return Tag.builder()
                .title(title)
                .color(color)
                .build();
    }
}
