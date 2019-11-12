package com.OneToOne;

import com.Main;
import com.OneToOne.entity.Room;
import com.OneToOne.entity.User;
import com.OneToOne.service.RoomService;
import com.OneToOne.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
public class Tests {

    @Autowired
    RoomService roomService;
    @Autowired
    UserService userService;

    @Test //save user and room
    public void test() {
        User user = new User("Peter", new Room(1,1));
        System.out.println(userService.save(user));
    }

    @Test //when the user is deleted, his room is also deleted
    public void test2() {
        List<User> users = userService.getAll();
        System.out.println(users);

        userService.delete(users.get(0).getId());

        System.out.println(userService.getAll());
    }

    @Test //prints room list with user names
    public void test3() {
        List<Room> rooms = roomService.getAll();
        rooms.forEach(e -> System.out.println(
                String.format("{id: %s, floor: %d, number: %d, user: %s}",
                        e.getId(), e.getFloor(), e.getNumber(), e.getUser().getName())));

    }
}
