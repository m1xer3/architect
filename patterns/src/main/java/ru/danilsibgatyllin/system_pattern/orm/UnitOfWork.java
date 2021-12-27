package ru.danilsibgatyllin.system_pattern.orm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {

    private final Connection conn;

    private final List<User> newUsers = new ArrayList<>();
    private final List<User> updateUsers = new ArrayList<>();
    private final List<User> deleteUsers = new ArrayList<>();

    public UnitOfWork(Connection conn) {
        this.conn = conn;
    }

    public void registerNew(User user) {
        this.newUsers.add(user);
    }

    public void registerUpdate(User user) {
        this.updateUsers.add(user);
    }

    public void registerDelete(User user) {
        this.deleteUsers.add(user);
    }

    public void commit() {
        insert();
        update();
        delete();
    }

    private void update(){
        // TODO
        updateUsers.stream().forEach(user -> {
            try {
                PreparedStatement stm =conn.prepareStatement("update users set login= ? ,password = ? where id = ?");
                stm.setString(1,user.getLogin());
                stm.setString(2,user.getPassword());
                stm.setLong(3,user.getId());
                stm.executeUpdate();
                updateUsers.remove(user);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });

    }

    private void insert(){
        // TODO
        newUsers.stream().forEach(user -> {
            try {
                PreparedStatement stm =conn.prepareStatement("insert into users values (? ,? ,?)");
                stm.setString(1,user.getLogin());
                stm.setString(2,user.getPassword());
                stm.setLong(3,user.getId());
                stm.executeUpdate();
                newUsers.remove(user);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
    }

    private void delete(){
        // TODO
        deleteUsers.stream().forEach(user -> {
            try {
                PreparedStatement stm =conn.prepareStatement("delete from users where id = ?");
                stm.setLong(1,user.getId());
                stm.executeUpdate();
                deleteUsers.remove(user);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
    }
}
