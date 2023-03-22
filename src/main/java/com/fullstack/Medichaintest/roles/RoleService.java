package com.fullstack.Medichaintest.roles;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository){
        this.roleRepository =roleRepository;
    }

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public void postRole(Role role){

//        Optional<Role> roleOptional = roleRepository.findByName(role.getName());
//
//        if(roleOptional.isPresent()){
//            throw new IllegalStateException("This role already exist");
//        }
        Role role1 = roleRepository.findByName(role.getName());

        roleRepository.save(role1);

    }


//    @Transactional
//    public Role createRoleIfNotFound(String name, Collection<Privilege> privileges) {
//
//        Role role = roleRepository.findByName(name);
//        if (role == null) {
//            role = new Role(name);
//            role.setPrivileges(privileges);
//            roleRepository.save(role);
//        }
//        return role;
//    }

    //@Transactional

}
