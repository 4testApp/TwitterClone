package com.startspring.twitterclone.repositories;

import com.startspring.twitterclone.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {

}
