package com.xfactor.lably.controllers;

import java.util.ArrayList;

import com.xfactor.lably.entity.Admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Admincontroller {

    ArrayList<Admin> admins = new ArrayList<>();

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin A1) {
        admins.add(A1);
        return A1;
    }

    @GetMapping("/getAdmin")
    public ArrayList<Admin> getAdmin() {
        for(int i=0;i<5;i++)
        {
            Admin obj=new Admin();
            obj.setName("SG");
            obj.setUsername("SG1999");
            obj.setPassword("1362");
            admins.add(obj);
        }
        return admins;
    }

    @GetMapping("/getAdmin/{name}")
    public Admin getAdmin(@PathVariable String name) {
        Admin res=new Admin();
        for (Admin k : admins) 
        { 
            if(k.getName().equals(name))
            {
                return k;
            }
        }
        return res;
    }
}