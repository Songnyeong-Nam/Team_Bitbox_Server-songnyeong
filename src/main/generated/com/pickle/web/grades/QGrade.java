package com.pickle.web.grades;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGrade is a Querydsl query type for Grade
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGrade extends EntityPathBase<Grade> {

    private static final long serialVersionUID = 1045186502L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGrade grade = new QGrade("grade");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> score = createNumber("score", Integer.class);

    public final NumberPath<Integer> semesterCode = createNumber("semesterCode", Integer.class);

    public final com.pickle.web.subjects.QSubject subject;

    public final com.pickle.web.users.QUser user;

    public QGrade(String variable) {
        this(Grade.class, forVariable(variable), INITS);
    }

    public QGrade(Path<? extends Grade> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGrade(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGrade(PathMetadata metadata, PathInits inits) {
        this(Grade.class, metadata, inits);
    }

    public QGrade(Class<? extends Grade> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.subject = inits.isInitialized("subject") ? new com.pickle.web.subjects.QSubject(forProperty("subject")) : null;
        this.user = inits.isInitialized("user") ? new com.pickle.web.users.QUser(forProperty("user")) : null;
    }

}

