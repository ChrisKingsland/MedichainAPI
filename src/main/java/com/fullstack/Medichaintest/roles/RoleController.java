package com.fullstack.Medichaintest.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/role")
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

    @PostMapping("post")
    public void postRole(@RequestBody Role role){
        roleservice.postRole(role);
    }






   /* @GetMapping("rolesByid/{name}")
    public List <Role> getRolesByid(@PathVariable("{id}") String name){

        return roleservice.rolesByid(name);
    }

    */
}
