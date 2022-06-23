package com.xia.yu.graphqldemo.domain.entity;

/**
 * description:
 *
 * @author wanghaoxin
 * date     2022/6/22 23:42
 * @version 1.0
 */
public class Show {
    private final String title;
    private final Integer releaseYear;

    public Show(String title, Integer releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
}
