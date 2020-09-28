package com.pickle.web.subjects;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubjectDetail is a Querydsl query type for SubjectDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSubjectDetail extends EntityPathBase<SubjectDetail> {

    private static final long serialVersionUID = -1508545705L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubjectDetail subjectDetail = new QSubjectDetail("subjectDetail");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lessonDetail = createString("lessonDetail");

    public final NumberPath<Integer> lessonNo = createNumber("lessonNo", Integer.class);

    public final StringPath lessonTitle = createString("lessonTitle");

    public final QSubject subject;

    public final com.pickle.web.users.QUser user;

    public QSubjectDetail(String variable) {
        this(SubjectDetail.class, forVariable(variable), INITS);
    }

    public QSubjectDetail(Path<? extends SubjectDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubjectDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubjectDetail(PathMetadata metadata, PathInits inits) {
        this(SubjectDetail.class, metadata, inits);
    }

    public QSubjectDetail(Class<? extends SubjectDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.subject = inits.isInitialized("subject") ? new QSubject(forProperty("subject")) : null;
        this.user = inits.isInitialized("user") ? new com.pickle.web.users.QUser(forProperty("user")) : null;
    }

}

