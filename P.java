class Ball extends Throwable {
}

public class P {
    P target;

    P(P target) {
        this.target = target;
    }

    void aim(Ball ball) {
        try {
            throw ball;
        } catch (Ball b) {
            target.aim(b);
        }
    }

    public static void main(String[] args) {
        P parent = new P(null);
        P child = new P(parent);
        parent.target = child;
        parent.aim(new Ball());
    }
}