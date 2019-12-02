package com.startspring.twitterclone.repositories;

import com.startspring.twitterclone.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
