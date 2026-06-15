package com.telefonica.bst3.srv.nuc.pruebagithub;

import com.telefonica.coco.boot.config.Application;
import com.telefonica.coco.boot.config.ApplicationSupport;

@Application
public class PruebaGitHubApplication extends ApplicationSupport {

    public static void main(String[] args) {

        runService(PruebaGitHubApplication.class, args);
    }

}