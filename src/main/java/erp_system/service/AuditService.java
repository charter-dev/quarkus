package erp_system.service;

import java.time.LocalDateTime;

import erp_system.audit.AuditLog;
import erp_system.repository.AuditRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AuditService {

    @Inject
    AuditRepository repo;

    @Transactional
    public void log(String user,String method,String path,String body,Integer status,String ip){

        AuditLog log = new AuditLog();

        log.username = user;
        log.method = method;
        log.path = path;
        log.requestBody = body;
        log.status = status;
        log.ipAddress = ip;
        log.createdDate = LocalDateTime.now();

        repo.persist(log);

    }

}