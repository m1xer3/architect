package ru.danilsibgatyllin.system_pattern.orm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class UserRepository {

    private final Connection conn;

    private final UserMapper mapper;

    private UnitOfWork unitOfWork;

    public UserRepository(Connection conn) {
        this.conn = conn;
        this.mapper = new UserMapper(conn);
        this.unitOfWork = new UnitOfWork(conn);
    }

    public Optional<User> findById(long id) {
        return mapper.findById(id);
    }

    public void beginTransaction() {
        this.unitOfWork = new UnitOfWork(conn);
    }

    public void insert(User user) {
        unitOfWork.registerNew(user);
    }

    public void update(User user) {
        unitOfWork.registerUpdate(user);
    }

    public void delete(User user) {
        unitOfWork.registerUpdate(user);
    }

    public void commitTransaction() {
        unitOfWork.commit();
    }

    public Long getNextId() throws SQLException {
        Long id = getMaxIdInDB();
        if(id==null) id=0l;
        return ++id;
    }

    private  Long getMaxIdInDB() throws SQLException {
        ResultSet res = conn.prepareStatement("select max(id) from users").executeQuery();
        return res.getLong(1);
    };

}
