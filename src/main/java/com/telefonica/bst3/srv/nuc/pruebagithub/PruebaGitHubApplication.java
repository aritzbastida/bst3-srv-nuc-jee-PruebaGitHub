package com.telefonica.bst3.srv.nuc.pruebagithub;

import com.telefonica.coco.boot.config.BootService;
import com.telefonica.coco.boot.config.BootServiceSupport;

@BootService
public class PruebaGitHubApplication extends BootServiceSupport {

    public static void main(String[] args) {

        runInExecutableMode(PruebaGitHubApplication.class, args);
    }

}
