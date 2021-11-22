package com.example.test.jpa.repository;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.impl.AbstractJPAQuery;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import javax.annotation.Nullable;
import javax.annotation.PostConstruct;

public abstract class QuerydslRepositorySupportExtended extends QuerydslRepositorySupport {

    private JPAQueryFactory jpaQueryFactory;

    /**
     * Creates a new {@link QuerydslRepositorySupportExtended} instance for the given domain type.
     *
     * @param domainClass must not be {@literal null}.
     */
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public QuerydslRepositorySupportExtended(Class<?> domainClass) {
        super(domainClass);
    }

    @PostConstruct
    public void validate() {
        super.validate();
        this.jpaQueryFactory = new JPAQueryFactory(getEntityManager());
    }

    protected JPAQueryFactory jpaQueryFactory() {
        return jpaQueryFactory;
    }

    @Nullable
    protected <T> AbstractJPAQuery<T, JPAQuery<T>> query() {
        return getQuerydsl().createQuery();
    }

    @Nullable
    public AbstractJPAQuery<Object, JPAQuery<Object>> query(EntityPath<?>... paths) {
        return getQuerydsl().createQuery(paths);
    }
}