package com.pickle.web.notices;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticeComment is a Querydsl query type for NoticeComment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNoticeComment extends EntityPathBase<NoticeComment> {

    private static final long serialVersionUID = 1128088659L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticeComment noticeComment = new QNoticeComment("noticeComment");

    public final StringPath commentContents = createString("commentContents");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QNotice notice;

    public final com.pickle.web.users.QUser user;

    public QNoticeComment(String variable) {
        this(NoticeComment.class, forVariable(variable), INITS);
    }

    public QNoticeComment(Path<? extends NoticeComment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticeComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticeComment(PathMetadata metadata, PathInits inits) {
        this(NoticeComment.class, metadata, inits);
    }

    public QNoticeComment(Class<? extends NoticeComment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notice = inits.isInitialized("notice") ? new QNotice(forProperty("notice"), inits.get("notice")) : null;
        this.user = inits.isInitialized("user") ? new com.pickle.web.users.QUser(forProperty("user")) : null;
    }

}

