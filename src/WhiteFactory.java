/**
 * @author Yurii Malikov
 */
public class WhiteFactory extends BaseFactory {

    @Override
    Circle createCircle() {
        return new WhiteCircle();
    }

    @Override
    Triangle createTriangle() {
        return new WhiteTriangle();
    }
}
