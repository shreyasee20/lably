package com.xfactor.lably.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.xfactor.lably.entity.Lab;

@RestController
@RequestMapping("/Labs")
public class Labcontroller {

    ArrayList<Lab> labs = new ArrayList<>();

    @PostMapping("/addLabs")
    public Lab addLabs(@RequestBody Lab A1) {
        labs.add(A1);
        return A1;
    }


    @GetMapping("/getLabs")
    public ArrayList<Lab> getLabs() {
        for(int i =0;i<5;i++)
        {
            Lab obj=new Lab();
            obj.setName("SG");
            obj.setPhone("9876543210");
            obj.setAddress("Kolkata");
            obj.setPincode("700025");
            labs.add(obj);
        }
        return labs;
    }

    @GetMapping("/getLabs/{name}")
    public Lab getLabs(@PathVariable String name) {
        Lab res=new Lab();
        for (Lab k : labs) 
        { 
            if(k.getName().equals(name))
            {
                return k;
            }
        }
        return res;
    }
}