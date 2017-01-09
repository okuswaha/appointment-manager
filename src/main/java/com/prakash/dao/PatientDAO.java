package com.prakash.dao;

import com.prakash.modals.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by okuswaha on 1/9/2017.
 */
public class PatientDAO {
    public static List<Patient> patients = new ArrayList<Patient>();
    static {
        Patient patient1 = new Patient("Harsha","vardhan");
        patients.add(patient1);
    }
}
