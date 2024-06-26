package com.states.cse416.Repository;

import com.states.cse416.Models.State;
import com.states.cse416.Models.enums.StateName;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends MongoRepository<State, ObjectId> {
    State findByState(StateName state);
}
