package com.fullstack.Medichaintest.roles;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeService {

    private PrivilegeRepository privilegeRepository;

    public PrivilegeService(PrivilegeRepository privilegeRepository){
        this.privilegeRepository =privilegeRepository;
    }

    public List<Privilege> getPrivileges(){
        return privilegeRepository.findAll();
    }


    public Privilege createPrivilegeIfNotFound(String name) {

        Privilege privilege = privilegeRepository.findByName(name);
        if (privilege == null) {
            privilege = new Privilege(name);
            privilegeRepository.save(privilege);
        }
        return privilege;
    }


}
