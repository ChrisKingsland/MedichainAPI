package com.fullstack.Medichaintest.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/document")
public class RoleController {

    public final RoleService roleservice;

    @Autowired
    public RoleController(RoleService roleService){
        this.roleservice = roleService;
    }

    @GetMapping("identifyRoles")
    public List <Role> getAllRoles(){

        return roleservice.getAllRoles();
    }



   /* @GetMapping("rolesByid/{name}")
    public List <Role> getRolesByid(@PathVariable("{id}") String name){

        return roleservice.rolesByid(name);
    }

    */
}
