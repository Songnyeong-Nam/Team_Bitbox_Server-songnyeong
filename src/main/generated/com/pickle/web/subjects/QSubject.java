package com.pickle.web.subjects;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubject is a Querydsl query type for Subject
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSubject extends EntityPathBase<Subject> {

    private static final long serialVersionUID = -549516442L;

    public static final QSubject subject = new QSubject("subject");

    public final ListPath<com.pickle.web.file.File, com.pickle.web.file.QFile> files = this.<com.pickle.web.file.File, com.pickle.web.file.QFile>createList("files", com.pickle.web.file.File.class, com.pickle.web.file.QFile.class, PathInits.DIRECT2);

    public final ListPath<com.pickle.web.grades.Grade, com.pickle.web.grades.QGrade> grades = this.<com.pickle.web.grades.Grade, com.pickle.web.grades.QGrade>createList("grades", com.pickle.web.grades.Grade.class, com.pickle.web.grades.QGrade.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath subjectCode = createString("subjectCode");

    public final ListPath<SubjectDetail, QSubjectDetail> subjectDetails = this.<SubjectDetail, QSubjectDetail>createList("subjectDetails", SubjectDetail.class, QSubjectDetail.class, PathInits.DIRECT2);

    public final StringPath subjectName = createString("subjectName");

    public QSubject(String variable) {
        super(Subject.class, forVariable(variable));
    }

    public QSubject(Path<? extends Subject> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubject(PathMetadata metadata) {
        super(Subject.class, metadata);
    }

}

