package com.addrecord;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    void addUser(User user);

    @Query("select * from users")
    List<User> getUser();

    @Delete
    void deleteUser(User user);

}