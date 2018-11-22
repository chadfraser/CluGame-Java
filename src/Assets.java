import java.awt.image.BufferedImage;

public class Assets {
    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/urchin.png"));
        BufferedImage urchin = sheet.crop(0, 34, 34, 34);
        BufferedImage yellow_urchin = sheet.crop(68, 34, 34, 34);
    }
}
