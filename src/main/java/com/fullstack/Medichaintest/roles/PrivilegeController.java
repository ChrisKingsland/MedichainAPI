package com.fullstack.Medichaintest.roles;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrivilegeController {
    private final PrivilegeService privilegeService;

    public PrivilegeController(PrivilegeService privilegeService){
        this.privilegeService = privilegeService;
    }

    public List<Privilege> getPrivlege(){
        return privilegeService.getPrivileges();
    }
}
