package com.pickle.web.grades;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMock is a Querydsl query type for Mock
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMock extends EntityPathBase<Mock> {

    private static final long serialVersionUID = 726628283L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMock mock = new QMock("mock");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> percent = createNumber("percent", Integer.class);

    public final NumberPath<Integer> score = createNumber("score", Integer.class);

    public final NumberPath<Integer> semester_code = createNumber("semester_code", Integer.class);

    public final NumberPath<Integer> standard = createNumber("standard", Integer.class);

    public final StringPath subject = createString("subject");

    public final com.pickle.web.users.QUser user;

    public QMock(String variable) {
        this(Mock.class, forVariable(variable), INITS);
    }

    public QMock(Path<? extends Mock> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMock(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMock(PathMetadata metadata, PathInits inits) {
        this(Mock.class, metadata, inits);
    }

    public QMock(Class<? extends Mock> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.pickle.web.users.QUser(forProperty("user")) : null;
    }

}

