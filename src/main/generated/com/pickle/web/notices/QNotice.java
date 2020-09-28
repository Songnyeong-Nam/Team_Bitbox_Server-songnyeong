package com.pickle.web.notices;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNotice is a Querydsl query type for Notice
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNotice extends EntityPathBase<Notice> {

    private static final long serialVersionUID = 1288319084L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNotice notice = new QNotice("notice");

    public final StringPath category = createString("category");

    public final StringPath contents = createString("contents");

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    public final ListPath<com.pickle.web.file.File, com.pickle.web.file.QFile> files = this.<com.pickle.web.file.File, com.pickle.web.file.QFile>createList("files", com.pickle.web.file.File.class, com.pickle.web.file.QFile.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<NoticeComment, QNoticeComment> noticeComment = this.<NoticeComment, QNoticeComment>createList("noticeComment", NoticeComment.class, QNoticeComment.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final StringPath title = createString("title");

    public final com.pickle.web.users.QUser user;

    public QNotice(String variable) {
        this(Notice.class, forVariable(variable), INITS);
    }

    public QNotice(Path<? extends Notice> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNotice(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNotice(PathMetadata metadata, PathInits inits) {
        this(Notice.class, metadata, inits);
    }

    public QNotice(Class<? extends Notice> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.pickle.web.users.QUser(forProperty("user")) : null;
    }

}

