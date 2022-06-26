package com.xia.houqi.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.InputArgument;
import com.xia.houqi.domain.entity.Actor;
import com.xia.houqi.domain.entity.Show;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * description:
 *
 * @author wanghaoxin
 * date     2022/6/22 23:41
 * @version 1.0
 */
@DgsComponent
public class ShowsDatafetcher {


    @DgsData(parentType = "Query", field = "shows")
    public List<Show> shows(@InputArgument String titleFilter) {
        List<Show> shows = Arrays.asList(
                new Show("Stranger Things", 2016),
                new Show("Ozark", 2017),
                new Show("The Crown", 2016),
                new Show("Dead to Me", 2019),
                new Show("Orange is the New Black", 2013)
        );
        // 这里面只给title name
        return shows;
    }


    @DgsData(parentType = "Show", field = "actor")
    public Actor actors(DgsDataFetchingEnvironment dfe) {
        Show show = dfe.getSource();
        show.setActor(new Actor("whx", 27 + "" + Calendar.getInstance().getTimeInMillis()));
        return show.getActor();
    }
}
