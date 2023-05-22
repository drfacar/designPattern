package structuralDP.proxyDP;

import structuralDP.proxyDP.ImageGenerator;

public class RealImageClass implements ImageGenerator {


    private String fullPath;

    //constructor


    public RealImageClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImageName() {
        System.out.println("Image name displayed ..."+fullPath);
    }

    //
    public void loadImage(){
        System.out.println("image is Loading");
    }

    public void changeImage(){
        System.out.println("image is changed");
    }
}
