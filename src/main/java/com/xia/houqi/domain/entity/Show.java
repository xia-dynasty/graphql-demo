package com.xia.houqi.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description:
 *
 * @author wanghaoxin
 * date     2022/6/22 23:42
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {
    private String title;
    private Integer releaseYear;

    private Actor actor;

    public Show(String title, Integer releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
}
