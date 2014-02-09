package skullMod.lvlEdit.openGL2;

import skullMod.lvlEdit.openGL.GL_listener;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame{
    public static void main(String[] args){
        new TestFrame();
    }

    //FIXME currently a GL3 context is requested, find a "softer" way to get the desired context

    public TestFrame(){
        super("OpenGL test");




        this.setLayout(new BorderLayout());
        this.setSize(100,100);
        this.add(initGL(), BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }

    private GLCanvas initGL() {
        GLProfile glprofile = GLProfile.get(GLProfile.GL3);  //TODO too hard, use softer way
        GLCapabilities glcapabilities = new GLCapabilities( glprofile );
        GLCanvas canvas = new GLCanvas( glcapabilities );
        canvas.setSize(300,300);


        canvas.addGLEventListener(new GL_listener());
        return canvas;
    }
}