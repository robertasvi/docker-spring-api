package com.dockertutorial.api.repository;

import com.dockertutorial.api.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface LogRepository extends MongoRepository<Log, String> {

    @Query("{type:'?0'}")
    Log findLogByType(String type);

    Log save(Log log);

    public long count();
}
