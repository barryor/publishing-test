package com.criticalblue.approovsdk;

import com.criticalblue.attestationlibrary.ApproovAttestation;
import com.criticalblue.attestationlibrary.ApproovConfig;

import java.net.MalformedURLException;

/**
 * Created by barryo on 21/12/17.
 */

public class Approov {
    public static ApproovAttestation shared() {
        return ApproovAttestation.shared();
    }

    public static void initialize(ApproovConfig pConfig) throws IllegalArgumentException, MalformedURLException {
        ApproovAttestation.initialize(pConfig);
    }

}
