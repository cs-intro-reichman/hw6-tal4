import java.awt.Color;
/*
 * morphing into grayscale veesion of the picture.
 */
public class Editor4 {
    public static void main(String[] args) {
        String fileName = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] source = Runigram.read(fileName);
        Color[][] gray = Runigram.grayScaled(source);
        Runigram.setCanvas(source);
        Runigram.morph(source, gray, n);
    }
}
