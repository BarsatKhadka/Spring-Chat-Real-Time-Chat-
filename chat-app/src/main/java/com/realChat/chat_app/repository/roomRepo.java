package com.realChat.chat_app.repository;


import com.realChat.chat_app.entities.room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roomRepo extends JpaRepository<room, Integer> {
    room findByRoomId(String roomId);
}
