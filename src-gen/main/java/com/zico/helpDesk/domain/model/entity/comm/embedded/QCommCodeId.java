package com.zico.helpDesk.domain.model.entity.comm.embedded;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommCodeId is a Querydsl query type for CommCodeId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCommCodeId extends BeanPath<CommCodeId> {

    private static final long serialVersionUID = -484973536L;

    public static final QCommCodeId commCodeId = new QCommCodeId("commCodeId");

    public final StringPath codeId = createString("codeId");

    public final StringPath groupCodeId = createString("groupCodeId");

    public QCommCodeId(String variable) {
        super(CommCodeId.class, forVariable(variable));
    }

    public QCommCodeId(Path<? extends CommCodeId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommCodeId(PathMetadata metadata) {
        super(CommCodeId.class, metadata);
    }

}

