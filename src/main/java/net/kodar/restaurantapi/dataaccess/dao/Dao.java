package net.kodar.restaurantapi.dataaccess.dao;


public interface Dao<ENT, PK> {
	
    ENT get(PK id) throws Exception;

    Iterable<ENT> getAll();

    ENT save(ENT t);

    void update(ENT t);

    void delete(PK id);
}
