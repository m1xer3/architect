package ru.danilsibgatyllin.system_pattern.orm;

import java.sql.SQLException;

public class OrmApp {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserRepository userRepository = new UserRepository(ConnectionConfig.getConnectDB());
        userRepository.insert(new User(userRepository.getNextId(),"Jone","qwerty"));
        userRepository.insert(new User(userRepository.getNextId(),"Tom","qwerty1"));
        User updateUser = userRepository.findById(1).get();
        updateUser.setLogin("Jone_change");
        userRepository.update(updateUser);
        userRepository.delete(userRepository.findById(2).get());
        userRepository.commitTransaction();
    }
}
