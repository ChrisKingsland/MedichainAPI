package com.fullstack.Medichaintest.roles;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
@Service
public class RoleService {
    private RoleRepository roleRepository;
    private PrivilegeRepository privilegeRepository;
    @Autowired
    public RoleService(RoleRepository roleRepository, PrivilegeRepository privilegeRepository){
        this.roleRepository =roleRepository;
        this.privilegeRepository =privilegeRepository;
    }

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }


    @Transactional
    public Role createRoleIfNotFound(String name, Collection<Privilege> privileges) {

        Role role = roleRepository.findByName(name);
        if (role == null) {
            role = new Role(name);
            role.setPrivileges(privileges);
            roleRepository.save(role);
        }
        return role;
    }

    @Transactional
    Privilege createPrivilegeIfNotFound(String name) {

        Privilege privilege = privilegeRepository.findByName(name);
        if (privilege == null) {
            privilege = new Privilege(name);
            privilegeRepository.save(privilege);
        }
        return privilege;
    }
}
