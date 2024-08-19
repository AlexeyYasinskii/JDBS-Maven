package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("Alex", "Malex", (byte) 31);
        userService.saveUser("Biba", "Diba", (byte) 42);
        userService.saveUser("Boba", "Doba", (byte) 53);
        userService.saveUser("Lipa", "Smedom", (byte) 64);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
