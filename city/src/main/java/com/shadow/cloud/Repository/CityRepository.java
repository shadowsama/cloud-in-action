package com.shadow.cloud.Repository;

import com.shadow.cloud.domain.City;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2016/9/19.
 */
public interface CityRepository  extends MongoRepository<City,String>{
    public City findBy_id(String _id);
    public City findByName(String name);


}