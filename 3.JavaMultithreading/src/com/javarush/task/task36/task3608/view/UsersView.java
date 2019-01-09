package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public class UsersView implements View{
    private Controller controller;
    @Override
    public void setController(Controller controller) {
        this.controller=controller;
    }
    @Override
    public void refresh(ModelData modelData) {
        StringBuilder sb;
        if(modelData.isDisplayDeletedUserList()) sb=new StringBuilder("All deleted users:").append(System.lineSeparator());
        else sb=new StringBuilder("All users:").append(System.lineSeparator());
        for(User u:modelData.getUsers()){
            sb.append("\tUser{name='").append(u.getName())
                    .append("', id=").append(u.getId())
                    .append(", level=").append(u.getLevel())
                    .append("}").append(System.lineSeparator());
        }
        sb.append("===================================================");
        System.out.println(sb);
    }
    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }
    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }
    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }
}