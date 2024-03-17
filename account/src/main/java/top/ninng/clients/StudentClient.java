package top.ninng.clients;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * student client
 */
@FeignClient(name = "student-service")
public interface StudentClient extends StudentApi {
}