package com.pickle.web.users;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -456476334L;

    public static final QUser user = new QUser("user");

    public final ListPath<com.pickle.web.attendances.Attendance, com.pickle.web.attendances.QAttendance> attendances = this.<com.pickle.web.attendances.Attendance, com.pickle.web.attendances.QAttendance>createList("attendances", com.pickle.web.attendances.Attendance.class, com.pickle.web.attendances.QAttendance.class, PathInits.DIRECT2);

    public final NumberPath<Integer> curGrade = createNumber("curGrade", Integer.class);

    public final StringPath email = createString("email");

    public final ListPath<com.pickle.web.grades.Grade, com.pickle.web.grades.QGrade> grades = this.<com.pickle.web.grades.Grade, com.pickle.web.grades.QGrade>createList("grades", com.pickle.web.grades.Grade.class, com.pickle.web.grades.QGrade.class, PathInits.DIRECT2);

    public final NumberPath<Integer> homeClass = createNumber("homeClass", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.pickle.web.grades.Mock, com.pickle.web.grades.QMock> mocks = this.<com.pickle.web.grades.Mock, com.pickle.web.grades.QMock>createList("mocks", com.pickle.web.grades.Mock.class, com.pickle.web.grades.QMock.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final ListPath<com.pickle.web.notices.NoticeComment, com.pickle.web.notices.QNoticeComment> noticeComments = this.<com.pickle.web.notices.NoticeComment, com.pickle.web.notices.QNoticeComment>createList("noticeComments", com.pickle.web.notices.NoticeComment.class, com.pickle.web.notices.QNoticeComment.class, PathInits.DIRECT2);

    public final ListPath<com.pickle.web.notices.Notice, com.pickle.web.notices.QNotice> notices = this.<com.pickle.web.notices.Notice, com.pickle.web.notices.QNotice>createList("notices", com.pickle.web.notices.Notice.class, com.pickle.web.notices.QNotice.class, PathInits.DIRECT2);

    public final StringPath phone = createString("phone");

    public final NumberPath<Integer> positionChecker = createNumber("positionChecker", Integer.class);

    public final NumberPath<Integer> schoolCode = createNumber("schoolCode", Integer.class);

    public final StringPath schoolName = createString("schoolName");

    public final ListPath<com.pickle.web.subjects.SubjectDetail, com.pickle.web.subjects.QSubjectDetail> subjectsDetails = this.<com.pickle.web.subjects.SubjectDetail, com.pickle.web.subjects.QSubjectDetail>createList("subjectsDetails", com.pickle.web.subjects.SubjectDetail.class, com.pickle.web.subjects.QSubjectDetail.class, PathInits.DIRECT2);

    public final NumberPath<Integer> userCode = createNumber("userCode", Integer.class);

    public final StringPath userId = createString("userId");

    public final StringPath userPw = createString("userPw");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

