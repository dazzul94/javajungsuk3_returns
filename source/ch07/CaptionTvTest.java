package source.ch07;

class Tv {
    boolean power;          // 전원상태(on/off)
    int channel;            // 채널

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends Tv {
    boolean caption;        // 캡션상태(on/off)
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, world");
        ctv.caption = true;
        ctv.displayCaption("Hello, world");
    }
}
