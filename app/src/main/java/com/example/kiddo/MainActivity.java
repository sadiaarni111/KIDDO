package com.example.kiddo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.ar.core.Anchor;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.rendering.Renderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

public class MainActivity extends AppCompatActivity {

    private ArFragment arFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String check;
        Intent intent= getIntent();
        check= intent.getStringExtra("check");

        arFragment= (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arframent);


            arFragment.setOnTapArPlaneListener(((hitResult, plane, motionEvent) -> {

                Anchor anchor = hitResult.createAnchor();


                if (check.equals("car")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("car.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("tiger")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("Mesh_BengalTiger.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }

                else if (check.equals("fox")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("ArcticFox_Posed.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("door")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("door.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }

                else if (check.equals("police")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("1396 Police Car.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("cannon")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("cannon.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("chair")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("Chair3.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("sofa")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("Chair2.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("cup")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("Coffee Cup_final.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("ufo")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("flying sacuer.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("gas")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("GasStation.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("ladder")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("lader.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("airplane")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("PUSHILIN_Plane.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("rocket")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("rocket.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("frog")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("frog.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }
                else if (check.equals("donut")) {
                    ModelRenderable.builder()

                            .setSource(this, Uri.parse(("model.sfb")))
                            .build()
                            .thenAccept(modelRenderable -> addModelToscene(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage(throwable.getMessage())
                                        .show();
                                return null;
                            });
                }



            }));




    }
   protected void onStop() {

       super.onStop();
       finish();
   }
   protected void onPause() {

       super.onPause();
       finish();
   }

    private void addModelToscene(Anchor anchor, java.lang.Object modelRenderable) {
        AnchorNode anchorNode =new AnchorNode(anchor);
        TransformableNode transformableNode = new TransformableNode(arFragment.getTransformationSystem());
     //   transformableNode.getScaleController().setMinScale(0.09999f);
      //  transformableNode.getScaleController().setMaxScale(0.1000f);

        transformableNode.getScaleController().setMinScale(0.1999f);
        transformableNode.getScaleController().setMaxScale(0.2555f);

        transformableNode.setParent(anchorNode);

        transformableNode.setRenderable((Renderable) modelRenderable);
        arFragment.getArSceneView().getScene().addChild(anchorNode);
        transformableNode.select();
    }

}
