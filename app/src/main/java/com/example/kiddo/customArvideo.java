package com.example.kiddo;

import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.sceneform.ux.ArFragment;

public class customArvideo extends ArFragment {
    @Override
    protected Config getSessionConfiguration(Session session) {

        Config config = new Config(session);
        config.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
        config.setFocusMode(Config.FocusMode.AUTO);
        session.configure(config);


        ((Sound_Activity)getActivity()).loadDB(session,config);
        this.getArSceneView().setupSession(session);


        //((scan)getActivity()).setupDatabase(config,session);

        return  config;

    }


    /* protected Config getSessionConfiguration(Session session) {

        Config config = new Config(session);
        config.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
        config.setFocusMode(Config.FocusMode.AUTO);
        session.configure(config);


        ((scan)getActivity()).loadDB(session,config);
        this.getArSceneView().setupSession(session);


        //((scan)getActivity()).setupDatabase(config,session);

        return  config;



    }*/
}
