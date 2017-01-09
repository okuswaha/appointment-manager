package com.prakash.resource;

/**
 * Created by okuswaha on 1/9/2017.
 */


import com.prakash.dao.PatientDAO;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import com.prakash.modals.Patient;

import java.util.List;

/**
 * Created by kuswaha on 12/15/16.
 */

@Component
@Path("/patients")
@Produces("application/json")
@Consumes("application/json")
public class PatientResource {
    @GET
    public List<Patient> list() {
        return PatientDAO.patients;
    }

    @POST
    public void insert(Patient patient){
        PatientDAO.patients.add(patient);
    }


}
