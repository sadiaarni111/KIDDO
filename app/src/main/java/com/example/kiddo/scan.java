package com.example.kiddo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ar.core.Anchor;
import com.google.ar.core.AugmentedImage;
import com.google.ar.core.AugmentedImageDatabase;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.FrameTime;
import com.google.ar.sceneform.Node;
import com.google.ar.sceneform.Scene;
import com.google.ar.sceneform.Sun;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.TransformableNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class scan extends AppCompatActivity implements Scene.OnUpdateListener{

    private  customarfragment arfragment;
    boolean isplaced= false,isplaced2=false;
    TextView tx;
    AnchorNode anchorNode;
    List<AnchorNode> an= new ArrayList<AnchorNode>() ;

    boolean a = false;
    boolean b = false;
    boolean c = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    boolean o = false;
    boolean p = false;
    boolean q = false;
    boolean r = false;
    boolean s = false;
    boolean t = false;
    boolean u = false;
    boolean v = false;
    boolean w = false;
    boolean x = false;
    boolean y = false;
    boolean z = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        arfragment= (customarfragment) getSupportFragmentManager().findFragmentById(R.id.frament);
        arfragment.getArSceneView().getScene().addOnUpdateListener(this);


        arfragment.getPlaneDiscoveryController().hide();
        arfragment.getPlaneDiscoveryController().setInstructionView(null);
        arfragment.getArSceneView().getPlaneRenderer().setEnabled(false);



    }
    public  void loadDB(Session session, Config config)
    {

        InputStream dsstream = getResources().openRawResource(R.raw.imagedb);

        try {
            AugmentedImageDatabase aid =AugmentedImageDatabase.deserialize(session,dsstream);
            config.setAugmentedImageDatabase(aid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void onUpdate(FrameTime frameTime) {


        Frame frame = arfragment.getArSceneView().getArFrame();
        Collection<AugmentedImage> images= frame.getUpdatedTrackables(AugmentedImage.class);


        for(AugmentedImage image: images)
        {
            if(image.getTrackingMethod() == AugmentedImage.TrackingMethod.FULL_TRACKING)
            {





                if(image.getName().equals("c.jpg"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();


                    if(c==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        cat(anchor);


                    }

                }

                if(image.getName().equals("a.jpg"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();


                    if(a==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                       apple(anchor);


                    }

                }
                if(image.getName().equals("b.jpg"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(b==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        Basketball(anchor);


                    }

                }
                if(image.getName().equals("d.jpg"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(d==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        duck(anchor);


                    }

                }
                if(image.getName().equals("e.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(e==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        egg(anchor);


                    }

                }
                if(image.getName().equals("f.jpg"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(f==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        fish(anchor);


                    }

                }
                if(image.getName().equals("g.jpg"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(g==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        Giraffe(anchor);


                    }

                }
                if(image.getName().equals("h.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();
                  //  Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();


                    if(h==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        home(anchor);


                    }

                }
                if(image.getName().equals("i.jpg"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(i==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                       icecream(anchor);


                    }

                }
                if(image.getName().equals("j.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(j==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        jug(anchor);


                    }

                }
                if(image.getName().equals("k.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(k==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        kite(anchor);


                    }

                }
                if(image.getName().equals("l.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(l==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        lolipop(anchor);


                    }

                }
                if(image.getName().equals("m.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(m==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        monkey(anchor);


                    }

                }
                if(image.getName().equals("n.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(n==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        nest(anchor);


                    }

                }
                if(image.getName().equals("o.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(o==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        orange(anchor);


                    }

                }
                if(image.getName().equals("p.jpg"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(p==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        pencil(anchor);


                    }

                }
                if(image.getName().equals("q.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(q==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        quail(anchor);


                    }

                }
                if(image.getName().equals("r.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(r==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        rainbow(anchor);


                    }

                }
                if(image.getName().equals("s.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(s==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        star(anchor);


                    }

                }
                if(image.getName().equals("t.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(t==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        tree(anchor);


                    }

                }
                if(image.getName().equals("u.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(u==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        umbrella(anchor);


                    }

                }
                if(image.getName().equals("v.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(v==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        vase(anchor);


                    }

                }
                if(image.getName().equals("w.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(w==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        watch(anchor);


                    }

                }
                if(image.getName().equals("x.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(x==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        xylophone(anchor);


                    }

                }
                if(image.getName().equals("y.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(y==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        yatch(anchor);


                    }

                }
                if(image.getName().equals("z.png"))
                {


                    // Toast.makeText(this,"gotch s",Toast.LENGTH_SHORT).show();

                    if(z==false)
                    {



                        Anchor anchor = image.createAnchor(image.getCenterPose());
                        if(!an.isEmpty()) {
                            //   arfragment.getArSceneView().getScene().removeChild(an.get(0));
                        }


                        List<Node> children = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());



                        removePreviousAnchors();
                        zebra(anchor);


                    }

                }




            }


        }

    }

    private void cat(Anchor anchor) {

        a = false;
        b = false;
        c = true;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Cat.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }

    private void apple(Anchor anchor) {

        isplaced=true;
        isplaced2=false;
        a = true;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Apple.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage(throwable.getMessage())
                    .show();

            return null;
        });
    }
    private void Basketball(Anchor anchor) {

        isplaced2=true;
        isplaced=false;
        a = false;
        b = true;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Basketball.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;

                });
    }

    private void duck(Anchor anchor) {


        a = false;
        b = false;
        c = false;
        d = true;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Duck.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void egg(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = true;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("egg.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void fish(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = true;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("fish.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void Giraffe(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = true;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Giraffe.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void home(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = true;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;

        ModelRenderable.builder()
                .setSource(this, Uri.parse("home.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void icecream(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = true;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Ice Cream.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }

    private void jug(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = true;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("jug.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void kite(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = true;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Kite.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void lolipop(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = true;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("lolipop.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }

    private void monkey(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = true;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("monkey.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void nest(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = true;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("nest.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void orange(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = true;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Orange.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void pencil(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = true;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("pencil.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }

    private void quail(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = true;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("quail.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }

    private void rainbow(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = true;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("rainbow.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void star(Anchor anchor) {


        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = true;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("star.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void tree(Anchor anchor) {


        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = true;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("tree.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void umbrella(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = true;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("umbrella.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }

    private void vase(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = true;
        w = false;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("vase.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void watch(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = true;
        x = false;
        y = false;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("watch.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void xylophone(Anchor anchor) {


        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = true;
        y = false;
        z = false;;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("xylophone.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }

    private void yatch(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = true;
        z = false;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("yatch.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }
    private void zebra(Anchor anchor) {

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = true;;
        ModelRenderable.builder()
                .setSource(this, Uri.parse("Zebra.sfb"))
                .build()
                .thenAccept(modelRenderable -> {
                    try {
                        placeModel(modelRenderable,anchor);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder= new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage())
                            .show();

                    return null;
                });
    }


        private void placeModel(ModelRenderable modelRenderable, Anchor anchor) throws InterruptedException {



         anchorNode = new AnchorNode(anchor);
         //new
            anchorNode.setParent(arfragment.getArSceneView().getScene());
            TransformableNode node = new TransformableNode(arfragment.getTransformationSystem());
            node.getScaleController().setMaxScale(0.09f);
            node.getScaleController().setMinScale(0.08f);

            node.setParent(anchorNode);
            node.setRenderable(modelRenderable);
            node.select();
//new finish

         /*   anchorNode.setRenderable(modelRenderable);
            arfragment.getArSceneView().getScene().addChild(anchorNode);
            an.add(anchorNode);*/





      //  Toast.makeText(this,"gotch",Toast.LENGTH_SHORT).show();

    }
    private void removePreviousAnchors()
    {
        List<Node> nodeList = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());
        for (Node childNode : nodeList)
        { if (childNode instanceof AnchorNode)
        {
            if (((AnchorNode) childNode).getAnchor() != null)
            {
                ((AnchorNode) childNode).getAnchor().detach();

                ((AnchorNode) childNode).setParent(null); } } } }




                public void remove(View v)
                {

                    List<Node> nodeList = new ArrayList<>(arfragment.getArSceneView().getScene().getChildren());
                    for (Node childNode : nodeList)
                    { if (childNode instanceof AnchorNode)
                    {
                        if (((AnchorNode) childNode).getAnchor() != null)
                        {
                            ((AnchorNode) childNode).getAnchor().detach();

                            ((AnchorNode) childNode).setParent(null); } } }

                    a = false;
                    b = false;
                    c = false;
                    d = false;
                    e = false;
                    f = false;
                    g = false;
                    h = false;
                    i = false;
                    j = false;
                    k = false;
                    l = false;
                    m = false;
                    n = false;
                    o = false;
                    p = false;
                    q = false;
                    r = false;
                    s = false;
                    t = false;
                    u = false;
                    y = false;
                    w = false;
                    x = false;
                    y = false;
                    z = false;
                }


    //  Toast.makeText(this,"gotch",Toast.LENGTH_SHORT).show();

}





