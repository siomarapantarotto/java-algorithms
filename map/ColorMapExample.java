package map;

import java.util.HashMap;
import java.util.Map;

public class ColorMapExample {
    public static void main(String[] args) {
        Map<String, ColorHandler> colorHandlers = new HashMap<>();
        colorHandlers.put("red", new RedHandler());
        colorHandlers.put("green", new GreenHandler());
        colorHandlers.put("blue", new BlueHandler());

        String colorName = "red"; // could be any of "red", "green", or "blue"
        ColorHandler handler = colorHandlers.get(colorName);
        if (handler != null) {
            handler.handleColor();
        } else {
            System.out.println("No handler for color: " + colorName);
        }
    }
}

interface ColorHandler {
    void handleColor();
}

class RedHandler implements ColorHandler {
    @Override
    public void handleColor() {
        System.out.println("Handling red color");
    }
}

class GreenHandler implements ColorHandler {
    @Override
    public void handleColor() {
        System.out.println("Handling green color");
    }
}

class BlueHandler implements ColorHandler {
    @Override
    public void handleColor() {
        System.out.println("Handling blue color");
    }
}
