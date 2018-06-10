package company.persistence.dao;

import company.SportsObject;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.io.Serializable;

@Named
@Dependent
public class SportsObjectDaoImplementation extends  AbstractDao<SportsObject> implements SportsObjectDao, Serializable {
    private static final long serialVersionUID = 1L;

    private EntityManager entityManager;

    @Override
    protected Class<SportsObject> getEntityClass() {
        return SportsObject.class;
    }

    @Resource
    private UserTransaction userTransaction;
}

