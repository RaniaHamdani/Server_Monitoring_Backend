package raniahamdani.servermonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raniahamdani.servermonitoring.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}