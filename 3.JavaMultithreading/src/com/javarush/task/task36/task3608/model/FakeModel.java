package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FakeModel implements Model{
    private ModelData modelData=new ModelData();
    private UserService userService=new UserServiceImpl();
    @Override
    public ModelData getModelData()  {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(Stream.of
            (
                 new User("A",1,1)
                ,new User("B",2,1)
            ).collect(Collectors.toList())
        );
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}