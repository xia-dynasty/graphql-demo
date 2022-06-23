package com.xia.yu.graphqldemo.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.xia.yu.graphqldemo.domain.entity.Show;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * description:
 *
 * @author wanghaoxin
 * date     2022/6/22 23:41
 * @version 1.0
 */
@DgsComponent
public class ShowsDatafetcher {
    private final List<Show> shows = Arrays.asList(
            new Show("Stranger Things", 2016),
            new Show("Ozark", 2017),
            new Show("The Crown", 2016),
            new Show("Dead to Me", 2019),
            new Show("Orange is the New Black", 2013)
    );

    @DgsData(parentType = "Query", field = "shows")
    public List<Show> shows(@InputArgument String titleFilter) {
        if (titleFilter == null) {
            return shows;
        }

        return shows.stream().filter(s -> s.getTitle().contains(titleFilter)).collect(Collectors.toList());
    }
}
