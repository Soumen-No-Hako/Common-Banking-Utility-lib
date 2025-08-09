package artim.nemuos.banking.lib.common.bankingRepostitories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BasicBankingRepository<T, ID> extends CrudRepository<T, ID> {
    public default String auditAction(String msg)
    {
        return "[REPO Audit] : "+msg;
    }
    public default String auditAction(T entity)
    {
        return "[REPO Audit] : "+entity.toString();
    }
    default <S extends T> void saveAfterVerify(S entity)
    {
        verifyEntity(entity);
        save(entity); // write in such a away to co-ordinate with dataValidation
    }
    default <S extends T> void saveAllAfterVerify(Iterable<S> entities)
    {
        verifyEntity(entities);
        saveAll(entities);
    }

    <S> void verifyEntity(S entity);
    //TODO create abstract classes/objects for versatile usability
}
