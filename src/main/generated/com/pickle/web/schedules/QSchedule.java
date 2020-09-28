package com.pickle.web.schedules;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSchedule is a Querydsl query type for Schedule
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSchedule extends EntityPathBase<Schedule> {

    private static final long serialVersionUID = 950047722L;

    public static final QSchedule schedule = new QSchedule("schedule");

    public final NumberPath<Integer> checker = createNumber("checker", Integer.class);

    public final StringPath fri = createString("fri");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath mon = createString("mon");

    public final NumberPath<Integer> period = createNumber("period", Integer.class);

    public final StringPath thu = createString("thu");

    public final StringPath tue = createString("tue");

    public final StringPath wed = createString("wed");

    public QSchedule(String variable) {
        super(Schedule.class, forVariable(variable));
    }

    public QSchedule(Path<? extends Schedule> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSchedule(PathMetadata metadata) {
        super(Schedule.class, metadata);
    }

}

