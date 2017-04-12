package com.zico.helpDesk.domain.model.entity.comm;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommCode is a Querydsl query type for CommCode
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommCode extends EntityPathBase<CommCode> {

    private static final long serialVersionUID = 968226865L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommCode commCode = new QCommCode("commCode");

    public final StringPath codeNm = createString("codeNm");

    public final com.zico.helpDesk.domain.model.entity.comm.embedded.QCommCodeId commCodeId;

    public final StringPath groupCodeNm = createString("groupCodeNm");

    public final DateTimePath<java.util.Date> modifyDt = createDateTime("modifyDt", java.util.Date.class);

    public final StringPath parentCodeId = createString("parentCodeId");

    public final StringPath parentGroupCodeId = createString("parentGroupCodeId");

    public final DateTimePath<java.util.Date> regDt = createDateTime("regDt", java.util.Date.class);

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final EnumPath<UseYn> useYn = createEnum("useYn", UseYn.class);

    public QCommCode(String variable) {
        this(CommCode.class, forVariable(variable), INITS);
    }

    public QCommCode(Path<? extends CommCode> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommCode(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommCode(PathMetadata metadata, PathInits inits) {
        this(CommCode.class, metadata, inits);
    }

    public QCommCode(Class<? extends CommCode> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.commCodeId = inits.isInitialized("commCodeId") ? new com.zico.helpDesk.domain.model.entity.comm.embedded.QCommCodeId(forProperty("commCodeId")) : null;
    }

}

