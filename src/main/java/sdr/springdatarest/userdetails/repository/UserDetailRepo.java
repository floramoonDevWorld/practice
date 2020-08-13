package sdr.springdatarest.userdetails.repository;

import org.springframework.data.repository.CrudRepository;
import sdr.springdatarest.userdetails.entities.UserDetail;

public interface UserDetailRepo extends CrudRepository<UserDetail, Long> {
}
